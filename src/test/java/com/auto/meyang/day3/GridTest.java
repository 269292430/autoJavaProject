package com.auto.meyang.day3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class GridTest {
    WebDriver  driver;

    @Test
    public void testChrome() throws MalformedURLException, InterruptedException {
        DesiredCapabilities dc = DesiredCapabilities.chrome();
        //可以指定哪台机器跑，也可以指定hub又它去分发执行
        driver = new RemoteWebDriver(new URL("http://192.168.0.102:8888/wd/hub"),dc);
        //设置浏览器安装路径

        driver.get("http://www.baidu.com");
        Thread.sleep(3000);
        System.out.print("grid");
        driver.quit();
    }

    @DataProvider(name="data4")
    public Object[][]  test1(){
       return  new Object[][]{
            {"firefox","http://192.168.0.102:6666"},
            {"chrome","http://192.168.0.102:8888"}
        } ;
    }



    @Test(dataProvider = "data4")
    public void testGrid(String browser,String url) throws MalformedURLException, InterruptedException {
       DesiredCapabilities dc = null;

       if(browser.equals("firefox")){
           dc.setCapability("marionette", false);  // to disable marionette.
           driver = new FirefoxDriver(dc);
//           driver.get("http://www.baidu.com");

//           dc = DesiredCapabilities.firefox();
           System.out.println("firefox");


           DesiredCapabilities d = new DesiredCapabilities();
           d.setCapability("marionette", false);  // to disable marionette.
           WebDriver driver = new FirefoxDriver(d);
           driver.get("http://www.baidu.com");
           System.out.println("run firefox");
           Thread.sleep(3000);




       }else if(browser.equals("chrome")){
           dc = DesiredCapabilities.chrome();
           System.out.println("chrome");
       }else {
           System.out.println("error");
       }

       driver = new RemoteWebDriver(new URL(url+"/wd/hub"),dc);
       //设置浏览器安装路径

        driver.get("http://www.baidu.com");
        Thread.sleep(3000);
        System.out.print("grid");
        driver.quit();
    }

}
