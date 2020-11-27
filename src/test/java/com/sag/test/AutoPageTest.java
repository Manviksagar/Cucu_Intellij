package com.sag.test;

import com.sag.page.AutoPraticeSite;
import com.sag.page.GooglePage;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.ITestContext;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class AutoPageTest {
    public WebDriver driver;
    public AutoPraticeSite gp;

    @BeforeTest
    public void setup(ITestContext ctx) throws MalformedURLException {
       //String host = "localhost";
        String host = "192.168.40.1";
        DesiredCapabilities dc;

        dc = DesiredCapabilities.chrome();

        if(System.getProperty("HUB_HOST") != null){
            host = System.getProperty("HUB_HOST");
        }

        String testName = ctx.getCurrentXmlTest().getName();

        String completeUrl = "http://" + host + ":4444/wd/hub";
        //dc.setCapability("name", testName);
       // dc.setPlatform(Platform.LINUX);
        this.driver = new RemoteWebDriver(new URL(completeUrl), dc);
        this.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //WebDriverManager.chromedriver().setup();

        //this.driver = new ChromeDriver();
    }

    @Test
    public void test1() throws MalformedURLException, InterruptedException {

        //System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\Va185060\\\\Desktop\\\\sag\\\\chromedriver.exe");
        //WebDriverManager.chromedriver().setup();

        //WebDriver driver; driver = new ChromeDriver();

        gp=new  AutoPraticeSite(this.driver);
        gp.pageNavigate("http://automationpractice.com/index.php");
        gp.insertText("blog.cucumber@gmail.com","Cucumber@blog");

        gp.submitPage();
        gp.quitPage();

    }

}
