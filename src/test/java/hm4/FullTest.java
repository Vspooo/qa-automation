package hm4;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import base.DefaultTest;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;


import java.util.ArrayList;
import java.util.List;

import static Pages.Pages.*;
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


        ElementsCollection sortContainerValues = mainPage().getSortContainerValues();
        for (int i = 0; i < sortContainerValues.size(); i++) {
            mainPage().clickProductSortButton();
            mainPage().getSortContainerValues().get(i).shouldBe(Condition.enabled).click();
            sleep(3000);
        }

        mainPage().clickShoppingCartButton();
        cartPage().clickCheckOutButton();
        checkOutInformation().typeFistNameInput("Volodymyr");
        checkOutInformation().typeLastNameInput("Voloshyn");
        checkOutInformation().typePostalCode("30-810");
        checkOutInformation().clickContinueButton();
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


        checkOutOverview().clickFinishButton();
         Assert.assertTrue($(By.xpath("//div[@class= 'checkout_complete_container']")).is(Condition.visible));
        checkOutCompletePage().clickBackHomeButton();


        }


        @Test
       public void SecondTest(){
            loginPage().typeUsername("standard_user");
            loginPage().typePassword("secret_sauce");
            loginPage().clickLoginButton();

            ElementsCollection sortContainerValues = mainPage().getSortContainerValues();
            for (int i = 0; i < sortContainerValues.size(); i++) {
                mainPage().clickProductSortButton();
                mainPage().getSortContainerValues().get(i).shouldBe(Condition.enabled).click();
                sleep(3000);
            }


            mainPage().clickShoppingCartButton();
            cartPage().clickCheckOutButton();
            checkOutInformation().typeFistNameInput("Volodymyr");
            checkOutInformation().typeLastNameInput("Voloshyn");
            checkOutInformation().typePostalCode("30-810");
            checkOutInformation().clickContinueButton();
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


            checkOutOverview().clickFinishButton();
            Assert.assertTrue($(By.xpath("//div[@class= 'checkout_complete_container']")).is(Condition.visible));
            checkOutCompletePage().clickBackHomeButton();
        }

    }

