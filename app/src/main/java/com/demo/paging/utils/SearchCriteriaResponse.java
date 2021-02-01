package com.demo.paging.utils;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class SearchCriteriaResponse {

    @SerializedName("filter_groups")
    @Expose
    private List<Object> filterGroups = null;
    @SerializedName("page_size")
    @Expose
    private int pageSize;

    public List<Object> getFilterGroups() {
        return filterGroups;
    }

    public void setFilterGroups(List<Object> filterGroups) {
        this.filterGroups = filterGroups;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

}
