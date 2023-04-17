package Pages;
import base.CustomLogger.PageTools;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import org.openqa.selenium.By;


import java.util.List;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class CartPage extends PageTools {
    private final By cartItem = By.xpath("//div[@class ='cart_item']");
    private final By removeButton = By.xpath("//button[@class='btn btn_secondary btn_small cart_button']");
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
    public ElementsCollection getRemoveButtons(){
        return (ElementsCollection) getElements(removeButton);
    }
    public  void clickRemoveButton(){
        isCondition(removeButton, Condition.enabled);
        click(removeButton);
    }

   public boolean isCartEmpty(){
        return isElementVisible(cartItem);
   }
}
