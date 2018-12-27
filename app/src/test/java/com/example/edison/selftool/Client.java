package com.example.edison.selftool;

import org.junit.Test;

/**
 * Created by edison on 2018/4/3.
 */

public class Client {
    @Test
    public void main(){
        Invoker invoker=new Invoker();
        invoker.requestCommand();
    }
}
