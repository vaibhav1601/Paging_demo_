package com.demo.paging.utils;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class ExtensionAttributesResponse {
    @SerializedName("final_price")
    @Expose
    private Double finalPrice;
    @SerializedName("base_margin")
    @Expose
    private String baseMargin;
    @SerializedName("website_ids")
    @Expose
    private List<Integer> websiteIds = null;
    @SerializedName("category_links")
    @Expose
    private List<CategoryLinkResponse> categoryLinks = null;
    @SerializedName("bundle_product_options")
    @Expose
    private List<BundleProductOptionResponse> bundleProductOptions = null;

    @SerializedName("offers")
    @Expose
    private List<Offers> offers = null;
    @SerializedName("is_product_in_wishlist")
    @Expose
    private boolean isProductInWishlist;

    public List<Integer> getWebsiteIds() {
        return websiteIds;
    }

    public void setWebsiteIds(List<Integer> websiteIds) {
        this.websiteIds = websiteIds;
    }

    public List<CategoryLinkResponse> getCategoryLinks() {
        return categoryLinks;
    }

    public void setCategoryLinks(List<CategoryLinkResponse> categoryLinks) {
        this.categoryLinks = categoryLinks;
    }

    public List<BundleProductOptionResponse> getBundleProductOptions() {
        return bundleProductOptions;
    }

    public void setBundleProductOptions(List<BundleProductOptionResponse> bundleProductOptions) {
        this.bundleProductOptions = bundleProductOptions;
    }

    public List<Offers> getOffers() {
        return offers;
    }

    public void setOffers(List<Offers> offers) {
        this.offers = offers;
    }

    public Double getFinalPrice() {
        return finalPrice;
    }

    public void setFinalPrice(Double finalPrice) {
        this.finalPrice = finalPrice;
    }

    public String getBaseMargin() {
        return baseMargin;
    }

    public void setBaseMargin(String baseMargin) {
        this.baseMargin = baseMargin;
    }

    public boolean getProductInWishlist() {
        return isProductInWishlist;
    }

    public void setProductInWishlist(boolean productInWishlist) {
        isProductInWishlist = productInWishlist;
    }
}
