package Pages;
import base.CustomLogger.PageTools;
import org.openqa.selenium.By;


import java.util.List;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class CartPage extends PageTools {
    private final By elementsNames = By.xpath("//div[@class='inventory_item_name']");
    private final By checkOutButton = (By.xpath("//button[@data-test = 'checkout']"));
    private final By cartHeader = (By.xpath("//div[@class='header_secondary_container']"));


    public void clickCheckOutButton(){
        shouldHaveAttribute(checkOutButton,"name","checkout");
        click(checkOutButton);
    }

    public boolean isCartPagePresent(){
        return isElementVisible(cartHeader);
    }

    public List<String> getElementsNamesText(){
       return getElementsText(elementsNames);
    }



}
