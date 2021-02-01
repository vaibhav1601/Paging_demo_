package com.demo.paging;

import android.app.Application;
import android.content.Context;

import com.demo.paging.di.AppComponent;
import com.demo.paging.di.DaggerAppComponent;
import com.demo.paging.di.UtilsModule;
import com.facebook.drawee.backends.pipeline.Fresco;






public class MyApplication extends Application {
    AppComponent appComponent;
    Context context;

    @Override
    public void onCreate() {
        super.onCreate();
        context = this;
        appComponent = DaggerAppComponent.builder().utilsModule(new UtilsModule()).build();
        Fresco.initialize(this);
    }

    public AppComponent getAppComponent() {
        return appComponent;
    }

    @Override
    protected void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }
}
