package com.library_sample.pages;



import com.library_sample.utilities.BrowserUtils;
import com.library_sample.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BasePage {

    public LoginPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id="inputEmail")
    public WebElement userName;


    @FindBy(id="inputPassword")
    public WebElement password;

    @FindBy(xpath="//button[normalize-space()='Sign in']")
    public WebElement submit;



    public void login(String userNameStr, String passwordStr) {
        BrowserUtils.sleep(2);
        userName.sendKeys(userNameStr);
        password.sendKeys(passwordStr);
        submit.click();
        // verification that we logged
    }

}
