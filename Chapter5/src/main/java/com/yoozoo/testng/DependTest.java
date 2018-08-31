package com.yoozoo.testng;

import org.testng.annotations.Test;

/**
 *
 * Created by guoxx on 2018/8/30.
 */
public class DependTest {
    @Test
    public void test1(){
        System.out.println("test1 run");
    }

    @Test(dependsOnMethods = {"test1"})
    public void test2(){
        System.out.println("test2 run");
    }
}
