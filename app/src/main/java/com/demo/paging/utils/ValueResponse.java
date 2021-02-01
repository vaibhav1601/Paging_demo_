package com.demo.paging.utils;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ValueResponse {
    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("sort_order")
    @Expose
    private int sortOrder;
    @SerializedName("price")
    @Expose
    private int price;
    @SerializedName("price_type")
    @Expose
    private String priceType;
    @SerializedName("sku")
    @Expose
    private String sku;
    @SerializedName("option_type_id")
    @Expose
    private int optionTypeId;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getSortOrder() {
        return sortOrder;
    }

    public void setSortOrder(int sortOrder) {
        this.sortOrder = sortOrder;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getPriceType() {
        return priceType;
    }

    public void setPriceType(String priceType) {
        this.priceType = priceType;
    }

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }

    public int getOptionTypeId() {
        return optionTypeId;
    }

    public void setOptionTypeId(int optionTypeId) {
        this.optionTypeId = optionTypeId;
    }
}
