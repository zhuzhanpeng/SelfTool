package com.example.edison.selftool;

/**
 * Created by edison on 2018/4/3.
 */

public class ConcreteCommand implements Command {
    private Receiver receiver;
    public ConcreteCommand(){
        receiver=new Receiver();
    }
    @Override
    public void execute() {
        receiver.execute();
    }
}
