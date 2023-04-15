package Pages;
import base.CustomLogger.PageTools;
import org.openqa.selenium.By;


import java.util.List;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class CheckOutOverviewPage extends PageTools {
    private final By finishButton = (By.xpath("//button[@data-test='finish']"));
    private final By checkOutOverviewPageHeader = By.xpath("//span[@class='title']");

    private final By itemPriceList = By.xpath("//div[@class ='inventory_item_price']");

    private final By expectedPrice = By.xpath("//div[@class='summary_subtotal_label']");


    public void clickFinishButton(){
        shouldHaveAttribute(finishButton,"data-test","finish");
        click(finishButton);
    }
    public boolean isCheckOutOverviewPagePresent(){
        return isElementVisible(checkOutOverviewPageHeader);
    }

    public List<String> getItemPriceList(){
        return getElementsText(itemPriceList);
    }

    public String getExpectedPrice(){
       return  getElementText(expectedPrice);
    }


}
