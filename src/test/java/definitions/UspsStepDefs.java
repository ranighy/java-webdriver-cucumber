package definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.PriorityMailPage;
import pages.UspsLookupZipCodeByAddressForm;
import pages.UspsLookupZipCodeByAddressResult;


import static org.junit.Assert.assertEquals;


public class UspsStepDefs {
    UspsLookupZipCodeByAddressForm form = new UspsLookupZipCodeByAddressForm();
    UspsLookupZipCodeByAddressResult result = new UspsLookupZipCodeByAddressResult();
    PriorityMailPage page = new PriorityMailPage();

    @Given("I navigate to {string} page oop")
    public void iNavigateToPage(String pageName) {
        page.open();
    }

    @And("I fill out {string} street, {string} city, {string} state, {string} zip code")
    public void iFillOutStreetCityState(String street, String city, String state, String zip) {
        form.enterFields(street, city, state, zip);

    }
    @And("I click {string} tab")
    public void iClickTab(String find) {
        form.clickFindTab();
    }
    @Then("I validate {string} zip code exists in the result")

    public void iValidateZipCodeExistsInTheResult(String resultverify) {
        result.isZipCodePresent(resultverify);
    }

    @When("I click Ship Now from priority mail page")
    public void iClickShipNowFromPriorityMailPage() {
        page.open();
        page.clickShipNow();
    }
    @Then("I should see {string} page")
    public void iShouldSeePage(String signInPage) {
        page.switchToWindow();
        page.getVerifyMessage();
    }

    @Then("I validate {string} message present")
    public void iValidateMessagePresent(String expectedMessage) {
        assertEquals(expectedMessage, page.getVerifyMessage());

    }




}

