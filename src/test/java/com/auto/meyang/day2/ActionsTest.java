package com.auto.meyang.day2;



import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;

public class ActionsTest {

    WebDriver  driver;

    /**
     * 启动浏览器
     */
    @BeforeMethod
    public void openBrowser(){
        //设置浏览器安装路径
        System.setProperty("webdriver.chrome.driver","D:\\autoJavaProject\\grid\\chromedriver.exe");
        //启动浏览器
        driver = new ChromeDriver();
    }

    /**
     * 点击相应的链接
     * 校验相应点击后的链接对不对
     */

    @Test
    public  void   clickTest(){
        driver.get("https://www.baidu.com/");
        WebElement  element =driver.findElement(By.name("tj_trvirus"));
        element.click();
        String  url = driver.getCurrentUrl();
        Assert.assertEquals(url,"https://voice.baidu.com/act/newpneumonia/newpneumonia/?from=osari_pc_1");
    }

    /**
     * 打开百度
     * 输入关键字  selenium
     * 点击百度一下
     * 检验title是否等于“selenium_百度搜索”
     */
    @Test
    public  void   sendKeysTest()  throws   InterruptedException{
        //打开百度
        driver.get("https://www.baidu.com/");
        //获取输入框
        WebElement  element =driver.findElement(By.id("kw"));
        //输入 selenium 关键字
        element.sendKeys("selenium");
        //获取搜索按钮
        WebElement   bt =  driver.findElement(By.id("su"));
        //点击搜索按钮
        bt.click();
        Thread.sleep(3000);
        //获取搜索的title
        String   title  =   driver.getTitle();
        //校验
        Assert.assertEquals(title,"selenium_百度搜索");
    }

    /**
     * 打开百度
     * 输入关键字  selenium
     * 输入错误，清空输入
     */
    @Test
    public  void   clearTest()  throws   InterruptedException{
        //打开百度
        driver.get("https://www.baidu.com/");
        //获取输入框
        WebElement  element =driver.findElement(By.id("kw"));
        //输入 selenium 关键字
        element.sendKeys("selenium");
        Thread.sleep(3000);
        //清空输入内容
        element.clear();
        Thread.sleep(3000);
}


    /**
     * 获取文本
     */
    @Test
    public  void   getTextTest()  throws   InterruptedException{
        //打开百度
        driver.get("https://www.baidu.com/");
        //获取输入框
        String  element =driver.findElement(By.name("tj_trnews")).getText();
        Assert.assertEquals(element,"新闻");
    }

    /**
     * getTagName
     */

    @Test
    public  void   getTagNameTest() {
        driver.get("https://www.baidu.com/");
        String    tagName = driver.findElement(By.id("kw")).getTagName();
        Assert.assertEquals(tagName,"input");
    }

    /**
     * 获取属性值
     */
    @Test
    public  void   getAttributeTest(){
        driver.get("https://www.baidu.com/");
        String  s   =  driver.findElement(By.id("su")).getAttribute("type");
        Assert.assertEquals(s,"submit");
    }

    /**
     * 判断是否显示
     */
    @Test
    public  void   isDisplayedTest(){
        driver.get("https://www.baidu.com/");
        Boolean  b =  driver.findElement(By.id("su")).isDisplayed();
        Assert.assertTrue(b);
    }

    /**
     * 判断是否选中
     */

    @Test
        public void  isSelectedTest()throws  InterruptedException{
        driver.get("https://www.baidu.com/");
        driver.findElement(By.xpath("//*[@id=\"u1\"]/a[8]")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"TANGRAM__PSP_10__footerULoginBtn\"]")).click();
        Thread.sleep(3000);
        WebElement   element = driver.findElement(By.xpath("//*[@id=\"TANGRAM__PSP_10__memberPass\"]"));
        //element.click();
        Boolean  b =  element.isSelected();
        Assert.assertTrue(b);
    }

    /**
     * 页面元素是否可以操作
     */
    @Test
    public  void   isEnabledTest2() throws  InterruptedException{
        driver.get("http://www.biaoshitong.com");
        Thread.sleep(3000);
        Boolean  b = driver.findElement(By.xpath("//*[@id='scroll-box']/div/div[1]/div/div[1]/div[2]/div/div")).isEnabled();
        Assert.assertTrue(b);
    }

    /**
     * 截图
     */
    @Test
     public  void   shotTest(){
         driver.get("http://www.biaoshitong.com");
         File  file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
         driver.manage().window().maximize();

//         try {
////             FileUtils.copyFile(file,new File("E:/hujinhua/test/code/jietu/test2.png"));
//         } catch (IOException e) {
//             e.printStackTrace();
//         }
     }



    /**
     * 关闭浏览器
     */
    @AfterMethod
    public void closeBrowser(){
        driver.quit();
    }

}
