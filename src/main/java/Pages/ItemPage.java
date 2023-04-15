package Pages;

import base.CustomLogger.PageTools;
import org.openqa.selenium.By;

public class ItemPage extends PageTools {
    private final By buttonBackToProduct = By.xpath("//button[@name='back-to-products']");
    private final By addToCartButton = By.xpath("//button[text()='Add to cart']");

    public boolean isItemPagePresent(){
        return isElementVisible(buttonBackToProduct);
    }
    public void clickBackToProductButton(){
        shouldHaveAttribute(buttonBackToProduct,"id","back-to-products");
        click(buttonBackToProduct);
    }
    public void clickAddToCartButton(){
        shouldHaveAttribute(addToCartButton,"class","btn btn_primary btn_small btn_inventory");
        click(addToCartButton);
    }
}
