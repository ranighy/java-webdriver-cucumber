package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static support.DriverFactory.getDriver;

public class Ups extends Page{
    // elemants
    @FindBy(xpath = "//button[@class = 'close_btn_thick']")
    private WebElement cookieClose;
    @FindBy(xpath = "//button[@data-dismiss = 'modal']")
    private WebElement simplifiedShippingClose;

    @FindBy(xpath = "//h2[text()='Try our Simplified Shipping Experience']")
    private WebElement simplifiedShippingExperience;
    @FindBy(xpath = "//button[@class='close' and @data-dismiss='modal']")
    private WebElement closeButton;

    @FindBy(xpath = "//form[@id='ShippingSummaryOriginAdd-Form']//input[@name='singleaddress1']")
    private WebElement addressShipFrom;

    @FindBy(xpath = "//*[@id='ngb-typeahead-0']/button[@id='ngb-typeahead-0-0']")
    private WebElement addressFromList1;

    private String address = "4970 El Camino Real, Los Altos, Ca";
    private String name = "Portnov computer school";
    private String email = "info@portnov.com";

    public void closeCookie() {
        cookieClose.click();
    }

    public void closeShippingModal() {
        simplifiedShippingClose.click();
    }

    public void fillShipFromAddress() throws InterruptedException {
        addressShipFrom.sendKeys(address);
        new WebDriverWait(getDriver(), Duration.ofSeconds(3))
                .until(ExpectedConditions.visibilityOf(addressFromList1));
        addressFromList1.click();
    }

}




