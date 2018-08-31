package com.yoozoo.testng;

import org.testng.annotations.*;

/**
 * 测试类
 * Created by guoxx on 2018/8/30.
 */
public class BasicAnnotation {

    @Test
    public void testCase1(){
        System.out.println("TestCase1:这是测试方法1");
    }
    @Test
    public void testCase2(){
        System.out.println("TestCase2:这是测试方法2");
    }

    @BeforeMethod
    public void beforeMethod(){
        System.out.println("beforeMethod:在测试方法之前执行");
    }

    @AfterMethod
    public void afterMethod(){
        System.out.println("afterMethod:在测试方法之后执行");
    }

    @BeforeClass
    public void beforeClass(){
        System.out.println("beforeClass:类开始之前执行");
    }

    @AfterClass
    public void afterClass(){
        System.out.println("afterClass:类结束之后执行");
    }

    @BeforeTest
    public void beforeTestA(){
        System.out.println("beforeTest:执行");
    }

    @AfterTest
    public void afterTestA(){
        System.out.println("afterTest:执行");
    }

    @BeforeSuite
    public void beforeSuite(){
        System.out.println("beforeSuite 方法运行");
    }

    @AfterSuite
    public void afterSuite(){
        System.out.println("afterSuite 方法运行");
    }

}
