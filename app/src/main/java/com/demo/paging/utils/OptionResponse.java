package com.demo.paging.utils;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class OptionResponse {
    @SerializedName("product_sku")
    @Expose
    private String productSku;
    @SerializedName("option_id")
    @Expose
    private int optionId;
    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("type")
    @Expose
    private String type;
    @SerializedName("sort_order")
    @Expose
    private int sortOrder;
    @SerializedName("is_require")
    @Expose
    private boolean isRequire;
    @SerializedName("sku")
    @Expose
    private String sku;
    @SerializedName("max_characters")
    @Expose
    private int maxCharacters;
    @SerializedName("image_size_x")
    @Expose
    private int imageSizeX;
    @SerializedName("image_size_y")
    @Expose
    private int imageSizeY;
    @SerializedName("values")
    @Expose
    private List<ValueResponse> values = null;

    public String getProductSku() {
        return productSku;
    }

    public void setProductSku(String productSku) {
        this.productSku = productSku;
    }

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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getSortOrder() {
        return sortOrder;
    }

    public void setSortOrder(int sortOrder) {
        this.sortOrder = sortOrder;
    }

    public boolean isIsRequire() {
        return isRequire;
    }

    public void setIsRequire(boolean isRequire) {
        this.isRequire = isRequire;
    }

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }

    public int getMaxCharacters() {
        return maxCharacters;
    }

    public void setMaxCharacters(int maxCharacters) {
        this.maxCharacters = maxCharacters;
    }

    public int getImageSizeX() {
        return imageSizeX;
    }

    public void setImageSizeX(int imageSizeX) {
        this.imageSizeX = imageSizeX;
    }

    public int getImageSizeY() {
        return imageSizeY;
    }

    public void setImageSizeY(int imageSizeY) {
        this.imageSizeY = imageSizeY;
    }

    public List<ValueResponse> getValues() {
        return values;
    }

    public void setValues(List<ValueResponse> values) {
        this.values = values;
    }

}
