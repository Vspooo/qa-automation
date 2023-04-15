package Pages;
import base.CustomLogger.PageTools;
import com.codeborne.selenide.*;
import org.openqa.selenium.By;


import java.util.List;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class MainPage extends PageTools {

    private final By swagLogo = By.xpath("//div[@class='app_logo']");

    private final By itemNameList = (By.xpath("//div[@class ='inventory_item_name']"));
    private final By elementByName = By.xpath("//div[text()='%s']");
    private final By addItemButtonList = (By.xpath("//button[text()='Add to cart']"));

    private final By shoppingCartButton = (By.xpath("//a[@class ='shopping_cart_link']"));

    private final By itemsFilter = (By.xpath("//select[@class ='product_sort_container']"));
    private final By optionById = By.xpath("//option[%d]");
    private final By itemFilterValues = (By.xpath("//option[@value]"));



    private final By countOfItemsInCart = (By.xpath("//a[@class='shopping_cart_link']"));






    public ElementsCollection getMainPageHeaders(){
        return (ElementsCollection) getElements(itemNameList);
    }
    public List<String> getElementsNameText(){
        return getElementsText(itemNameList);
    }
    public ElementsCollection getAddButtons(){
        return (ElementsCollection) getElements(addItemButtonList);
    }

    public void clickShoppingCartButton(){

       click(shoppingCartButton);
    }

    public void clickAddToCartButton(){
        shouldHaveAttribute(addItemButtonList,"class","btn btn_primary btn_small btn_inventory");
        click(addItemButtonList);
    }

    public void clickItemFilterButton(){
        shouldHaveAttribute(itemsFilter,"data-test","product_sort_container");
        click(itemsFilter);
    }

   public void clickOptionById(int id){
      click(optionById,id);
   }

    public ElementsCollection getItemFilterValues(){
        return (ElementsCollection) getElements(itemFilterValues);
    }

    public void clickOnItemFilterValue(){
        click(itemFilterValues);
    }





    public boolean isMainPagePresent(){
       return isElementVisible(swagLogo);

    }
    public SelenideElement getAddToCartButtonByIndex(Integer index){
        return getElements(addItemButtonList).get(index);
    }
    public boolean isCartNotEmpty(){
     return isElementNotEmpty(countOfItemsInCart);
    }

    public void clickElementByName(String name){
        click(elementByName,name);
    }

}

