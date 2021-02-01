package com.demo.paging.utils;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ProductLinkResponse {
    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("sku")
    @Expose
    private String sku;
    @SerializedName("option_id")
    @Expose
    private int optionId;
    @SerializedName("qty")
    @Expose
    private int qty;
    @SerializedName("position")
    @Expose
    private int position;
    @SerializedName("is_default")
    @Expose
    private boolean isDefault;
    @SerializedName("price")
    @Expose
    private int price;
    @SerializedName("price_type")
    @Expose
    private int priceType;
    @SerializedName("can_change_quantity")
    @Expose
    private int canChangeQuantity;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }

    public int getOptionId() {
        return optionId;
    }

    public void setOptionId(int optionId) {
        this.optionId = optionId;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public boolean isIsDefault() {
        return isDefault;
    }

    public void setIsDefault(boolean isDefault) {
        this.isDefault = isDefault;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getPriceType() {
        return priceType;
    }

    public void setPriceType(int priceType) {
        this.priceType = priceType;
    }

    public int getCanChangeQuantity() {
        return canChangeQuantity;
    }

    public void setCanChangeQuantity(int canChangeQuantity) {
        this.canChangeQuantity = canChangeQuantity;
    }
}
