package hm4;

import base.DefaultTest;
import com.codeborne.selenide.Selenide;
import org.testng.Assert;
import org.testng.annotations.Test;

import static Pages.Pages.*;

public class VerifyClickElementByIdTest extends DefaultTest {
    @Test
    public void verifyClickElementById(){
        loginPage().typeUsername("standard_user");
        loginPage().typePassword("secret_sauce");
        loginPage().clickLoginButton();
        mainPage().clickElementByName("Sauce Labs Onesie");
        Selenide.sleep(1000);
        Assert.assertTrue(itemPage().isItemPagePresent());
        itemPage().clickBackToProductButton();
        Selenide.sleep(1000);

    }
}
