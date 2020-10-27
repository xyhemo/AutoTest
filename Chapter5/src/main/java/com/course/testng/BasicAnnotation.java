package com.course.testng;

import org.testng.annotations.*;

public class BasicAnnotation {
    @Test
    public void testCase1(){
        System.out.println("这是测试用例1");
    }
    @Test
    public void testCase2(){
        System.out.println("这是测试用例2");
    }
    @BeforeMethod
    public void beforeMethod(){
        System.out.println("这是在方法之前执行的");
    }
    @AfterMethod
    public void afterMethod(){
        System.out.println("这是在方法之后执行的");
    }
    @BeforeClass
    public void beforeClass(){
        System.out.println("这是在类之前运行的");
    }
    @AfterClass
    public void afterClass(){
        System.out.println("这是在类之后运行的");
    }
    @BeforeSuite
    public void beforeSuite(){
        System.out.println("beforeSuite测试套件");
    }
    @AfterSuite
    public void afterSuite(){
        System.out.println("afterSuite测试套件");
    }
}
