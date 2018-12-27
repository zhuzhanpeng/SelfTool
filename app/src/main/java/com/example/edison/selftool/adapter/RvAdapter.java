package com.example.edison.selftool.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.edison.selftool.MyRecyclerView;
import com.example.edison.selftool.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by edison on 2018/4/18.
 */

public class RvAdapter extends RecyclerView.Adapter<RvAdapter.MyViewHolder> {
    private List<String> list=new ArrayList<>();
    public RvAdapter(){
        for (int i = 0; i < 500; i++) {
            list.add("get item view test"+i);
        }
    }
    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView=View.inflate(parent.getContext(), R.layout.adapter_rv,null);
        MyViewHolder myViewHolder=new MyViewHolder(itemView);
        return myViewHolder;
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        holder.textView.setText(list.get(position));
    }

    @Override
    public int getItemCount() {
        return list==null?0:list.size();
    }

    static final class MyViewHolder extends RecyclerView.ViewHolder {
        TextView textView;
        public MyViewHolder(View itemView) {
            super(itemView);
            textView=itemView.findViewById(R.id.tv);
        }
    }
}
