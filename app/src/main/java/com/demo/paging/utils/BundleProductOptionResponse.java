package com.demo.paging.utils;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class BundleProductOptionResponse {
    @SerializedName("option_id")
    @Expose
    private int optionId;
    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("required")
    @Expose
    private boolean required;
    @SerializedName("type")
    @Expose
    private String type;
    @SerializedName("position")
    @Expose
    private int position;
    @SerializedName("sku")
    @Expose
    private String sku;
    @SerializedName("product_links")
    @Expose
    private List<ProductLinkResponse> productLinks = null;

    public int getOptionId() {
        return optionId;
    }

    public void setOptionId(int optionId) {
        this.optionId = optionId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean isRequired() {
        return required;
    }

    public void setRequired(boolean required) {
        this.required = required;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }

    public List<ProductLinkResponse> getProductLinks() {
        return productLinks;
    }

    public void setProductLinks(List<ProductLinkResponse> productLinks) {
        this.productLinks = productLinks;
    }
}
