package Pages;

import base.CustomLogger.PageTools;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class CheckOutCompletePage extends PageTools {
    private final By backHomeButton = By.xpath("//button[@data-test='back-to-products']");
    private final By checkOutCompleteContainer = By.xpath("//div[@id='checkout_complete_container']");


    public void clickBackHomeButton(){
        click(backHomeButton);
       shouldHaveId(checkOutCompleteContainer,"checkout_complete_container");
    }

    public boolean checkingIfOurPurchaseIsSuccessful(){
      return isElementVisible(checkOutCompleteContainer);
    }
}
