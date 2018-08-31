package com.yoozoo.testng.groups;

import org.testng.annotations.Test;

/**
 *
 * Created by guoxx on 2018/8/30.
 */
@Test(groups = "teacher")
public class groupsOnClass3 {
    public void teacher1(){
        System.out.println("执行groupsOnClass2类中的teacher1方法");
    }
    public void teacher2(){
        System.out.println("执行groupsOnClass2类中的teacher2方法");
    }

//    @Test(expectedExceptions = RuntimeException.class)
//    public void test(){
//        System.out.println("异常测试");
//        throw new RuntimeException();
//    }
}
