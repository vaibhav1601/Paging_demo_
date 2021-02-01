package com.demo.paging.utils;

import io.reactivex.Observable;


public class Repository {

    ApiCallInterface apiCallInterface;

    public Repository(ApiCallInterface apiCallInterface) {
        this.apiCallInterface = apiCallInterface;
    }

    /*
     * method to call news api
     * */
    public Observable<SearchProductResponse> executeNewsApi(String StoreView, int currentPage) {
        return apiCallInterface.fetchListNews(StoreView, currentPage, 60, "name", "asc");
    }

}
