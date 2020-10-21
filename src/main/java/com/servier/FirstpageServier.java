package com.servier;

import com.page.FirstPage;
import org.openqa.selenium.WebDriver;

public class FirstpageServier {

    public static  void loginPo(WebDriver driver, String user, String pwd){
        driver.findElement(FirstPage.userInput).sendKeys(user);
        driver.findElement(FirstPage.pwdInput).sendKeys(pwd);
        driver.findElement(FirstPage.loginButton).click();
    }



}
