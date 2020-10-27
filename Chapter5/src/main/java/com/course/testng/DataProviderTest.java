package com.course.testng;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;

import java.lang.reflect.Method;

public class DataProviderTest {
    @Test(dataProvider = "data")
    public void testDataProvider(String name,int age){
        System.out.println("name="+name+";age="+age);
    }
    @DataProvider(name="data")
    public Object[][] provider(){
        Object[][] o =new Object[][]{
                {"zhangsan",20},
                {"lisi",23}
        };
        return o;
    }

    @Test(dataProvider = "method")
    public void test1(String name,int age){
        System.out.println("test1111  name="+name+";age="+age);
    }
    @Test(dataProvider = "method")
    public void test2(String name,int age){
        System.out.println("test2222  name="+name+";age="+age);
    }
    @DataProvider(name="method")
    public Object[][]  methodData(Method method){
        Object[][] result = null;
        if(method.getName().equals("test1")){
            result = new Object[][]{
                    {"zhangsan",21},
                    {"lisi",25}
            };
        }else if(method.getName().equals("test2")){
            result = new Object[][]{
                    {"wangwu",51},
                    {"zhapliu",55}
            };
        }
        return result;
    }
}
