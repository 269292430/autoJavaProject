package com.auto.meyang.day1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

public class OpenBrowserTest {
    @Test
    public void  openFirefox(){
        //firefox默认安装，且版本在48以下
        WebDriver  webDriver = new FirefoxDriver();
    }
    @Test
    public void  openFirefox2() throws InterruptedException {
        //不是默认安装且在48以下版本，就需要设置相应的exe安装路径，不需要驱动
//        System.setProperty("webdriver.firefox.bin","C:\\Program Files (x86)\\Mozilla Firefox\\firefox.exe");
//        System.setProperty("webdriver.gecko.driver","D:\\autoJavaProject\\drivers\\geckodriver.exe");
//        //启动浏览器
//        WebDriver  webDriver = new FirefoxDriver();




        DesiredCapabilities d = new DesiredCapabilities();
        d.setCapability("marionette", false);  // to disable marionette.
        WebDriver driver = new FirefoxDriver(d);
        driver.get("http://www.baidu.com");
        System.out.println("run firefox");
        Thread.sleep(3000);

    }

    @Test
    public void  openChrome(){
        //设置浏览器安装路径
        System.setProperty("webdriver.chrome.driver","D:\\autoJavaProject\\drivers\\chromedriver.exe");
        //启动浏览器
        WebDriver  webDriver = new ChromeDriver();
    }

    @Test
    public void  openIE(){
        //设置浏览器安装路径
        System.setProperty("webdriver.ie.driver","D:\\autoJavaProject\\drivers\\iedriver.exe");
        //启动浏览器
        WebDriver  webDriver = new InternetExplorerDriver();
    }

    @Test
    public void  openEdge(){
        //设置浏览器安装路径
        System.setProperty("webdriver.edge.driver","D:\\autoJavaProject\\drivers\\iedriver.exe");
        //启动浏览器
        WebDriver  webDriver = new EdgeDriver();
    }

    @Test
    public void  openPjs(){
        //设置浏览器安装路径
        System.setProperty("phantomjs.binary.path","D:\\autoJavaProject\\drivers\\phantomjs.exe");
        //启动浏览器
        WebDriver  webDriver = new PhantomJSDriver();
    }

}
