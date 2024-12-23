package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Set;

import static org.assertj.core.api.Assertions.assertThat;

public class NOPHome extends Page {
    public NOPHome() {
        url = "https://nop-qa.portnov.com/";
        title ="Your store. Home page title";
    }
    @FindBy(xpath="//a[@class='ico-cart']")
    private WebElement shoppingCart;

    public void clickCategory(String category) {
        if(category.equals("Computers")){
            driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[text()='Computers ']")).click();
        } else if (category.equals("Electronics")) {
            driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[text()='Electronics ']")).click();
        } else if (category.equals("Apparel")) {
            driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[text()='Apparel ']")).click();
        } else if (category.equals("Digital downloads")) {
            driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[text()='Digital downloads ']")).click();
        } else if (category.equals("Books")) {
            driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[text()='Books ']")).click();
        } else if (category.equals("Jewelry")) {
            driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[text()='Jewelry ']")).click();
        } else if (category.equals("Gift Cards")) {
            driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[text()='Gift Cards ']")).click();
        } else {
            throw new IllegalArgumentException("Invalid category: " + category);
        }
    }

    public void clickSubCategory(String subcategory) {
        if (subcategory.equals("Desktops")) {
            driver.findElement(By.xpath("//div[@class='block block-category-navigation']//a[@href='/desktops']")).click();
        } else if (subcategory.equals("Notebooks")) {
            driver.findElement(By.xpath("//div[@class='block block-category-navigation']//a[@href='/notebooks']")).click();
        } else if (subcategory.equals("Software")) {
            driver.findElement(By.xpath("//div[@class='block block-category-navigation']//a[@href='/software']")).click();
        } else {
            throw new IllegalArgumentException("Invalid subcategory: " + subcategory);
        }
    }

    //Generic Method to click ANY Product
    public void clickProduct(String text) {
        //Storing into an element
        WebElement element = driver.findElement( By.xpath("//*[text()='" + text + "']"));
        //Creating an instance of Webdriver Wait
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        //Waiting Until the element is visible
        wait.until(ExpectedConditions.visibilityOf(element));
        //Clicking element
        element.click();
    }
public void goToShopingCart(){
    shoppingCart.click();

}
public void clickSocial(String social){
        driver.findElement(By.className(social)).click();
}
  public String getMainWindowHandle() {
    return driver.getWindowHandle();
    }
    public void switchToWindow() {
        //Full Way
        Set<String> windowHandles = driver.getWindowHandles();
        for (String handle : windowHandles) {
            driver.switchTo().window(handle);
        }

    }
    public void closeWindow() {
        driver.close();
    }

    public void verifyTitle(String title) {
        assertThat(driver.getTitle()).containsIgnoringCase(title);
    }
}


