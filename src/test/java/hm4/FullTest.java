package hm4;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import com.sun.source.tree.AssertTree;
import org.base.DefaultTest;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

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
        SelenideElement expectedPrice = $(By.xpath("//div[@class ='summary_subtotal_label']/text()[2]"));
        ElementsCollection actualPrices = $$(By.xpath("//div[@class ='inventory_item_price']/text()[2]"));
        List<Double> parsedPrice = new ArrayList<>();
        for (int i = 0; i < actualPrices.size(); i++) {
            String s = actualPrices.get(i).toString();
            parsedPrice.add(Double.parseDouble(s));
            
        }



//        Double.parseDouble(actualPrices)
//        for (int i = 0; i < actualPrices.size(); i++) {
//             Double.parseDouble(i);
//
//        }
//        SelenideElement expPrice = $(By.xpath("//div[@class ='summary_subtotal_label']/text()[2]"));
//        ElementsCollection prices = $$(By.xpath("//div[@class ='inventory_item_price']/text()[2]"));
//        int realPrice = 0;
//        for (int i = 0; i < prices.size(); i++) {
//             i+= realPrice;
//        }
//        Assert.assertEquals(expPrice,realPrice);

                ;
        $(By.xpath("//button[@data-test = 'finish']")).shouldBe(Condition.enabled).shouldHave(Condition.id("finish")).scrollTo().click();
        Assert.assertTrue($(By.xpath("//div[@class= 'checkout_complete_container']")).is(Condition.visible));
        $(By.xpath("//button[@data-test = 'back-to-products']")).shouldBe(Condition.enabled).shouldHave(Condition.id("back-to-products")).click();


    }
}
