package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class UspsLookupZipCodeByAddressForm extends Page {

    public UspsLookupZipCodeByAddressForm() {
        url = "https://tools.usps.com/zip-code-lookup.htm?byaddress";
    }

    @FindBy(xpath = "//input[@id='tAddress']")
    private WebElement street;

    @FindBy(xpath = "//input[@id='tCity']")
    private WebElement city;

    @FindBy(xpath = "//select[@id='tState']")
    private WebElement state;

    @FindBy(xpath = "//input[@id='tZip-byaddress']")
            private WebElement zipcode;

    @FindBy(xpath ="//a[@id='zip-by-address']")
    private WebElement findButton;

    public void enterFields(String streetName, String cityName, String valueState, String zipCode) {
        street.sendKeys(streetName);
        city.sendKeys(cityName);
        selectState(valueState);
        zipcode.sendKeys(zipCode);
    }
    public void selectState(String value) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(state));
        Select select = new Select(state);
        if (value.equals("CA")) {
            select.selectByValue("CA");
        }
    }

public void clickFindTab() {
        findButton.click();
    }
}