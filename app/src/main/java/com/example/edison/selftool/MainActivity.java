package com.example.edison.selftool;

import android.database.DataSetObserver;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.example.edison.selftool.adapter.TestLVAdapter;
import com.example.edison.selftool.bean.TestBean;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import onairm.com.devtool.CrashHandler;
import onairm.com.devtool.TipToast;

public class MainActivity extends AppCompatActivity {
    List<TestBean> list;
    TestLVAdapter adapter;
    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       CrashHandler.getInstance().init(getApplicationContext(),"");
        setContentView(R.layout.activity_main);

          listView=findViewById(R.id.listview);
         list=new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            TestBean bean=new TestBean(i+"");
            list.add(bean);
        }

         adapter=new TestLVAdapter(list);
        listView.setAdapter(adapter);
    }


    public void test(View view) {
        listView.requestLayout();
    }
}
