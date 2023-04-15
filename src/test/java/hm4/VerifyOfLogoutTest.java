package hm4;

import Pages.BurgerMenuPage;
import base.DefaultTest;
import com.codeborne.selenide.Selenide;
import org.testng.Assert;
import org.testng.annotations.Test;

import static Pages.Pages.*;

public class VerifyOfLogoutTest extends DefaultTest {
    @Test
    public void verifyOfLogoutButton(){
        loginPage().typeUsername("standard_user");
        loginPage().typePassword("secret_sauce");
        loginPage().clickLoginButton();

        Selenide.sleep(1000);

        Assert.assertTrue(mainPage().isMainPagePresent());

        burgerMenuPage().clickOnBurgerMenu();
        Selenide.sleep(1000);
        burgerMenuPage().clickLogoutButton();
        Selenide.sleep(1000);

        Assert.assertTrue(loginPage().isLoginPagePresent());
    }
}
