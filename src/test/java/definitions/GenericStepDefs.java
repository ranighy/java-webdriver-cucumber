package definitions;

import io.cucumber.java.en.Given;
import org.openqa.selenium.WebDriver;
import pages.PriorityMailPage;
import pages.QuoteForm;
import pages.QuoteResult;
import pages.UspsLookupZipCode;
import support.DriverFactory;

public class GenericStepDefs {
    WebDriver driver = DriverFactory.getDriver();
    @Given("I navigate to {string} page")
    public void iNavigateToPage(String pageName) {
        // implicit wait, default is 0
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
//        // page load timeout, default is 300 seconds
//        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));
        switch (pageName) {
            case "usps lookup a zip code by address":
                new UspsLookupZipCode().open();
                break;
            case "quote":
                new QuoteForm().open();
                break;
            case "result":
                new QuoteResult().open();
                break;
            case "usps priority mail":
                // Add the appropriate class and method to open the USPS Priority Mail page
                new PriorityMailPage().open();
                break;
            default:
                throw new Error("Unknown page: " + pageName);
        }
    }
}

