package com.course.testng.suite;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class SuiteConfig {
    @BeforeSuite
    public void beforeSuit(){
        System.out.print("beforesuite运行");
    }
    @AfterSuite
    public void afterSuit(){
        System.out.print("afterSuit运行");
    }
}
