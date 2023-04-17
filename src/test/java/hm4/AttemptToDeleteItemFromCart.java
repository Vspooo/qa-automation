package hm4;

import base.DefaultTest;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.Selenide;
import org.testng.Assert;
import org.testng.annotations.Test;

import static Pages.Pages.*;

public class AttemptToDeleteItemFromCart extends DefaultTest {
    @Test
    public void attemptToDeleteItemFromCart() {
        Assert.assertTrue(loginPage().isLoginPagePresent());
        loginPage().typeUsername("standard_user");
        loginPage().typePassword("secret_sauce");
        loginPage().clickLoginButton();

        Assert.assertTrue(mainPage().isMainPagePresent());
        ElementsCollection addButtonsList = mainPage().getAddButtons();
        while (addButtonsList.size() > 0) {
            mainPage().clickAddToCartButton();
        }
        Assert.assertTrue(mainPage().isCartNotEmpty());
        mainPage().clickShoppingCartButton();
        Assert.assertTrue(cartPage().isCartPagePresent());

        while (cartPage().getRemoveButtons().size() > 0) {
         cartPage().clickRemoveButton();
        }
        Selenide.sleep(1000);
    }
}
