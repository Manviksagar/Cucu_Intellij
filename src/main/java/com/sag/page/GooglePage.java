package com.sag.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GooglePage {
    public  WebDriver driver;

        @FindBy(xpath= "//input[@name='q']")
        private WebElement  name;
        @FindBy(name = "btnK")
        private WebElement button;

    public GooglePage(WebDriver driver) {
        this.driver=driver;
        PageFactory.initElements(driver,this);

            }

     public void pageNavigate(String url){

         driver.get(url);

     }

     public void insertText(String search){
         this.name.sendKeys(search);
     }

     public void submitPage(){
        this.button.click();

     }
     public void quitPage(){
        this.driver.quit();
     }
}
