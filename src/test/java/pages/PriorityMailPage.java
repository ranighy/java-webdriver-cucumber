package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Set;

public class PriorityMailPage extends Page {
    public PriorityMailPage() {
        url = "https://www.usps.com/ship/priority-mail.htm";

    }

    @FindBy(xpath = "//p[@class='button--holder']//a[contains(text(), 'Ship Now')]")
    private WebElement shipNowButton;

    @FindBy(xpath = "//div[@class='row']//h2[contains(text(),'Already have an account?')]")
    private WebElement message;

    public void clickShipNow() {
        shipNowButton.click();
    }
    public void switchToWindow() {
        Set<String> windowHandles = driver.getWindowHandles();
        for (String handle : windowHandles) {
            driver.switchTo().window(handle);
        }

    }
    public String getVerifyMessage() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(message));
        return message.getText();
    }
}





