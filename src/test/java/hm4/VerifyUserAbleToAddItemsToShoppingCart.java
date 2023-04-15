package hm4;

import base.CustomLogger.PageTools;
import base.DefaultTest;
import org.testng.Assert;
import org.testng.annotations.Test;

import static Pages.Pages.*;

public class VerifyUserAbleToAddItemsToShoppingCart extends DefaultTest {
    @Test
    public void verifyUserAbleToAddItemsToShoppingCart(){
        loginPage().typeUsername("standard_user");
        loginPage().typePassword("secret_sauce");
        loginPage().clickLoginButton();

        while (mainPage().getAddButtons().size()>0){
            mainPage().clickAddToCartButton();
        }
        mainPage().clickShoppingCartButton();
        Assert.assertEquals(mainPage().getElementsNameText(),cartPage().getElementsNamesText());
    }
}
