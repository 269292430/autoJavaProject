package com.auto.meyang.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class FindElementsTest {

    WebDriver  driver;

    /**
     * 启动浏览器
     */
    @BeforeMethod
    public void openBrowser(){
        //设置浏览器安装路径
        System.setProperty("webdriver.chrome.driver","E:\\hujinhua\\test\\code\\drivers\\chromedriver.exe");
        //启动浏览器
        driver = new ChromeDriver();

    }

    /**
     * 打开百度首页
     * 通过ID定位
     */
    @Test
    public void  byIDTest(){
        driver.get("https://www.baidu.com/");
        WebElement element = driver.findElement(By.id("kw"));
    }

    /**
     * 打开百度首页
     * 通过name定位
     */
    @Test
    public void  byNameTest(){
        driver.get("https://www.baidu.com/");
        WebElement element = driver.findElement(By.name("wd"));
    }

    /**
     * 打开百度首页
     * 通过className定位
     */
    @Test
    public void  byClassNameTest(){
        driver.get("https://www.baidu.com/");
        WebElement element = driver.findElement(By.className("sub-title"));
    }

    /**
     * 打开百度首页
     * 通过linktext定位，只能用于a标签
     */
    @Test
    public void  byLinkTextTest(){
        driver.get("https://www.baidu.com/");
        WebElement element = driver.findElement(By.linkText("新闻"));
    }

    /**
     * 打开百度首页
     * 通过partialLinkText定位,部分文本a标签
     */
    @Test
    public void  byPartialLinkTextTest(){
        driver.get("https://www.baidu.com/");
        WebElement element = driver.findElement(By.partialLinkText("闻"));
    }

    /**
     * 打开百度首页
     * 通过tagName定位,这个方法很少用，因为tagName不是唯一的
     */
    @Test
    public void  byTagNameTest(){
        driver.get("https://www.baidu.com/");
        List<WebElement> elements = driver.findElements(By.tagName("span"));
        System.out.println("有"+elements.size()+"个span");
    }

    /**
     * 打开百度首页
     * 通过xpath定位
     */
    @Test
    public void  byXpathTest(){
        driver.get("https://www.baidu.com/");
        WebElement element = driver.findElement(By.xpath("//*[@id='su']"));
    }

    /**
     * 打开百度首页
     * 通过cssSelector定位
     */
    @Test
    public void  byCssSelectorTest(){
        driver.get("https://www.baidu.com/");
        WebElement element = driver.findElement(By.cssSelector("#lg > map > area"));
    }


    /**
     * 打开百度首页
     * 通过xpath定位,获取一组数据
     */
    @Test
    public void  byXpathTest02(){
        driver.get("https://www.baidu.com/");
        List<WebElement> elements = driver.findElements(By.xpath("//*[@id='u1']/a"));
        for(int i=0;i<elements.size();i++){
            String text = elements.get(i).getText();
            System.out.println(text);
        }

    }


    /**
     * 关闭浏览器
     */
    @AfterMethod
    public void closeBrowser(){
       driver.quit();
    }

}
