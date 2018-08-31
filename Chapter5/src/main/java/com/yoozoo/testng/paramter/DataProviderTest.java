package com.yoozoo.testng.paramter;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.lang.reflect.Method;

/**
 *
 * Created by guoxx on 2018/8/30.
 */
public class DataProviderTest {

//    @Test(dataProvider = "data")
//    public void dataProviderTest(String name,int age){
//        System.out.println("name = "+name+"; age = "+age);
//    }
//
//    @DataProvider(name = "data")
//    public Object[][] getData(){
//        Object [][] o = new Object[][]{{"张三",10},{"里斯",20}};
//        return o;
//    }
    @Test(dataProvider = "data")
    public void dataProvider1(String name,int age){
        System.out.println("name = "+name+"; age = "+age);
    }

    @Test(dataProvider = "data")
    public void dataProvider2(String name,int age){
        System.out.println("name = "+name+"; age = "+age);
    }

    @DataProvider(name = "data")
    public Object[][] getData(Method method){
        Object [][] o = null;
        if(method.getName().equals("dataProvider1")){
            o = new Object[][]{{"张三",10},{"里斯",20}};
        }else if(method.getName().equals("dataProvider2")){
            o = new Object[][]{{"王五",30},{"赵六",40}};
        }

        return o;
    }

}
