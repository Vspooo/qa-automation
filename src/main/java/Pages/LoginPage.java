package Pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class LoginPage {
    private final SelenideElement usernameInput =  $(By.xpath("//input[@placeholder = 'Username']"));
    private final SelenideElement passwordInput =  $(By.xpath("//input[@placeholder = 'Password']"));

    private final SelenideElement loginButton = $(By.xpath("//input[@data-test ='login-button']"));


    public void typeUsername(String username){
       usernameInput.shouldBe(Condition.visible).shouldHave(Condition.attribute("id","user-name")).append(username);
   }

   public void typePassword(String password){
       passwordInput.shouldBe(Condition.visible).shouldHave(Condition.attribute("id","password")).append(password);
   }
   public void clickLoginButton(){
       loginButton.shouldBe(Condition.enabled).shouldHave(Condition.attribute("name","login-button")).click();
   }


}
