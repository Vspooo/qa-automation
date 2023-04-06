package hm4;

import Pages.LoginPage;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import org.base.DefaultTest;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;


import java.util.ArrayList;
import java.util.List;

import static Pages.Pages.loginPage;
import static Pages.Pages.mainPage;
import static com.codeborne.selenide.Selenide.*;

public class FullTest extends DefaultTest {

    @Test
    public void FirstTest() {
       loginPage().typeUsername("standard_user");
        loginPage().typePassword("secret_sauce");
        loginPage().clickLoginButton();

       ElementsCollection buttons = mainPage().getMainPageAddButtons();
        for (int i = 0; i < buttons.size(); i++) {
             mainPage().getMainPageAddButtons().get(i).shouldBe(Condition.enabled).click();

        }
        sleep(10000);

        mainPage().clickShoppingCartButton();
        mainPage().clickCheckOutButton();
        mainPage().typeFistNameInput("Volodymyr");
        mainPage().typeLastNameInput("Voloshyn");
        mainPage().typePostalCode("30-810");
        mainPage().clickContinueButton();
        String expectedPrice = $(By.xpath("//div[@class='summary_subtotal_label']")).text();
        List<String> listPrices = $$(By.xpath("//div[@class ='inventory_item_price']")).texts();


        List<Double> parsedPrice = new ArrayList<>();
        for (int i = 0; i < listPrices.size(); i++) {
            String s = listPrices.get(i).replaceAll("\\$", "");;
            parsedPrice.add(Double.parseDouble(s));
        }
        Object[] objects =parsedPrice.toArray();
        double result = 0;
        for (Object value:objects){
            result +=(double) value;
        }
        String replacedPrice = expectedPrice.replaceAll("Item total: \\$", "");
        double price = Double.parseDouble(replacedPrice);
        Assert.assertEquals(result,price);


        mainPage().clickFinishButton();
         Assert.assertTrue($(By.xpath("//div[@class= 'checkout_complete_container']")).is(Condition.visible));
        mainPage().clickBackHomeButton();


        }
    }

