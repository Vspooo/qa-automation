package Pages;
import base.CustomLogger.PageTools;
import org.openqa.selenium.By;


import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class CartPage extends PageTools {
    private final By checkOutButton = (By.xpath("//button[@data-test = 'checkout']"));
    private final By cartHeader = (By.xpath("//div[@class='header_secondary_container']"));
    public void clickCheckOutButton(){
        click(checkOutButton);
    }

    public boolean isCartPagePresent(){
        return isElementVisible(cartHeader);

    }

}
