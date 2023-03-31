package hm4;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.base.DefaultTest;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class FullTest extends DefaultTest{
    @Test
    public void FirstTest(){
        $(By.xpath("//input[@placeholder = 'Username']")).shouldBe(Condition.visible).shouldHave(Condition.name("user-name")).append("standard_user");
        $(By.xpath("//input[@placeholder = 'Password']")).shouldBe(Condition.visible).shouldHave(Condition.id("password")).append("secret_sauce");
//        $(By.xpath("//input[@data-test = 'login-button']")).shouldHave(Condition.enabled).click();
        $(By.xpath("//input[@data-test = 'login-button']")).shouldBe(Condition.enabled).shouldHave(Condition.attribute("id","login-button")).click();


        ElementsCollection buttons = $$(By.xpath("//button[@class='btn btn_primary btn_small btn_inventory']"));
        for (int i = 0; i < buttons.size(); i++) {
            $$(By.xpath("//button[@class='btn btn_primary btn_small btn_inventory']")).get(i).shouldBe(Condition.visible).click();
        }
        $(By.xpath("//a[@class = 'shopping_cart_link']")).shouldBe(Condition.enabled).click();
        $(By.xpath("//button[@data-test = 'checkout']")).shouldBe(Condition.enabled).shouldHave(Condition.id("checkout")).scrollTo().click();
        $(By.xpath("//input[@data-test = 'firstName']")).shouldBe(Condition.empty).shouldHave(Condition.id("first-name")).append("Volodymyr");
        $(By.xpath("//input[@data-test = 'lastName']")).shouldBe(Condition.empty).shouldHave(Condition.id("last-name")).append("Voloshyn");
        $(By.xpath("//input[@data-test = 'postalCode']")).shouldBe(Condition.empty).shouldHave(Condition.id("postal-code")).append("30-450");
        $(By.xpath("//input[@data-test = 'continue']")).shouldBe(Condition.enabled).shouldHave(Condition.id("continue")).click();
        $(By.xpath("//button[@data-test = 'finish']")).shouldBe(Condition.enabled).shouldHave(Condition.id("finish")).scrollTo().click();
        $(By.xpath("//button[@data-test = 'back-to-products']")).shouldBe(Condition.enabled).shouldHave(Condition.id("back-to-products")).click();


    }
}
