package com.demo.paging.ui;

import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.Transformations;
import android.arch.lifecycle.ViewModel;
import android.arch.paging.LivePagedListBuilder;
import android.arch.paging.PagedList;


import com.demo.paging.news_datasource.NewsDataSourceClass;
import com.demo.paging.news_datasource.NewsDataSourceFactory;
import com.demo.paging.utils.Repository;
import com.demo.paging.utils.SearchProductItemResponse;


import io.reactivex.disposables.CompositeDisposable;


public class PagingLibViewModel extends ViewModel {

    private NewsDataSourceFactory newsDataSourceFactory;
    private LiveData<PagedList<SearchProductItemResponse>> listLiveData;

    private LiveData<String> progressLoadStatus = new MutableLiveData<>();
    private CompositeDisposable compositeDisposable = new CompositeDisposable();

    public PagingLibViewModel(Repository repository) {
        newsDataSourceFactory = new NewsDataSourceFactory(repository, compositeDisposable);
        initializePaging();
    }


    private void initializePaging() {

        PagedList.Config pagedListConfig =
                new PagedList.Config.Builder()
                        .setEnablePlaceholders(true)
                        .setInitialLoadSizeHint(10)
                        .setPageSize(5).build();

        listLiveData = new LivePagedListBuilder<>(newsDataSourceFactory, pagedListConfig)
                .build();

        progressLoadStatus = Transformations.switchMap(newsDataSourceFactory.getMutableLiveData(), NewsDataSourceClass ::getProgressLiveStatus);

    }

    public LiveData<String> getProgressLoadStatus() {
        return progressLoadStatus;
    }

    public LiveData<PagedList<SearchProductItemResponse>> getListLiveData() {
        return listLiveData;
    }

    @Override
    protected void onCleared() {
        super.onCleared();
        compositeDisposable.clear();
    }
}