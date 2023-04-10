package Pages;
import com.codeborne.selenide.*;
import org.openqa.selenium.By;


import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class CheckOutOverviewPage {
    private final SelenideElement finishButton = $(By.xpath("//button[@data-test='finish']"));

    public void clickFinishButton(){
        finishButton.shouldBe(Condition.enabled).shouldHave(Condition.id("finish")).scrollTo().click();
    }
}
