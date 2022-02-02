package PageObjects;

import Super.Supertestscript;
import com.Excel.ExcelOperations;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class LoginPage {

    @FindBy (id="user-name")
    private WebElement user;

    @FindBy(how = How.ID,using = "password")
    private WebElement password;

    @FindBy(xpath = "//input[@data-test='login-button']")
    private WebElement button;

    public void enterCredentials(String userid){
        user.sendKeys(userid);
    }
    public void enterPassword(String pass){
        password.sendKeys(pass);
    }
    public void enter(){
        button.click();
    }
   public LoginPage(){
        PageFactory.initElements(Supertestscript.driver,this);
    }
}

