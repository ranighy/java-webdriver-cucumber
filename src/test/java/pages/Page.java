package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import support.DriverFactory;

import java.time.Duration;

public class Page {

    protected String url;
    protected String title;
    protected WebDriver driver;
    protected WebDriverWait wait;
    protected Actions actions;


    public Page() {
        driver = DriverFactory.getDriver();
        wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        PageFactory.initElements(driver, this);
        actions = new Actions(driver);
    }

    public void open() {
        driver.get(url);
    }

    public String getExpectedTitle() {
        return title;
    }
    public void test() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(driver -> driver.getTitle().equals("Get a Quote"));
    }
}

//package pages;
//
//import org.openqa.selenium.WebDriver;
//
//public abstract class Page {
//    protected WebDriver driver;
//
//    public Page(WebDriver driver) {
//        this.driver = driver;
//    }
//}
