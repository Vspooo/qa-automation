package Pages;
import com.codeborne.selenide.*;
import org.apache.hc.core5.util.Asserts;
import org.openqa.selenium.By;


import java.util.List;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;
import static org.openqa.selenium.By.*;

public class MainPage {
    private final ElementsCollection itemNameList = $$(By.xpath("//div[@class ='inventory_item_name']"));
    private final ElementsCollection addItemButtonList = $$(By.xpath("//button[text()='Add to cart']"));

    private final SelenideElement shoppingCartButton = $(By.xpath("//a[@class ='shopping_cart_link']"));

    private final SelenideElement checkOutButton = $(By.xpath("//button[@data-test = 'checkout']"));

    private final SelenideElement firstNameInput = $(By.xpath("//input[@data-test='firstName']"));

    private final SelenideElement lastNameInput = $(By.xpath("//input[@data-test='lastName']"));

    private final SelenideElement postalCodeInput = $(By.xpath("//input[@data-test='postalCode']"));

    private final SelenideElement continueButton = $(By.xpath("//input[@data-test='continue']"));

    private final SelenideElement finishButton = $(By.xpath("//button[@data-test='finish']"));

    private final SelenideElement backHomeButton = $(By.xpath("//button[@data-test='back-to-products']"));





    public ElementsCollection getMainPageHeaders(){
        return itemNameList.shouldHave(CollectionCondition.size(6));
    }
    public List<String> getMainPageHeadersText(){
        return itemNameList.texts();
    }
    public ElementsCollection getMainPageAddButtons(){
        return addItemButtonList;
    }

    public void clickShoppingCartButton(){
        shoppingCartButton.shouldBe(Condition.enabled).click();
    }

    public void clickCheckOutButton(){
        checkOutButton.shouldBe(Condition.enabled).shouldHave(Condition.id("checkout")).scrollTo().click();
    }

    public void typeFistNameInput(String firstName){
        firstNameInput.shouldBe(Condition.visible).shouldHave(Condition.name("firstName")).append(firstName);
    }

    public void typeLastNameInput(String lastName){
        lastNameInput.shouldBe(Condition.visible).shouldHave(Condition.name("lastName")).append(lastName);
    }

    public void typePostalCode(String postalCode){
        postalCodeInput.shouldBe(Condition.visible).shouldHave(Condition.name("postalCode")).append(postalCode);
    }

    public void clickContinueButton(){
        continueButton.shouldBe(Condition.enabled).shouldHave(Condition.id("continue")).click();
    }

    public void clickFinishButton(){
        finishButton.shouldBe(Condition.enabled).shouldHave(Condition.id("finish")).scrollTo().click();
    }

    public void clickBackHomeButton(){
        backHomeButton.shouldBe(Condition.enabled).shouldHave(Condition.id("back-to-products")).click();
    }


}
