package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.HashMap;
import java.util.concurrent.TimeUnit;

public class BasePage {

    WebDriver driver;

    public BasePage(WebDriver driver) {
        this.driver = driver;
    }

    public BasePage(){

    }

    public WebDriver getDriver() {
        return driver;
    }

    public void setup(){

        System.setProperty("webdriver.gecko.driver", "C:\\bin/geckodriver.exe");
        HashMap prefs = new HashMap();
        prefs.put("dom.webnotifications.enabled", false);

        // !! disable notifications !!
        FirefoxOptions options = new FirefoxOptions();
        options.addPreference("dom.webnotifications.enabled", false);

        this.driver = new FirefoxDriver(options);
    }

    public void visit(String url){
        driver.get(url);
        driver.manage().window().maximize();
        getDriver().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    public WebElement findElement(By locator){

        return driver.findElement(locator);
    }

    public void waitForBy(By locator){
        WebDriverWait wait = new WebDriverWait(getDriver(), 10);
        wait.until(ExpectedConditions.elementToBeClickable(findElement(locator)));
    }

    public WebElement findString(String string) {
        return driver.findElement(By.xpath(string));

    }

    public void waitForString(String removed){
            WebDriverWait wait = new WebDriverWait(getDriver(), 10);
            wait.until(ExpectedConditions.elementToBeClickable(findString(removed)));
    }

    public void search(String searchTerm){
        WebElement element1 = findElement(LocatorsCSS.search);
        element1.click();
        element1.sendKeys(searchTerm);
        element1.sendKeys(Keys.ENTER);
    }

    public void searchAndClickElement(String searchTerm, By locator){
        search(searchTerm);
        waitForBy(locator);
        findElement(locator).click();

    }

}
