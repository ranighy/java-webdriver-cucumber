package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class UspsLookupZipCodeResult extends Page{
    public UspsLookupZipCodeResult() {
        title = "ZIP Code™ Lookup | USPS";
    }

    @FindBy(id = "zipByAddressDiv")
    private WebElement resultText;

    public String getResultText() {
        // explicit wait:
        wait.until(ExpectedConditions.visibilityOf(resultText));
        // custom wait example:
//         wait.until(driver -> resultText.isDisplayed());
        return resultText.getText();
    }

}

