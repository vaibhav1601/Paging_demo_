package com.demo.paging.utils;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class MediaGalleryEntryResponse {
    @SerializedName("id")
    @Expose
    private int id;
    @SerializedName("media_type")
    @Expose
    private String mediaType;
    @SerializedName("label")
    @Expose
    private Object label;
    @SerializedName("position")
    @Expose
    private int position;
    @SerializedName("disabled")
    @Expose
    private boolean disabled;
    @SerializedName("types")
    @Expose
    private List<String> types = null;
    @SerializedName("file")
    @Expose
    private String file;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMediaType() {
        return mediaType;
    }

    public void setMediaType(String mediaType) {
        this.mediaType = mediaType;
    }

    public Object getLabel() {
        return label;
    }

    public void setLabel(Object label) {
        this.label = label;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public boolean isDisabled() {
        return disabled;
    }

    public void setDisabled(boolean disabled) {
        this.disabled = disabled;
    }

    public List<String> getTypes() {
        return types;
    }

    public void setTypes(List<String> types) {
        this.types = types;
    }

    public String getFile() {
        return file;
    }

    public void setFile(String file) {
        this.file = file;
    }

}
