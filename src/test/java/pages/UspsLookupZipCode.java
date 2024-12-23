package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class UspsLookupZipCode extends Page {
    public UspsLookupZipCode() {
        url = "https://tools.usps.com/zip-code-lookup.htm?byaddress";
        title = "ZIP Code™ Lookup | USPS";
    }

//    @FindBy(id = "tAddress")
//    private WebElement streetAddressField;
//
//    @FindBy(id = "tCity")
//    private WebElement cityField;
//
//    @FindBy(id = "tState")
//    private WebElement stateDropdown;
//
//    @FindBy(id = "zip-by-address")
//    private WebElement findButton;

    // Methods to interact with the page
//    public void enterStreetAddress(String address) {
//        streetAddressField.sendKeys(address);
//    }
//
//    public void enterCity(String city) {
//        cityField.sendKeys(city);
//    }
//
//    public void selectState(String state) {
//        Select select = new Select(stateDropdown);
//        select.selectByValue(state);
//    }

//    public void clickFindButton() {
//        findButton.click();
//    }

    @FindBy(xpath = "//a[@id='navsearch']/..")
    private WebElement searchMenu;

    @FindBy(id = "global-header--search-track-search")
    private WebElement searchField;

//    @FindBy(xpath = "//div[@class='repos']//a[text()='FREE BOXES']")
//    private WebElement freeBoxesLink;

//    public void searchForFreeBoxes() {
//        actions.moveToElement(searchMenu).click(freeBoxesLink).perform();
//    }

    public void searchFor(String text) {
//        actions.moveToElement(searchMenu).sendKeys(searchField, text + Keys.ENTER).perform();
        actions.moveToElement(searchMenu).perform();
        searchField.sendKeys(text + Keys.ENTER);
    }
}