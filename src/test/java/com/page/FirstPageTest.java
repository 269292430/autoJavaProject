package com.page;

import com.auto.meyang.tools.BrowserActions;
import com.servier.FirstpageServier;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;

public class FirstPageTest {


    WebDriver driver;

    @BeforeClass
    public void  openBrowser(){
        driver = BrowserActions.openBrowse("firefox");
    }

    @AfterClass
    public void  closeAllBrowser(){
        BrowserActions.closeAllBrowser(driver);
    }

    @DataProvider(name = "login")
    public Object[][]  user(){
        return  new  Object[][]{{"usr1","pwd1"},{"user2","pwd2"}};
    }


    @Test(dataProvider = "login")
    public void LoginTest(String user,String pwd){
        driver.get("http://www.biaoshitong.com/index");
        FirstpageServier.loginPo(driver,user,pwd);

    }





}
