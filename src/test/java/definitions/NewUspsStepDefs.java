package definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.UspsLookupZipCode;
import pages.UspsLookupZipCodeResult;
import pages.UspsSeachResults;
import pages.UspsSeachResults;
import support.DriverFactory;

import java.time.Duration;

import static org.assertj.core.api.Assertions.assertThat;


public class NewUspsStepDefs  {
    WebDriver driver = DriverFactory.getDriver();
    UspsLookupZipCode uspsLookupZipCode = new UspsLookupZipCode();
    UspsLookupZipCodeResult uspsLookupZipCodeResult = new UspsLookupZipCodeResult();
    UspsSeachResults uspsSeachResults = new UspsSeachResults();

//    @And("I fill out {string} street, {string} city, {string} state")
//    public void iFillOutStreetCityState(String street, String city, String state) throws InterruptedException {
//        uspsLookupZipCode.enterStreetAddress(street);
//        uspsLookupZipCode.enterCity(city);
//        uspsLookupZipCode.selectState(state);
//        uspsLookupZipCode.clickFindButton();
//    }

//    @Then("I validate {string} zip code exists in the result")
//    public void iValidateZipCodeExistsInTheResult(String zip) throws InterruptedException {
//        assertThat(uspsLookupZipCodeResult.getResultText()).contains(zip);
//    }

//    @And("I search for free boxes")
//    public void iSearchForFreeBoxes() {
//        uspsLookupZipCode.searchForFreeBoxes();
//    }

    @When("I hover over search and search for {string}")
    public void iHoverOverSearchAndSearchFor(String text) {
        uspsLookupZipCode.searchFor(text);
    }

    @And("I filter results with {string}")
    public void iFilterResultsWith(String text) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            uspsSeachResults.filterResults(text);
        }

    @Then("I verify {int} results are displayed")
    public void iVerifyResultsAreDisplayed(int count) {
            assertThat(uspsSeachResults.getSearchResultsCount()).isEqualTo(count);
        }

}

//@And("I search for free boxes")
//public void iSearchForFreeBoxes() {
   // uspsLookupZipCode.searchForFreeBoxes();

