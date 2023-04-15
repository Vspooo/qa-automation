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
        shouldHaveAttribute(firstNameInput,"name","firstName");
        type(firstName,firstNameInput);
    }

    public void typeLastNameInput(String lastName){
        shouldHaveAttribute(lastNameInput,"name","lastName");
        type(lastName,lastNameInput);
    }

    public void typePostalCode(String postalCode){
        shouldHaveAttribute(postalCodeInput,"name","postalCode");
        type(postalCode,postalCodeInput);
    }

    public void clickContinueButton(){
        shouldHaveAttribute(continueButton,"name","continue");
        click((By) continueButton);
    }

    public boolean isCheckOutInformationPagePresent(){
        return isElementVisible(checkOutInfoContainer);

    }

}
