package com.yoozoo.testng.paramter;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

/**
 *
 * Created by guoxx on 2018/8/30.
 */
public class ParamterTest {

    @Test
    @Parameters({"name","age"})
    public void paramTest(String name ,int age){
        System.out.println("name = "+name+"; age = "+age);
    }
}
