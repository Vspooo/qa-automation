package Pages;
import com.codeborne.selenide.*;
import org.openqa.selenium.By;


import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class CheckOutInformationPage {
    private final SelenideElement firstNameInput = $(By.xpath("//input[@data-test='firstName']"));

    private final SelenideElement lastNameInput = $(By.xpath("//input[@data-test='lastName']"));

    private final SelenideElement postalCodeInput = $(By.xpath("//input[@data-test='postalCode']"));

    private final SelenideElement continueButton = $(By.xpath("//input[@data-test='continue']"));


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
}
