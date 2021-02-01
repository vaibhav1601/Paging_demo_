package com.demo.paging.news_datasource;

import android.arch.lifecycle.MutableLiveData;
import android.arch.paging.DataSource;

import com.demo.paging.utils.Repository;
import com.demo.paging.utils.SearchProductItemResponse;

import io.reactivex.disposables.CompositeDisposable;



public class NewsDataSourceFactory extends DataSource.Factory<Integer, SearchProductItemResponse> {

    private MutableLiveData<NewsDataSourceClass> liveData;
    private Repository repository;
    private CompositeDisposable compositeDisposable;

    public NewsDataSourceFactory(Repository repository, CompositeDisposable compositeDisposable) {
        this.repository = repository;
        this.compositeDisposable = compositeDisposable;
        liveData = new MutableLiveData<>();
    }

    public MutableLiveData<NewsDataSourceClass> getMutableLiveData() {
        return liveData;
    }

    @Override
    public DataSource<Integer, SearchProductItemResponse> create() {
        NewsDataSourceClass dataSourceClass = new NewsDataSourceClass(repository, compositeDisposable);
        liveData.postValue(dataSourceClass);
        return dataSourceClass;
    }
}
