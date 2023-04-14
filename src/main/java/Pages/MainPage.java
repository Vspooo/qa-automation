package Pages;
import base.CustomLogger.PageTools;
import com.codeborne.selenide.*;
import org.openqa.selenium.By;


import java.util.List;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class MainPage extends PageTools {
    private final By itemNameList = (By.xpath("//div[@class ='inventory_item_name']"));
    private final By addItemButtonList = (By.xpath("//button[text()='Add to cart']"));

    private final By shoppingCartButton = (By.xpath("//a[@class ='shopping_cart_link']"));

    private final By itemsFilter = (By.xpath("//select[@class ='product_sort_container']"));
    private final By itemFilterValues = (By.xpath("//option[@value]"));

    private final By burgerMenu = (By.xpath("//button[text()='Open Menu']"));

    private final By logoutButton = (By.xpath("//a[text()='Logout']"));
    private final By countOfItemsInCart = (By.xpath("//a[@class='shopping_cart_link']"));







    public ElementsCollection getMainPageHeaders(){
        return (ElementsCollection) getElements(itemNameList);
    }
    public List<String> getMainPageHeadersText(){
        return getElementsText(itemNameList);
    }
    public ElementsCollection getMainPageAddButtons(){
        return (ElementsCollection) getElements(addItemButtonList);
    }

    public void clickShoppingCartButton(){
       click(shoppingCartButton);
    }

    public void clickAddToCartButton(){
        click(addItemButtonList);
    }

    public void clickItemFilterButton(){
        click(itemsFilter);
        shouldHaveDataTest(itemsFilter,"product_sort_container");
    }

    public ElementsCollection getItemFilterValues(){
        return (ElementsCollection) getElements(itemFilterValues);
    }

    public void clickOnItemFilterValue(){
        click(itemFilterValues);
    }

    public void clickOnBurgerMenu(){
        click(burgerMenu);
    }

    public void clickLogoutButton(){
        click(logoutButton);
    }

    public boolean isMainPagePresent(){
       return isElementVisible(burgerMenu);

    }
    public SelenideElement getAddToCartButtonByIndex(Integer index){
        return getElements(addItemButtonList).get(index);
    }
    public boolean isCartNotEmpty(){
     return isElementNotEmpty(countOfItemsInCart);
    }

}
