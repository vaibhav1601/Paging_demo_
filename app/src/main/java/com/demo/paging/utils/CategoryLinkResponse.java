package com.demo.paging.utils;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class CategoryLinkResponse {
    @SerializedName("position")
    @Expose
    private int position;
    @SerializedName("category_id")
    @Expose
    private String categoryId;

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public String getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(String categoryId) {
        this.categoryId = categoryId;
    }

}
