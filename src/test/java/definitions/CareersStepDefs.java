package definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import support.DriverFactory;

public class CareersStepDefs {
    WebDriver driver = DriverFactory.getDriver();

    @Given("I navigate to careers login page")
    public void iNavigateToCareersLoginPage() {
        driver.get("https://skryabin-careers.herokuapp.com/loginl");
    }
    @When("I enter username")
    public void iEnterUsername(String username) {
        //driver.findElement(By.xpath("//input[@name='username']"));
    }

    @And("I enter password")
    public void iEnterPassword(String  password) {
    }
}
