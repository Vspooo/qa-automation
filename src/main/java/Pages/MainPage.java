package Pages;
import base.CustomLogger.PageTools;
import com.codeborne.selenide.*;
import org.apache.hc.core5.util.Asserts;
import org.openqa.selenium.By;


import java.util.List;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;
import static org.openqa.selenium.By.*;

public class MainPage extends PageTools {
    private final By itemNameList = (By.xpath("//div[@class ='inventory_item_name']"));
    private final By addItemButtonList = (By.xpath("//button[text()='Add to cart']"));

    private final By shoppingCartButton = (By.xpath("//a[@class ='shopping_cart_link']"));

    private final By productSortContainer = (By.xpath("//select[@class ='product_sort_container']"));
    private final By sortContainerValues = (By.xpath("//option[@value]"));

    private final By burgerMenu = (By.xpath("//button[text()='Open Menu']"));

    private final By logoutButton = (By.xpath("//a[text()='Logout']"));







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



    public void clickProductSortButton(){
        click(productSortContainer);
        shouldHaveDataTest(productSortContainer,"product_sort_container");
    }

    public ElementsCollection getSortContainerValues(){
        return (ElementsCollection) getElements(sortContainerValues);
    }

    public void clickOnBurgerMenu(){
        click(burgerMenu);
    }

    public void clickLogoutButton(){
        click(logoutButton);
    }




}
