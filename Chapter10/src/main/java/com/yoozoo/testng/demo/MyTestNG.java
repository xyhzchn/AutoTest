package com.yoozoo.testng.demo;

import org.testng.TestNG;
import org.testng.xml.XmlClass;
import org.testng.xml.XmlSuite;
import org.testng.xml.XmlTest;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * Created by guoxx on 2018/9/4.
 */
public class MyTestNG {

    public static void main(String args[]){
        ExtentTestNGIReporterListener myListener = new ExtentTestNGIReporterListener();
        TestNG tng = new TestNG();

        XmlSuite suite = new XmlSuite();
        suite.setName("TmpSuite");

        XmlTest test = new XmlTest(suite);
        test.setName("TmpTest");
        List<XmlClass> classes = new ArrayList<XmlClass>();
        classes.add(new XmlClass("com.yoozoo.testng.demo.MyClass"));
        test.setXmlClasses(classes) ;

        List<XmlSuite> suites = new ArrayList<XmlSuite>();
        suites.add(suite);
        tng.setXmlSuites(suites);

        tng.addListener(myListener);
        tng.run();


    }
}
