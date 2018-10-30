package PageObjectModel;

import org.openqa.selenium.WebDriver;

public class AuthenticationFlow extends BasePage {

    public AuthenticationFlow(WebDriver driver) {
        super(driver);
    }

    public AuthenticationFlow(){}


    public void loginUserName(String email){
        LoginElements login = new LoginElements(driver);
        login.userEmailText(email);
        login.loginEmailNextBtn();
    }

    public void loginPassword(String password){
        LoginElements login = new LoginElements(driver);
        login.userPasswordText(password);
        login.loginPasswordNextBtn();
    }

    public void login(String email, String password){
        BasePage basePage = new BasePage(this.driver);

        basePage.visit("https://www.youtube.com/");

        basePage.findElement(LocatorsCSS.signInBtn).click();

        loginUserName(email);
        basePage.waitForBy(LocatorsCSS.signInPasswordNext);
        loginPassword(password);
    }

}
