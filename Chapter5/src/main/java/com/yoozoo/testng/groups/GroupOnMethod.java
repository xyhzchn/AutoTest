package com.yoozoo.testng.groups;

import org.testng.annotations.*;

/**
 *
 * Created by guoxx on 2018/8/30.
 */
public class GroupOnMethod {
    @Test(groups = "server")
    public void test1(){
        System.out.println("服务端测试方法test1");
    }

    @Test(groups = "server")
    public void test2(){
        System.out.println("服务端测试方法test2");
    }

    @Test(groups = "client")
    public void test3(){
        System.out.println("客户端测试方法test3");
    }

    @Test(groups = "client")
    public void test4(){
        System.out.println("客户端测试方法test4");
    }

    @BeforeGroups("server")
    public void beforeServerGroup(){
        System.out.println("服务端组运行之前");
    }
    @AfterGroups("server")
    public void ServerGroup(){
        System.out.println("服务端组运行之后");
    }
    @BeforeGroups("client")
    public void beforeClientGroup(){
        System.out.println("客户端端组运行之前");
    }
    @AfterGroups("client")
    public void afterClientGroup(){
        System.out.println("客户端组运行之前");
    }

    @BeforeClass
    public void beforeClass(){
        System.out.println("beforeClass:类开始之前执行");
    }

    @AfterClass
    public void afterClass(){
        System.out.println("afterClass:类结束之后执行");
    }
}
