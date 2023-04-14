package Pages;
import base.CustomLogger.PageTools;
import com.codeborne.selenide.*;
import org.openqa.selenium.By;


import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class CheckOutOverviewPage extends PageTools {
    private final By finishButton = (By.xpath("//button[@data-test='finish']"));
    private final By checkOutOverviewPageHeader = By.xpath("//span[@class='title']");


    public void clickFinishButton(){
        click(finishButton);
        shouldHaveDataTest(finishButton,"finish");
    }
    public boolean isCheckOutOverviewPagePresent(){
        return isElementVisible(checkOutOverviewPageHeader);
    }

}
