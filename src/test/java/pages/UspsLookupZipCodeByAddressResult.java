package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class UspsLookupZipCodeByAddressResult extends Page {

    public UspsLookupZipCodeByAddressResult(){
       url = "https://tools.usps.com/zip-code-lookup.htm?byaddress";
    }

    @FindBy(xpath ="//li/p[text()='94022']")
            private WebElement resultContainer;


    public boolean isZipCodePresent(String zipCode) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
        wait.until(ExpectedConditions.visibilityOf(resultContainer));
        return resultContainer.getText().contains(zipCode);
    }
}

