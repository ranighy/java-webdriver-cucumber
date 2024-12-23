package definitions;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.assertj.core.api.Assertions;
import org.junit.experimental.categories.Category;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.*;
import support.DriverFactory;

import java.util.HashMap;

import static org.assertj.core.api.Assertions.assertThat;

public class NopStepDefs {
     WebDriver driver = DriverFactory.getDriver();
     NOPRegister nopRegister = new NOPRegister();
     NOPLogin nopLogin = new NOPLogin();
     NOPHome nopHome = new NOPHome();
     NOPProduct nopProduct = new NOPProduct();
     NOPCart nopCart = new NOPCart();
    HashMap<String,String>user;
    String mainWindow;

    @Given("I am on the nopCommerce homepage")
    public void iAmOnTheNopCommerceHomepage() {
        driver.get("https://nop-qa.portnov.com/");
    }

    @Then("I check to see page title contains {string}")
    public void iCheckToSeePageTitleContains(String titleString) {
        WebElement titleElement = driver.findElement(By.xpath("//h1[contains(text(), '" + titleString + "')]"));
        assertThat(titleElement.getText()).contains(titleString);
    }

    @When("I click on the {string} category tab")
    public void iClickOnTheCategoryTab(String category) {

        if(category.equals("Computers")){
            driver.findElement(By.xpath("//ul[@class ='top-menu notmobile']//a[text()='Computers ']")).click();
        }
       else if (category.equals("Electronics")){
           driver.findElement(By.xpath("//ul[@class ='top-menu notmobile']//a[text()='Electronics ']")).click();
       }
        else if (category.equals("Apparel")){
            driver.findElement(By.xpath("//ul[@class ='top-menu notmobile']//a[text()='Apparel ']")).click();
        }
        else if (category.equals("Digital downloads")){
            driver.findElement(By.xpath("//ul[@class ='top-menu notmobile']//a[text()='Digital downloads ']")).click();
        }
        else if (category.equals("Books")){
            driver.findElement(By.xpath("//ul[@class ='top-menu notmobile']//a[text()='Books ']")).click();
        }
        else if (category.equals("Jewelry")){
            driver.findElement(By.xpath("//ul[@class ='top-menu notmobile']//a[text()='Jewelry ']")).click();
        }
        else if (category.equals("Gift Cards")){
            driver.findElement(By.xpath("//ul[@class ='top-menu notmobile']//a[text()='Gift Cards ']")).click();
        }
        else {
            throw new IllegalArgumentException("Invalid category: " + category);
        }

    }

    @Given("I am on the registration page")
    public void iAmOnTheRegistrationPage() {
        nopRegister.open();

    }

    @When("I register with a Default User")
    public void iRegisterWithADefaultUser() {
        //Fill out the Registered User AND store the users email and password
        this.user =  nopRegister.registerUser();

    }

    @Then("I should see a registration success message")
    public void iShouldSeeARegistrationSuccessMessage() {
        nopRegister.waitForRegistrationResultMessage();
    }

    @When("I register using first name {string}, last name {string}, email {string}, and password {string}")
    public void iRegisterUsingFirstNameLastNameEmailAndPassword(String fname, String lname, String email , String password ) {
        nopRegister.registerUser(fname,lname,email,password);
    }

    @And("I click Logout")
    public void iClickLogout() {
        nopRegister.clickLogoutButton();
    }
    @When("I am on the login page")
    public void iAmOnTheLoginPage() {
        nopLogin.open();
    }

    @When("I enter Default Credentials")
    public void iEnterDefaultCredentials() {
        String email = user.get("email");
        String password = user.get("password");
        nopLogin.login(user.get("email"), user.get("password"));

    }

//    @Then("I verify something")
//    public void iVerifySomething() {
//    }


    @And("I select the product {string}")
    public void iSelectTheProduct(String text) {
        nopHome.clickProduct(text);

    }

    @And("I click on the {string} subcategory in the sidebar")
    public void iClickOnTheSubcategoryInTheSidebar(String subcategory) {
           nopHome.clickSubCategory(subcategory);
    }

    @And("I add the product to the cart")
    public void iAddTheProductToTheCart() {
        nopProduct.addToCart();

    }

    @And("I click on Shopping cart tab")
    public void iClickOnShoppingCartTab() {
       nopHome.goToShopingCart();
    }

    @Then("I proceed to the checkout page")
    public void iProceedToTheCheckoutPage() {
        nopCart.acceptTOS();
        nopCart.clickCheckout();
    }
    //Windows

    @When("I click on the {string} link in the footer")
    public void iClickOnTheLinkInTheFooter(String socials) throws InterruptedException {
        this.mainWindow = nopHome.getMainWindowHandle();
        nopHome.clickSocial(socials.toLowerCase());
        Thread.sleep(2000);

    }

    @Then("I should be redirected to the {string} page")
    public void iShouldBeRedirectedToThePage(String social) {
        nopHome.switchToWindow();
        nopHome.verifyTitle(social);

        //We need two methods from NOPHome
        //switch to new window
        //Assert
    }

    @When("I close the new tab")
   public void iCloseTheNewTab() {
            nopHome.closeWindow();
        
    }

    @Then("I should return back to nopCommerce homepage")
    public void iShouldReturnBackToNopCommerceHomepage() {
        nopHome.switchToWindow();
        nopHome.verifyTitle("Your store. Home page title");


    }
}

