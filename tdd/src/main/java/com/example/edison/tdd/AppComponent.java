package com.example.edison.tdd;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by edison on 2018/4/16.
 */
@Singleton
@Component(modules = {AppModule.class})
public interface AppComponent {
    void inject(LoginActivity loginActivity);  //<=

}
