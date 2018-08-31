package com.yoozoo.testng.suite;

import org.testng.annotations.*;

/**
 *
 * Created by guoxx on 2018/8/30.
 */
public class Login {

    @Test
    public void loginSuccess(){
        System.out.println("登录成功");
    }
    @BeforeClass
    public void beforeClass(){
        System.out.println("Class运行之前");
    }

    @AfterClass
    public void afterClass(){
        System.out.println("Class运行之后");
    }

}
