package PageObjectModel;

import org.openqa.selenium.WebDriver;

public class LoginElements extends BasePage{

    public LoginElements(WebDriver driver) {
        super(driver);
    }

    public void userEmailText(String email){
        driver.findElement(LocatorsCSS.signInEmail).sendKeys(email);
    }

    public void userPasswordText(String password){
        driver.findElement(LocatorsCSS.signInPassword).sendKeys(password);
    }

    public void loginEmailNextBtn(){
        driver.findElement(LocatorsCSS.signInEmailNext).click();
    }

    public void loginPasswordNextBtn(){
        driver.findElement(LocatorsCSS.signInPasswordNext).click();
    }
}
