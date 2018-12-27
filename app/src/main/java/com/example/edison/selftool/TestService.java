package com.example.edison.selftool;

import android.app.Service;
import android.content.Intent;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.support.annotation.Nullable;

/**
 * Created by edison on 2018/5/29.
 */

public class TestService extends Service {
    @Override
    public void onCreate() {
        super.onCreate();
       final  Handler handler=new Handler(){
            @Override
            public void handleMessage(Message msg) {
                super.handleMessage(msg);
                Intent intent = new Intent(TestService.this,TestActivity.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(intent);


            }
        };


        handler.sendMessageDelayed(Message.obtain(),10*1000);
        handler.sendMessageDelayed(Message.obtain(),11*1000);

    }

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }
}
