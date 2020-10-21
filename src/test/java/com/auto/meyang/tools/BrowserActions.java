package com.auto.meyang.tools;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class BrowserActions {


    public static WebDriver openBrowse(String  type){
        WebDriver webDriver = null;
        if(type.equals("chrome")){
            //设置浏览器安装路径
            System.setProperty("webdriver.chrome.driver","D:\\autoJavaProject\\drivers\\chromedriver.exe");
            //启动浏览器
            webDriver = new ChromeDriver();
        }else if(type.equals("ie")){
            //设置浏览器安装路径
            System.setProperty("webdriver.ie.driver","D:\\autoJavaProject\\drivers\\iedriver.exe");
            //启动浏览器
            webDriver = new InternetExplorerDriver();
        }else if(type.equals("edge")){
            //设置浏览器安装路径
            System.setProperty("webdriver.edge.driver","D:\\autoJavaProject\\drivers\\iedriver.exe");
            //启动浏览器
            webDriver = new EdgeDriver();
        }else if(type.equals("phantomjs")){
            //设置浏览器安装路径
            System.setProperty("phantomjs.binary.path","D:\\autoJavaProject\\drivers\\phantomjs.exe");
            //启动浏览器
            webDriver = new PhantomJSDriver();
        }else if(type.equals("firefox")){
            DesiredCapabilities d = new DesiredCapabilities();
            d.setCapability("marionette", false);  // to disable marionette.
            webDriver = new FirefoxDriver(d);

        }
        
        return webDriver;

    }



    public  static void closeBrowser(WebDriver webDriver){
        webDriver.close();
    }

    public  static void closeAllBrowser(WebDriver webDriver){
        webDriver.quit();
    }

}
