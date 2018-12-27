package com.example.edison.tdd;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by edison on 2018/4/16.
 */
@Module
public class AppModule {
    @Singleton
    @Provides
    public LoginPresenter createLoginPresenter(PasswordValidator validator,UserManager userManager){
        return new LoginPresenter(validator,userManager);
    }

    @Provides
    public PasswordValidator createPasswordValidator(){
        return new PasswordValidator();
    }

    @Provides
    public UserManager createUserManager(){
        return new UserManager();
    }

}
