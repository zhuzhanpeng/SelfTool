package com.example.edison.tdd.test;

import android.content.Intent;
import android.widget.Button;
import android.widget.EditText;

import com.example.edison.tdd.AppComponent;
import com.example.edison.tdd.AppModule;
import com.example.edison.tdd.BuildConfig;
import com.example.edison.tdd.ComponentHolder;
import com.example.edison.tdd.DaggerAppComponent;
import com.example.edison.tdd.LoginActivity;
import com.example.edison.tdd.LoginPresenter;
import com.example.edison.tdd.MainActivity;
import com.example.edison.tdd.NetworkCallback;
import com.example.edison.tdd.PasswordValidator;
import com.example.edison.tdd.R;
import com.example.edison.tdd.SecondActivity;
import com.example.edison.tdd.UserManager;

import org.junit.Assert;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.invocation.InvocationOnMock;
import org.mockito.stubbing.Answer;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricGradleTestRunner;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.Shadows;
import org.robolectric.annotation.Config;
import org.robolectric.shadows.ShadowActivity;

import javax.inject.Inject;

/**
 * Created by edison on 2018/4/16.
 */
@RunWith(RobolectricTestRunner.class) //Robolectric相关，看不懂的话忽略
@Config(constants = BuildConfig.class, sdk = 21,manifest = "src/main/AndroidManifest.xml", packageName = "com.example.edison.tdd")
public class LoginPresenterTest {

    @Test
    public void testJump(){
        MainActivity mainActivity=Robolectric.setupActivity(MainActivity.class);
        mainActivity.findViewById(R.id.btn).performClick();
        Intent expectIntent=new Intent(mainActivity, SecondActivity.class);
        ShadowActivity shadowActivity= Shadows.shadowOf(mainActivity);
        Intent actualIntent=shadowActivity.getNextStartedActivity();
        Assert.assertEquals(expectIntent,actualIntent);
    }
}
