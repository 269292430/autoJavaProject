package com.page;

import org.openqa.selenium.By;

public class FirstPage {

    public static By  userInput = By.xpath("//span[text()=\"登录\"]");
    public static By  pwdInput = By.xpath("/html/body/div[4]/div/div[2]/div/div[2]/div[1]/form/div[1]/div/div[1]/input");
    public static By  loginButton = By.xpath("/html/body/div[4]/div/div[2]/div/div[2]/div[1]/form/div[3]/div/button");

}
