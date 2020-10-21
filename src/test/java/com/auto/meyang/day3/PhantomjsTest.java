package com.auto.meyang.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriver;
import org.testng.annotations.Test;

public class PhantomjsTest {
    @Test
    public void ptjsTest() throws InterruptedException {
       System.setProperty("phantomjs.binary.path", "D:\\autoJavaProject\\drivers\\phantomjs.exe");
        //    WebDriver driver = new FirefoxDriver();
        WebDriver driver = new PhantomJSDriver();
        driver.get("http://www.baidu.com");
        System.out.println(driver.getCurrentUrl());
        driver.findElement(By.id("kw")).sendKeys("phantomjs");
        Thread.sleep(50000);
        driver.quit();
    }




}
