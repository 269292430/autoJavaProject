package com.auto.meyang.day1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class CloseBrowserTest {

    @Test
    public void  openChrome() throws  InterruptedException{
        //设置浏览器安装路径
        System.setProperty("webdriver.chrome.driver","E:\\hujinhua\\test\\code\\drivers\\chromedriver.exe");
        //启动浏览器
        WebDriver webDriver = new ChromeDriver();

        Thread.sleep(5000);
        //只是关闭当前窗口
        // webDriver.close();
        //关闭所有的窗口，进程中driver都关闭了，多用这个方法
        webDriver.quit();

    }
}
