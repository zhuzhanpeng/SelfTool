package com.example.edison.tdd;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import javax.inject.Inject;

public class LoginActivity extends Activity {
    private EditText etUserName;
    private EditText etPwd;
    @Inject
    public LoginPresenter loginPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        ComponentHolder.getsAppComponent().inject(this);
        etUserName = findViewById(R.id.etUserName);
        etPwd = findViewById(R.id.etPwd);
    }


    public void login(View view) {

        String userName = etUserName.getEditableText().toString().trim();
        String pwd = etPwd.getEditableText().toString().trim();
        loginPresenter.login(userName,pwd);
    }
}
