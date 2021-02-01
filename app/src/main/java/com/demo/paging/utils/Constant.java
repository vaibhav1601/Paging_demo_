package com.demo.paging.utils;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;



public class Constant {

    public final static String LOADING = "Loading";
    public final static String LOADED = "Loaded";
    public final static String CHECK_NETWORK_ERROR = "Check your network connection.";
    public final static String API_KEY = "6c9ef86d91314d6985d1df4bb55733d7";//put your api_key generate it from "https://newsapi.org/docs"
    public static final String sources[] = {"bbc-news", "abc-news-au", "bloomberg", "cnbc"};

    public static final String adminToken = "xseqdzlvi1uzy7dackd8r2vmrhu3zvm1";

    public static boolean checkInternetConnection(Context context) {
        ConnectivityManager connectivity = (ConnectivityManager) context
                .getSystemService(Context.CONNECTIVITY_SERVICE);
        if (connectivity == null) {
            return false;
        } else {
            NetworkInfo[] info = connectivity.getAllNetworkInfo();
            if (info != null) {
                for (NetworkInfo anInfo : info) {
                    if (anInfo.getState() == NetworkInfo.State.CONNECTED) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

}
