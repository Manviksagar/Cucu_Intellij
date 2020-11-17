package com.sag.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AutoPraticeSite {

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
        PageFactory.initElements(driver,this);

    }

    public void pageNavigate(String url){

        driver.get(url);
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



