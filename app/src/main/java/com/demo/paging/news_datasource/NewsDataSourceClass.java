package com.demo.paging.news_datasource;

import android.annotation.SuppressLint;
import android.arch.lifecycle.MutableLiveData;
import android.arch.paging.PageKeyedDataSource;
import android.support.annotation.NonNull;

import com.demo.paging.utils.Constant;
import com.demo.paging.utils.Repository;
import com.demo.paging.utils.SearchProductItemResponse;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;


import io.reactivex.disposables.CompositeDisposable;


public class NewsDataSourceClass extends PageKeyedDataSource<Integer, SearchProductItemResponse> {

    private Repository repository;
    private Gson gson;
    private int sourceIndex;
    private MutableLiveData<String> progressLiveStatus;
    private CompositeDisposable compositeDisposable;

    NewsDataSourceClass(Repository repository, CompositeDisposable compositeDisposable) {
        this.repository = repository;
        this.compositeDisposable = compositeDisposable;
        progressLiveStatus = new MutableLiveData<>();
        GsonBuilder builder =
                new GsonBuilder().setFieldNamingPolicy(FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES);
        gson = builder.setLenient().create();
    }


    public MutableLiveData<String> getProgressLiveStatus() {
        return progressLiveStatus;
    }

    @Override
    public void loadInitial(@NonNull LoadInitialParams<Integer> params, @NonNull LoadInitialCallback<Integer, SearchProductItemResponse> callback) {

        repository.executeNewsApi("delhi_store_view",sourceIndex)
                .doOnSubscribe(disposable -> {
                    compositeDisposable.add(disposable);
                    progressLiveStatus.postValue(Constant.LOADING);
                }).subscribe(searchProductResponse -> {

                    progressLiveStatus.postValue(Constant.LOADED);

                    int previous =sourceIndex;

                    sourceIndex++;
                    callback.onResult(searchProductResponse.getItems(), null, sourceIndex);


                },
                throwable ->
                        progressLiveStatus.postValue(Constant.LOADED)

        );


    }

    @Override
    public void loadBefore(@NonNull LoadParams<Integer> params, @NonNull LoadCallback<Integer, SearchProductItemResponse> callback) {

    }

    @Override
    public void loadAfter(@NonNull LoadParams<Integer> params, @NonNull LoadCallback<Integer, SearchProductItemResponse> callback) {

        repository.executeNewsApi("delhi_store_view",params.key)
                .doOnSubscribe(disposable -> {
                    compositeDisposable.add(disposable);
                    progressLiveStatus.postValue(Constant.LOADING);
                }).subscribe(searchProductResponse -> {

                    progressLiveStatus.postValue(Constant.LOADED);


                    callback.onResult(searchProductResponse.getItems(), params.key == 3 ? null : params.key + 1);


                },
                throwable ->
                        progressLiveStatus.postValue(Constant.LOADED)

        );


    }

  /*  @SuppressLint("CheckResult")
    @Override
    public void loadInitial(@NonNull LoadInitialParams<Integer> params, @NonNull LoadInitialCallback<Integer, NewsModelClass> callback) {

        repository.executeNewsApi(sourceIndex)
                .doOnSubscribe(disposable ->
                {
                    compositeDisposable.add(disposable);
                    progressLiveStatus.postValue(Constant.LOADING);
                })
                .subscribe(
                        (JsonElement result) ->
                        {
                            progressLiveStatus.postValue(Constant.LOADED);

                            JSONObject object = new JSONObject(gson.toJson(result));
                            JSONArray array = object.getJSONArray("articles");

                            ArrayList<NewsModelClass> arrayList = new ArrayList<>();

                            for (int i = 0; i < array.length(); i++) {
                                arrayList.add(new NewsModelClass(array.getJSONObject(i).optString("title"),
                                        array.getJSONObject(i).optString("urlToImage")));
                            }

                            sourceIndex++;
                            callback.onResult(arrayList, null, sourceIndex);
                        },
                        throwable ->
                                progressLiveStatus.postValue(Constant.LOADED)

                );

    }

    @Override
    public void loadBefore(@NonNull LoadParams<Integer> params, @NonNull LoadCallback<Integer, NewsModelClass> callback) {

    }

    @SuppressLint("CheckResult")
    @Override
    public void loadAfter(@NonNull LoadParams<Integer> params, @NonNull LoadCallback<Integer, NewsModelClass> callback) {

        repository.executeNewsApi(params.key)
                .doOnSubscribe(disposable ->
                {
                    compositeDisposable.add(disposable);
                    progressLiveStatus.postValue(Constant.LOADING);
                })
                .subscribe(
                        (JsonElement result) ->
                        {
                            progressLiveStatus.postValue(Constant.LOADED);

                            JSONObject object = new JSONObject(gson.toJson(result));
                            JSONArray array = object.getJSONArray("articles");

                            ArrayList<NewsModelClass> arrayList = new ArrayList<>();

                            for (int i = 0; i < array.length(); i++) {
                                arrayList.add(new NewsModelClass(array.getJSONObject(i).optString("title"),
                                        array.getJSONObject(i).optString("urlToImage")));
                            }

                            callback.onResult(arrayList, params.key == 3 ? null : params.key + 1);

                        },
                        throwable ->
                                progressLiveStatus.postValue(Constant.LOADED)
                );
    }*/
}
