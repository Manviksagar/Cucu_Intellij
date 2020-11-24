package com.sag.test;

import com.sag.page.AutoPraticeSite;
import com.sag.page.GooglePage;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class AutoPageTest {


    @Test
    public void test1(){

        System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\Va185060\\\\Desktop\\\\sag\\\\chromedriver.exe");
        WebDriver driver; driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        AutoPraticeSite gp=new  AutoPraticeSite(driver);
        gp.pageNavigate("http://automationpractice.com/index.php");
        gp.insertText("blog.cucumber@gmail.com","Cucumber@blog");

        gp.submitPage();
        gp.quitPage();

    }
}
