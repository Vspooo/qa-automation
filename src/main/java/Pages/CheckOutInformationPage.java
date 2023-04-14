package Pages;
import base.CustomLogger.PageTools;
import com.codeborne.selenide.*;
import org.openqa.selenium.By;


import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class CheckOutInformationPage extends PageTools {
    private final By firstNameInput = (By.xpath("//input[@data-test='firstName']"));

    private final By lastNameInput = (By.xpath("//input[@data-test='lastName']"));

    private final By postalCodeInput =(By.xpath("//input[@data-test='postalCode']"));

    private final By continueButton = (By.xpath("//input[@data-test='continue']"));
    private final By checkOutInfoContainer = (By.xpath("//div[@class='checkout_info_container']"));


    public void typeFistNameInput(String firstName){
        type(firstName,firstNameInput);
        isConditionName(firstNameInput,"firstName");
    }

    public void typeLastNameInput(String lastName){
        type(lastName,lastNameInput);
        isConditionName(lastNameInput,"lastName");
    }

    public void typePostalCode(String postalCode){
        type(postalCode,postalCodeInput);
        isConditionName(postalCodeInput,"postalCode");
    }

    public void clickContinueButton(){
        click((By) continueButton);
    }

    public boolean isCheckOutInformationPagePresent(){
        return isElementVisible(checkOutInfoContainer);

    }

}
