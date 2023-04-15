package hm4;

import base.DefaultTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import static com.codeborne.selenide.Selenide.*;

import static Pages.Pages.*;

public class AttemptToPurchaseProductTest extends DefaultTest {
    @Test
    public void attemptToPurchaseProducts(){
        loginPage().typeUsername("standard_user");
        loginPage().typePassword("secret_sauce");
        loginPage().clickLoginButton();

        while (mainPage().getAddButtons().size()>0){
            mainPage().clickAddToCartButton();
        }
        Assert.assertTrue(mainPage().isCartNotEmpty());

        mainPage().clickShoppingCartButton();
        Assert.assertTrue(cartPage().isCartPagePresent());
        cartPage().clickCheckOutButton();
        Assert.assertTrue(checkOutInformation().isCheckOutInformationPagePresent());

        checkOutInformation().typeFistNameInput("vova");
        checkOutInformation().typeLastNameInput("voloshyn");
        checkOutInformation().typePostalCode("30-810");
        checkOutInformation().clickContinueButton();
        Assert.assertTrue(checkOutOverview().isCheckOutOverviewPagePresent());

        checkOutOverview().clickFinishButton();
        Assert.assertTrue(checkOutCompletePage().checkingIfOurPurchaseIsSuccessful());
        sleep(1000);
        checkOutCompletePage().clickBackHomeButton();

    }
}
