package com.yoozoo.testng.demo;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * Created by guoxx on 2018/9/4.
 */
public class MyClass {

    @BeforeMethod
    public void beforeTest(){
        System.out.println("执行测试之前");
    }
    @Test
    public void test1(){
        System.out.println("执行第一个测试");
    }
    @Test
    public void test2(){
        Assert.assertEquals(1,2);
    }
    @Test
    public void test3(){
        Assert.assertEquals("1","1");
    }
    @Test
    public void test4(){
        Assert.assertNull("111");
    }
    @AfterMethod
    public void afterTest(){
        System.out.println("执行测试之后");
    }
}
