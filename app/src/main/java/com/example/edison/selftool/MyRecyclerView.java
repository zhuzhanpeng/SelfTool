package com.example.edison.selftool;

import android.content.Context;
import android.support.annotation.Nullable;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by edison on 2018/4/18.
 */

public class MyRecyclerView extends RecyclerView{

    public MyRecyclerView(Context context) {
        super(context);
    }

    public MyRecyclerView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public MyRecyclerView(Context context, @Nullable AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }

    @Override
    public boolean onTouchEvent(MotionEvent e) {
        boolean result=super.onTouchEvent(e);
        notifyGetItemView();
        return result;
    }

    public interface GetItemView{
        void itemview(RecyclerView recyclerView);
    }
    private GetItemView getItemView;
    public void setGetItemView(GetItemView getItemView){
        this.getItemView=getItemView;
    }
    private void notifyGetItemView(){
        if(null != getItemView){
            getItemView.itemview(this);
        }
    }
}
