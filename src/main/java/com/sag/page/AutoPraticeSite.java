package com.sag.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class AutoPraticeSite {

    private final WebDriverWait wait;
    public WebDriver driver;

    @FindBy(linkText="Sign in")
    private WebElement signin;
    @FindBy(id = "email")
    private WebElement email;
    @FindBy(id = "passwd")
    private WebElement pwd;
    @FindBy(id = "SubmitLogin")
    private WebElement subbtnn;

    public AutoPraticeSite(WebDriver driver) {
        this.driver=driver;
        this.wait = new WebDriverWait(driver, 30);
        PageFactory.initElements(driver,this);

    }

    public void pageNavigate(String url) throws InterruptedException {

        this.driver.get(url);
        this.driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        this.signin.click();

    }

    public void insertText(String email,String pwd){
        this.email.sendKeys(email);
        this.pwd.sendKeys(pwd);
    }

    public void submitPage(){
        this.subbtnn.click();

    }
    public void quitPage(){
        this.driver.quit();
    }
}



