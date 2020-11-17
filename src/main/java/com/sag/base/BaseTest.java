package com.sag.base;

import com.sag.page.GooglePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class BaseTest {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\Va185060\\\\Desktop\\\\sag\\\\chromedriver.exe");
        WebDriver driver; driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
       GooglePage gp=new  GooglePage(driver);
       gp.pageNavigate("https://www.google.com/");
       gp.insertText("Allu vidyasagar");
       Thread.sleep(30);
       gp.submitPage();
       gp.quitPage();
    }
}
