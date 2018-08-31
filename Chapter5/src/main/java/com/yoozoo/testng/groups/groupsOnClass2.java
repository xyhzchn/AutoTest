package com.yoozoo.testng.groups;

import org.testng.annotations.Test;

/**
 *
 * Created by guoxx on 2018/8/30.
 */
@Test(groups = "stu")
public class groupsOnClass2 {
    public void stu1(){
        System.out.println("执行groupsOnClass2类中的stu1方法");
    }
    public void stu2(){
        System.out.println("执行groupsOnClass2类中的stu2方法");
    }
}
