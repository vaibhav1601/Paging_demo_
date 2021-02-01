package com.demo.paging.utils;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class SearchProductResponse {
    @SerializedName("items")
    @Expose
    private List<SearchProductItemResponse> items = null;
    @SerializedName("search_criteria")
    @Expose
    private SearchCriteriaResponse searchCriteria;
    @SerializedName("total_count")
    @Expose
    private int totalCount;

    public List<SearchProductItemResponse> getItems() {
        return items;
    }

    public void setItems(List<SearchProductItemResponse> items) {
        this.items = items;
    }

    public SearchCriteriaResponse getSearchCriteria() {
        return searchCriteria;
    }

    public void setSearchCriteria(SearchCriteriaResponse searchCriteria) {
        this.searchCriteria = searchCriteria;
    }

    public int getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(int totalCount) {
        this.totalCount = totalCount;
    }

}
