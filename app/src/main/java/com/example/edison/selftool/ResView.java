package com.example.edison.selftool;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.widget.TextView;

/**
 * Created by edison on 2018/6/14.
 */

public class ResView extends android.support.v7.widget.AppCompatTextView {
    public ResView(Context context) {
        this(context,null,0);
    }

    public ResView(Context context, AttributeSet attrs) {
        this(context, attrs,0);
    }

    public ResView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        TypedArray typedArray = context.obtainStyledAttributes(attrs,R.styleable.ResView);
        String text =typedArray.getString(R.styleable.ResView_txt);//给他赋值一个红色
        setText(text);
        typedArray.recycle();
    }
}
