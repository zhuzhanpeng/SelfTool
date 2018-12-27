package com.example.edison.selftool.bean;

import android.support.annotation.NonNull;

/**
 * Created by edison on 2018/4/9.
 */

public class TestBean implements Comparable{
    private String id;

    public TestBean(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    @Override
    public int compareTo(@NonNull Object o) {
        TestBean bean= (TestBean) o;
        return bean.getId().compareTo(id);
    }
}
