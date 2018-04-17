package com.example.edison.tdd;

import android.app.Application;

/**
 * Created by edison on 2018/4/16.
 */

public class MyApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        AppComponent appComponent=DaggerAppComponent
                .builder()
                .appModule(new AppModule())
                .build();
        ComponentHolder.setsAppComponent(appComponent);
    }
}
