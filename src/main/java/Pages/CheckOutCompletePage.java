package Pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class CheckOutCompletePage {
    private final SelenideElement backHomeButton = $(By.xpath("//button[@data-test='back-to-products']"));


    public void clickBackHomeButton(){
        backHomeButton.shouldBe(Condition.enabled).shouldHave(Condition.id("back-to-products")).click();
    }
}
