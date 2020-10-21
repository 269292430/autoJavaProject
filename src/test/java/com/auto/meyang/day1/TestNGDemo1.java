package com.auto.meyang.day1;

import org.testng.annotations.*;

/**
 * 2020/2/13
 */
public class TestNGDemo1 {
    /**所有的case前执行一次
     * 数据准备，打开浏览器
     */
    @BeforeTest
    public  void  beforeTest01(){
        System.out.println("这是@BeforeTest注解");
    }

    /**
     * 每个方法运行前都要运行一次
     * 比如：创建用户等等
     */
    @BeforeMethod
    public  void  beforeMethod(){
        System.out.println("这是@BeforeMethod注解");
    }

    /**
     * 一个案例1
     */
    @Test
    public  void   testCase1() throws InterruptedException {
        Thread.sleep(3000);
        System.out.println("这是@Test注解1");
    }

    /**
     * 一个案例2
     */
    @Test
    public  void  testCase2() throws InterruptedException {
        Thread.sleep(3000);
        System.out.println("这是@Test注解2");
    }


    /**
     * 所有的case执行完了执行一次
     */
    @AfterTest
    public  void  afterTest1(){
        System.out.println("这是AfterTest注解");
    }

    /**
     * 每个方法执行后执行一次
     * 比如关闭浏览器
     */
    @AfterMethod
    public void afterMethod(){
        System.out.println("这是AfterMethod注解");
    }

}
