package com.example.edison.selftool.adapter;

import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;

import com.example.edison.selftool.R;
import com.example.edison.selftool.bean.TestBean;

import java.util.List;


/**
 * Created by edison on 2018/4/9.
 */

public class TestLVAdapter extends BaseAdapter {
    private List<TestBean> list;

    public TestLVAdapter(List<TestBean> list) {
        this.list = list;
    }

    @Override
    public int getCount() {
        return list == null ? 0 : list.size();
    }

    @Override
    public Object getItem(int position) {
        return list == null ? null : list.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (null == convertView) {
            convertView = View.inflate(parent.getContext(), R.layout.adapter_testlv, null);
            ViewHolder viewHolder = new ViewHolder(convertView);
            convertView.setTag(viewHolder);
            viewHolder.textView.setText(list.get(position).getId());
        } else {
            ViewHolder viewHolder = (ViewHolder) convertView.getTag();
            viewHolder.textView.setText(list.get(position).getId());
        }

        return convertView;
    }

    private static final class ViewHolder {
        TextView textView;

        ViewHolder(View item) {
            textView = item.findViewById(R.id.tvName);
        }

    }

}
