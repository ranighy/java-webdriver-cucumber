package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import support.DriverFactory;

public class QuoteResult extends Page {

    public QuoteResult() {
        url = "https://skryabin.com/market/quote.html";
        title = "Get a Quote";

    }

    // selectors
        @FindBy(xpath = "//b[@name='username']")
        private WebElement username;

        @FindBy(xpath = "//b[@name='email']")
        private WebElement email;

        @FindBy(xpath = "//b[@name='password']")
        private WebElement password;

        @FindBy(xpath = "//b[@name='firstName']")
        private WebElement firstName;

        @FindBy(xpath = "//b[@name='lastName']")
        private WebElement lastName;

        @FindBy(xpath = "//b[@name='name']")
        private WebElement name;

        @FindBy(xpath = "//b[@name='agreedToPrivacyPolicy']")
        private WebElement agreedToPrivacyPolicy;

        @FindBy(xpath = "//b[@name='thirdPartyAgreement']")
        private WebElement thirdPartyAgreement;

        // methods

        public String getUsername() {
            return username.getText();
        }

        public String getEmail() {
            return email.getText();
        }

        public String getPassword() {
            return password.getText();
        }

        public String getFirstName() {
            return firstName.getText();
        }

        public String getLastName() {
            return lastName.getText();
        }

        public String getName() {
            return name.getText();
        }

        public boolean isAgreedToPrivacyPolicy() {
            return Boolean.parseBoolean(agreedToPrivacyPolicy.getText());
        }
        public String getThirdPartyAgreement() {
                return thirdPartyAgreement.getText();
            }



            // different way method  to ThirdPartyAgreementAccepted


//        public boolean isThirdPartyAgreementAccepted() {
//        if (thirdPartyAgreement.getText().equals("accepted")) {
//            return true;
//        } else if (thirdPartyAgreement.getText().equals("declined")) {
//            return false;
//        } else {
//            throw new Error("Unknown result : " + thirdPartyAgreement.getText());
//        }
//    }

        }
