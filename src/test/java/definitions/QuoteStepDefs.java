package definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import static org.assertj.core.api.Assertions.assertThat;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pages.QuoteForm;
import pages.QuoteResult;
import support.DriverFactory;

import static org.junit.Assert.assertThat;
import static support.DriverFactory.getDriver;

public class QuoteStepDefs {

    WebDriver driver = getDriver();
    QuoteForm quoteForm = new QuoteForm();
    QuoteResult quoteResult = new QuoteResult();

     public QuoteStepDefs()
     {
         PageFactory.initElements(DriverFactory.getDriver(), this);
     }


     @When("I fill out required fields one the form oop")
    public void i_fill_out_required_fields_one_the_form_oop() {
        quoteForm.fillUsername("john_doe");
        quoteForm.fillEmail("john.doe@example.com");
        quoteForm.fillPassword("Password123");
        quoteForm.fillName("John", "Doe");
        quoteForm.acceptPrivacyPolicy();
    }

    @And("I  submit the form oop")
    public void i_submit_the_form_oop() {
        quoteForm.clickSubmitButton();

    }

    @Then("I should see required fields submitted successfully oop")
    public void i_should_see_required_fields_submitted_successfully_oop() {
        assertThat(quoteResult.getUsername()).isEqualTo("john_doe");
        assertThat(quoteResult.getEmail()).isEqualTo("john.doe@example.com");
        assertThat(quoteResult.getFirstName()).isEqualTo("John");
        assertThat(quoteResult.getLastName()).isEqualTo("Doe");
        assertThat(quoteResult.getName()).isEqualTo("John Doe");
        assertThat(quoteResult.getPassword()).doesNotContain("Password123");
        assertThat(quoteResult.isAgreedToPrivacyPolicy()).isTrue();

    }

    @And("I {string} third party agreement")
    public void iThirdPartyAgreement(String action) {
        if (action.equals("accept")) {
            quoteForm.acceptThirdPartyAgreement();
        } else if (action.equals("decline")) {
            quoteForm.declineThirdPartyAgreement();
        } else {
            throw new Error("Unknown action: " + action);
        }
    }

    @Then("I verify that third party agreement is {string}")
    public void iVerifyThatThirdPartyAgreementIs(String action) {
        assertThat(quoteResult.getThirdPartyAgreement()).isEqualTo(action);
    }

//    @When("I type {string} contact person name and {string} contact person phone")
//    public void iTypeContactPersonNameAndContactPersonPhone(String name, String phone) {
//        quoteForm.fillContactPersonInformation(name, phone);
//    }

}
// @Given("I navigate to {string} page")
//    public void iNavigateToPage(String pageName) {
//         switch (pageName) {
//            case "quote":
//                quoteForm.open();
//                break;
//            default:
//                System.out.println("Invalid page name: " + pageName);
//        }
//    }















