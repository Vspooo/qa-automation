package Pages;
import com.codeborne.selenide.*;
import org.apache.hc.core5.util.Asserts;
import org.openqa.selenium.By;


import java.util.List;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;
import static org.openqa.selenium.By.*;

public class MainPage {
    private final ElementsCollection itemNameList = $$(By.xpath("//div[@class ='inventory_item_name']"));
    private final ElementsCollection addItemButtonList = $$(By.xpath("//button[text()='Add to cart']"));

    private final SelenideElement shoppingCartButton = $(By.xpath("//a[@class ='shopping_cart_link']"));

    private final SelenideElement productSortContainer = $(By.xpath("//select[@class ='product_sort_container']"));
    private final ElementsCollection sortContainerValues = $$(By.xpath("//option[@value]"));





    public ElementsCollection getMainPageHeaders(){
        return itemNameList.shouldHave(CollectionCondition.size(6));
    }
    public List<String> getMainPageHeadersText(){
        return itemNameList.texts();
    }
    public ElementsCollection getMainPageAddButtons(){
        return addItemButtonList;
    }

    public void clickShoppingCartButton(){
        shoppingCartButton.shouldBe(Condition.enabled).click();
    }



    public void clickProductSortButton(){
        productSortContainer.shouldBe(Condition.enabled).shouldHave(Condition.attribute("data-test","product_sort_container")).click();
    }

    public ElementsCollection getSortContainerValues(){
        return sortContainerValues;
    }


}
