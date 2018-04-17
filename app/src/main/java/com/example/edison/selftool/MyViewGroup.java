package com.example.edison.selftool;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.ViewGroup;
import android.widget.ListView;

/**
 * Created by edison on 2018/4/10.
 */

public class MyViewGroup extends ListView {
    String TAG = getClass().getSimpleName();

    public MyViewGroup(Context context) {
        super(context);
    }

    public MyViewGroup(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        int widthMode = MeasureSpec.getMode(widthMeasureSpec);
        int widthSize = MeasureSpec.getSize(widthMeasureSpec);

        switch (widthMode) {
            case MeasureSpec.UNSPECIFIED:
                Log.e(TAG, "widthMode: " + "UNSPECIFIED");
                Log.e(TAG, "widthSize: " + widthSize);
                break;
            case MeasureSpec.AT_MOST:
                Log.e(TAG, "widthMode: " + "AT_MOST");
                Log.e(TAG, "widthSize: " + widthSize);
                break;
            case MeasureSpec.EXACTLY:
                Log.e(TAG, "widthMode: " + "EXACTLY");
                Log.e(TAG, "widthSize: " + widthSize);
                break;
        }

        int heightMode = MeasureSpec.getMode(heightMeasureSpec);
        int heightSize = MeasureSpec.getSize(heightMeasureSpec);

        switch (heightMode) {
            case MeasureSpec.UNSPECIFIED:
                Log.e(TAG, "heightMode: "+"UNSPECIFIED" );
                Log.e(TAG, "heightSize: " + heightSize);
                break;
            case MeasureSpec.AT_MOST:
                Log.e(TAG, "heightMode: "+"AT_MOST" );
                Log.e(TAG, "heightSize: " + heightSize);
                break;
            case MeasureSpec.EXACTLY:
                Log.e(TAG, "heightMode: "+"EXACTLY" );
                Log.e(TAG, "heightSize: " + heightSize);
                break;
        }
    }

    @Override
    protected void onLayout(boolean changed, int l, int t, int r, int b) {
        super.onLayout(changed, l, t, r, b);
        Log.e(TAG, "onLayout:");
    }
}
