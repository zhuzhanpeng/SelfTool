package com.example.edison.tdd;

/**
 * Created by edison on 2018/4/16.
 */

public class ComponentHolder {
    private static AppComponent sAppComponent;

    public static void setsAppComponent(AppComponent appComponent){
        sAppComponent=appComponent;
    }

    public static AppComponent getsAppComponent(){
        return sAppComponent;
    }
}
