package com.onairm.layoutmanagerdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView=findViewById(R.id.recyclerView);

        MyLayoutManager layoutManager=new MyLayoutManager();
        recyclerView.setLayoutManager(layoutManager);
        MyAdapter adapter=new MyAdapter();
        recyclerView.setAdapter(adapter);
    }
}
