package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import support.DriverFactory;

public class CareersLogin {

    CareersLogin(){
        PageFactory.initElements(DriverFactory.getDriver(), this);
    }

    @FindBy(xpath = "//input[@placeholder='Please enter an Email']']")
    private WebElement userName;

    @FindBy(xpath = "//input[@placeholder='Please enter an Email']']")
    private WebElement passWord;










}
