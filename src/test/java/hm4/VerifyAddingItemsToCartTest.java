package hm4;

import base.CustomLogger.PageTools;
import base.DefaultTest;
import org.testng.Assert;
import org.testng.annotations.Test;

import static Pages.Pages.loginPage;
import static Pages.Pages.mainPage;

public class VerifyAddingItemsToCartTest extends DefaultTest {
    @Test(priority = 1)
    public void VerifyToAddOneItemToCart(){
        loginPage().typeUsername("standard_user");
        loginPage().typePassword("secret_sauce");
        loginPage().clickLoginButton();
        mainPage().getAddToCartButtonByIndex(0).click();
        Assert.assertTrue(mainPage().isCartNotEmpty());
    }
    @Test(priority = 2)
    public void VerifyAddingItemToCart(){
        loginPage().typeUsername("standard_user");
        loginPage().typePassword("secret_sauce");
        loginPage().clickLoginButton();

        while (mainPage().getMainPageAddButtons().size()>0){
            mainPage().clickAddToCartButton();
        }

        Assert.assertTrue(mainPage().isCartNotEmpty());

    }

}
