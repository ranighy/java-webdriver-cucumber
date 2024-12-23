package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class UspsSeachResults extends Page {

    public UspsSeachResults() {
        title = "Search Results Page | USPS";
    }

    @FindBy(css = ".spinner-content")
    private WebElement spinner;

    @FindBy(xpath = "//ul[@id='records']/li")
    private List<WebElement> resultItems;

    private WebElement filterElement(String text) {
        return driver.findElement(By.xpath("//label[text()='" + text + "']"));
    }

    public void filterResults(String text) {
        wait.until(ExpectedConditions.invisibilityOf(spinner));
        filterElement(text).click();
    }

    public int getSearchResultsCount() {
        wait.until(ExpectedConditions.invisibilityOf(spinner));
        return resultItems.size();
    }

}

