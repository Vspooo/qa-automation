package Pages;
import com.codeborne.selenide.*;
import org.apache.hc.core5.util.Asserts;
import org.openqa.selenium.By;


import java.util.List;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;
import static org.openqa.selenium.By.*;
public class CartPage {
    private final SelenideElement checkOutButton = $(By.xpath("//button[@data-test = 'checkout']"));




    public void clickCheckOutButton(){
        checkOutButton.shouldBe(Condition.enabled).shouldHave(Condition.id("checkout")).scrollTo().click();
    }

}
