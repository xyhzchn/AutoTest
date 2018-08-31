package com.yoozoo.testng.suite;

import org.testng.annotations.*;

/**
 *
 * Created by guoxx on 2018/8/30.
 */
public class SuiteConfig {

    @BeforeSuite
    public void beforeSuite(){
        System.out.println("beforeSuite 方法运行");
    }

    @AfterSuite
    public void afterSuite(){
        System.out.println("afterSuite 方法运行");
    }


}
