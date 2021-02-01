package com.demo.paging.utils;

import android.support.annotation.NonNull;
import android.support.v7.util.DiffUtil;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class SearchProductItemResponse {

    @SerializedName("id")
    @Expose
    private int id;
    @SerializedName("sku")
    @Expose
    private String sku;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("attribute_set_id")
    @Expose
    private int attributeSetId;
    @SerializedName("price")
    @Expose
    private double price;
    @SerializedName("status")
    @Expose
    private int status;
    @SerializedName("visibility")
    @Expose
    private int visibility;
    @SerializedName("type_id")
    @Expose
    private String typeId;
    @SerializedName("created_at")
    @Expose
    private String createdAt;
    @SerializedName("updated_at")
    @Expose
    private String updatedAt;
    @SerializedName("extension_attributes")
    @Expose
    private ExtensionAttributesResponse extensionAttributes;
    @SerializedName("product_links")
    @Expose
    private List<ProductLink_Response> productLinks = null;
    @SerializedName("options")
    @Expose
    private List<OptionResponse> options = null;
    @SerializedName("media_gallery_entries")
    @Expose
    private List<MediaGalleryEntryResponse> mediaGalleryEntries = null;
    @SerializedName("tier_prices")
    @Expose
    private List<Object> tierPrices = null;
    @SerializedName("custom_attributes")
    @Expose
    private List<CustomAttributeResponse> customAttributes = null;
    @SerializedName("weight")
    @Expose
    private double weight;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAttributeSetId() {
        return attributeSetId;
    }

    public void setAttributeSetId(int attributeSetId) {
        this.attributeSetId = attributeSetId;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public int getVisibility() {
        return visibility;
    }

    public void setVisibility(int visibility) {
        this.visibility = visibility;
    }

    public String getTypeId() {
        return typeId;
    }

    public void setTypeId(String typeId) {
        this.typeId = typeId;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    public ExtensionAttributesResponse getExtensionAttributes() {
        return extensionAttributes;
    }

    public void setExtensionAttributes(ExtensionAttributesResponse extensionAttributes) {
        this.extensionAttributes = extensionAttributes;
    }

    public List<ProductLink_Response> getProductLinks() {
        return productLinks;
    }

    public void setProductLinks(List<ProductLink_Response> productLinks) {
        this.productLinks = productLinks;
    }

    public List<OptionResponse> getOptions() {
        return options;
    }

    public void setOptions(List<OptionResponse> options) {
        this.options = options;
    }

    public List<MediaGalleryEntryResponse> getMediaGalleryEntries() {
        return mediaGalleryEntries;
    }

    public void setMediaGalleryEntries(List<MediaGalleryEntryResponse> mediaGalleryEntries) {
        this.mediaGalleryEntries = mediaGalleryEntries;
    }

    public List<Object> getTierPrices() {
        return tierPrices;
    }

    public void setTierPrices(List<Object> tierPrices) {
        this.tierPrices = tierPrices;
    }

    public List<CustomAttributeResponse> getCustomAttributes() {
        return customAttributes;
    }

    public void setCustomAttributes(List<CustomAttributeResponse> customAttributes) {
        this.customAttributes = customAttributes;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }


    public static DiffUtil.ItemCallback<SearchProductItemResponse> DIFF_CALLBACK = new DiffUtil.ItemCallback<SearchProductItemResponse>() {
        @Override
        public boolean areItemsTheSame(@NonNull SearchProductItemResponse oldItem, @NonNull SearchProductItemResponse newItem) {
            return oldItem.name.equals(newItem.name);
        }

        @Override
        public boolean areContentsTheSame(SearchProductItemResponse oldItem, SearchProductItemResponse newItem) {
            return oldItem.name.equals(newItem.name);
        }


    };


}
