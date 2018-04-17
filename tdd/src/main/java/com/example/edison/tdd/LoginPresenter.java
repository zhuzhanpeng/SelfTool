package com.example.edison.tdd;

/**
 * Created by edison on 2018/4/16.
 */

public class LoginPresenter {
    private UserManager userManager;
    private PasswordValidator mPasswordValidator;

    public LoginPresenter(PasswordValidator validator,UserManager userManager){
        this.mPasswordValidator=validator;
        this.userManager=userManager;
    }

    public void login(String userName,String pwd){
        if(!mPasswordValidator.verifyPassword(pwd)){
            return;
        }
        userManager.login(userName,pwd);

    }

    public void setUserManager(UserManager userManager){
        this.userManager=userManager;
    }

    public void setmPasswordValidator(PasswordValidator passwordValidator){
        this.mPasswordValidator=passwordValidator;
    }
}
