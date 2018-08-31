package com.tester.testngExtent;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

/**
 *
 * Created by guoxx on 2018/8/30.
 */
public class TestNGExtentReportTest {
    @Test
    public void test1(){
        Assert.assertEquals(1,2);
    }
    @Test
    public void test2(){
        Assert.assertEquals(1,1);
    }
    @Test
    public void test3(){
        Assert.assertEquals("aaa","aaa");
    }
    @Test
    public void test4(){
        Reporter.log("自己编写的log信息");
        throw new RuntimeException("运行时异常");
    }
}
