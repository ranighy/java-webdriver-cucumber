package definitions;
//Anna Code
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;

import static org.assertj.core.api.Assertions.assertThat;

public class PracticeQuoteStepDefs {
//    WebDriver driver = DriverFactory.getDriver();
//        QuoteForm quoteForm = new QuoteForm();
//       // QuoteResult quoteResult = new QuoteResult();


     //   @Given("I navigate to {string} page")
        //public void iNavigateToPage(String arg0) {
//        driver.navigate().to("https://skryabin.com/market/quote.html");
//            driver.get("https://skryabin.com/market/quote.html");

      //  }

//        @When("I fill out the required fields ont the form")
//        public void iFillOutTheRequiredFieldsOntTheForm() {
//            driver.findElement(By.xpath("//input[@id='name']")).click();
//            driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("John");
//            driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys("Doe");
//            driver.findElement(By.xpath("//span[contains(text(),'Save')]")).click();
//            driver.findElement(By.xpath("//input[@name='username']")).sendKeys("john_doe");
//            driver.findElement(By.xpath("//input[@name='email']")).sendKeys("test@gmail.com");
//            driver.findElement(By.xpath("//input[@id='password']")).sendKeys("123456");
//            driver.findElement(By.xpath("//input[@id='confirmPassword']")).sendKeys("123456");

            //Accept Privacy and Policy
//            driver.findElement(By.xpath("//input[@name='agreedToPrivacyPolicy']")).click();
        }

//        @And("I submit the form")
//        public void iSubmitTheForm() {
//           driver.findElement(By.xpath("//button[@id='formSubmit']")).click();
     //   }
//
//        @Then("I should see required fields submitted successfully")
//        public void iShouldSeeRequiredFieldsSubmittedSuccessfully() {

          //  String usernameText = driver.findElement(By.xpath("//b[@name='username']")).getText();
//        Assert.assertEquals("annasad", usernameText);

//            assertThat(usernameText).isEqualTo("john_doe");
//            assertThat(usernameText.length()).isGreaterThan(3);
//            assertThat(usernameText).contains("john");
//            assertThat(usernameText).containsIgnoringCase("John");
//



//            String firstNameText = driver.findElement(By.xpath("//b[@name='firstName']")).getText();
//            Assert.assertEquals("John",firstNameText);
//
//            String lastNameText = driver.findElement(By.xpath("//b[@name='lastName']")).getText();
//            Assert.assertEquals("Doe",lastNameText);
//
//            String fullNameText = driver.findElement(By.xpath("//b[@name='name']")).getText();
//            Assert.assertEquals("John Doe",fullNameText);
//
//            String emailText = driver.findElement(By.xpath("//b[@name='email']")).getText();
//            Assert.assertEquals("test@gmail.com",emailText);

//            String passwordText = driver.findElement(By.xpath("//b[@name='password']")).getText();
//            Assert.assertEquals("[entered]", passwordText);
//
//            String privacyPolicyText = driver.findElement(By.xpath("//b[@name='agreedToPrivacyPolicy']")).getText();
//            Assert.assertEquals("true", privacyPolicyText);
//
//
//
//        }

        //Example with Page Object Model
//
//        @When("I fill out the required fields ont the form oop")
//        public void iFillOutTheRequiredFieldsOntTheFormOop() {
//            quoteForm.fillUsername("john.doe");
//            quoteForm.fillEmail("john.doe@gmail.com");
//            quoteForm.fillPassword("Password123");
//            quoteForm.fillName("John", "Doe");
//            quoteForm.acceptToPrivacyPolicy();
//
//        }
//
//        @And("I submit the form oop")
//        public void iSubmitTheFormOop() {
//            quoteForm.clickSubmitButton();
//        }


//        //Homework
//        @Then("I should see required fields submitted successfully oop")
//        public void iShouldSeeRequiredFieldsSubmittedSuccessfullyOop() {
//            assertThat(quoteResult.getFieldUsername()).isEqualTo("john.doe");
//            assertThat(quoteResult.getFieldEmail()).isEqualTo("john.doe@gmail.com");
//            assertThat(quoteResult.getFieldPassword()).isEqualTo("[entered]");
//            assertThat(quoteResult.getFieldFullName()).isEqualTo("John Doe");
//            assertThat(quoteResult.getFieldFirstName()).isEqualTo("John");
//            assertThat(quoteResult.getFieldLastName()).isEqualTo("Doe");
//            assertThat(quoteResult.getFieldAgreedToPrivacyPolicy()).isEqualTo("true");
//
//
//        }
//    }

//}
