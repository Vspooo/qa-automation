package Pages;

import base.CustomLogger.PageTools;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import java.util.List;

import static com.codeborne.selenide.Selenide.*;

public class LoginPage extends PageTools {
    private final By usernameInput = (By.xpath("//input[@placeholder = 'Username']"));
    private final By passwordInput = (By.xpath("//input[@placeholder = 'Password']"));

    private final By loginButton = (By.xpath("//input[@data-test ='login-button']"));

    private final By errorMessage = By.xpath("//h3[@data-test='error']");




    public void typeUsername(String username) {
    shouldHaveAttribute(usernameInput,"id","user-name");
    type(username,usernameInput);
   }

   public void typePassword(String password){
     shouldHaveAttribute(passwordInput,"id","password");
     type(password,passwordInput);
   }
   public void clickLoginButton(){
        shouldHaveAttribute(loginButton,"id","login-button");
        click(loginButton);
    }

    public boolean isLoginPagePresent(){
       return isElementVisible(usernameInput);
    }

    public boolean isLoginUnsuccessful(){
        return isElementVisible(errorMessage);
    }









}
