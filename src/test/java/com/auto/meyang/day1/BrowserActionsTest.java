package com.auto.meyang.day1;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BrowserActionsTest {
    WebDriver webDriver;

    @BeforeMethod
    public  void   beforeMethod(){
        //设置浏览器安装路径
        System.setProperty("webdriver.chrome.driver","E:\\hujinhua\\test\\code\\drivers\\chromedriver.exe");
        //启动浏览器
        webDriver = new ChromeDriver();
    }

    /**
     * 打开浏览器输入指定地址：标事通
     * @throws InterruptedException
     */
    @Test
    public void  openChrome() throws  InterruptedException{

        //打开标事通
        webDriver.get("https://www.biaoshitong.com");
        //等待5s
        Thread.sleep(5000);

    }


    /**
     *浏览器后退
     * @throws InterruptedException
     */
    @Test
    public void  backTest() throws  InterruptedException{

        //打开标事通
        webDriver.get("https://www.biaoshitong.com");
        //等待3s
        Thread.sleep(3000);
        //浏览器后退
        webDriver.navigate().back();
        //等待3s
        Thread.sleep(3000);

    }


    /**
     *浏览器后退再前进
     * @throws InterruptedException
     */
    @Test
    public void  forwardTest() throws  InterruptedException{

        //打开标事通
        webDriver.get("https://www.biaoshitong.com");
        //等待3s
        Thread.sleep(3000);
        //浏览器后退
        webDriver.navigate().back();
        //等待3s
        Thread.sleep(3000);
        //浏览器前进
        webDriver.navigate().forward();
        //等待3s
        Thread.sleep(3000);

    }


    /**
     *刷新
     * @throws InterruptedException
     */
    @Test
    public void   refreshTest() throws  InterruptedException{
        //打开相应地址，一直等待转圈完成
        webDriver.get("http://www.google.cn/");
        //等待3s
        Thread.sleep(3000);
        //浏览器刷新
        webDriver.navigate().refresh();
        //等待3s
        Thread.sleep(3000);

    }

    /**
     * 打开Chrome
     * 设置浏览器窗口大小   300*300
     * 等待3s
     * 最多化窗口
     * 关闭浏览器
     */
    @Test
    public  void  winTest() throws  InterruptedException{
        //设置浏览器窗口大小
        Dimension  dimension = new Dimension(300,300);
        webDriver.manage().window().setSize(dimension);
        //等待3s
        Thread.sleep(3000);
        //最大化窗口
        webDriver.manage().window().maximize();
        //等待3s
        Thread.sleep(3000);
    }


    /**
     * 打开Chrome
     * 设置浏览器窗口大小   300*300
     * 等待3s
     * 获取URL
     * 关闭浏览器
     */
    @Test
    public  void  getURLTest() throws  InterruptedException{
        //打开百度
        webDriver.get("https://www.baidu.com/");
        //等待3s
        Thread.sleep(3000);
        String    url =  webDriver.getCurrentUrl();
        System.out.println("获取的url:"+url);
        Assert.assertEquals(url,"https://www.baidu.com");
    }

    /**
     * 关闭所有的浏览器
     */
    @AfterMethod
    public  void   afterMethodTest(){
        //关闭所有的窗口，进程中driver都关闭了，多用这个方法
        webDriver.quit();

    }


}
