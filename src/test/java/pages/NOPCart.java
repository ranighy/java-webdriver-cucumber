package pages;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.WebElement;

public class NOPCart extends Page {
    public NOPCart() {

    }

    @FindBy(id = "checkout")
    private WebElement checkout;

   // @FindBy(id = "termsofservice")
    @FindBy(xpath="//label[@for='termsofservice']")
    private WebElement tos;

    public void acceptTOS() {
        tos.click();

    }

    public void clickCheckout() {
        checkout.click();


    }

}
