package com.demo.paging.utils;

import com.google.gson.JsonElement;

import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;


public interface ApiCallInterface {

    @GET("/rest/{storeViewCode}/V1/products")
    Observable<SearchProductResponse> fetchListNews(@Path("storeViewCode") String storeViewCode,
                                                    @Query("searchCriteria[currentPage]") int currentPage,
                                                    @Query("searchCriteria[pageSize]") int pageSize,
                                                    @Query("searchCriteria[sortOrders][field]") String name,
                                                    @Query("searchCriteria[sortOrders][direction]") String order);

}
