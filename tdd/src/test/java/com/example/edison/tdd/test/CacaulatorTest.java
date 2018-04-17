package com.example.edison.tdd.test;

import com.example.edison.tdd.Cacaulator;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by edison on 2018/4/16.
 */

public class CacaulatorTest {
    @Test
    public void testAdd(){
        Cacaulator cacaulator=new Cacaulator();
        int result=cacaulator.add(1,2);
        Assert.assertEquals("add",3,result);
    }
}
