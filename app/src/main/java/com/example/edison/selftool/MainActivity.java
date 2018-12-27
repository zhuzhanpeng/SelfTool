package com.example.edison.selftool;

import android.database.DataSetObserver;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.example.edison.selftool.adapter.RvAdapter;
import com.example.edison.selftool.adapter.TestLVAdapter;
import com.example.edison.selftool.bean.TestBean;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import onairm.com.devtool.CrashHandler;
import onairm.com.devtool.TipToast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        CrashHandler.getInstance().init(getApplicationContext(), "");
        setContentView(R.layout.activity_main);
        final LinearLayoutManager layoutManager = new LinearLayoutManager(this);

        MyRecyclerView recyclerView = findViewById(R.id.recyclerView);
        RvAdapter adapter = new RvAdapter();
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);
    }


}
