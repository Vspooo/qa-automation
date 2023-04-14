package Pages;

import base.CustomLogger.PageTools;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import java.util.List;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class LoginPage extends PageTools {
    private final By usernameInput = (By.xpath("//input[@placeholder = 'Username']"));
    private final By passwordInput = (By.xpath("//input[@placeholder = 'Password']"));

    private final By loginButton = (By.xpath("//input[@data-test ='login-button']"));




    public void typeUsername(String username) {
    type(username,usernameInput);
   }

   public void typePassword(String password){
     type(password,passwordInput);
   }
   public void clickLoginButton(){
        click(loginButton);
    }









}
