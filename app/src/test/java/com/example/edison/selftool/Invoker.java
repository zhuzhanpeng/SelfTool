package com.example.edison.selftool;

/**
 * Created by edison on 2018/4/3.
 */

public class Invoker {
    private Command command;
    public Invoker(){
        command=new ConcreteCommand();
    }

    public void requestCommand(){
        command.execute();
    }
}
