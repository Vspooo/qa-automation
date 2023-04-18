package hm4;

import Pages.Pages;
import base.DefaultTest;
import com.codeborne.selenide.Selenide;
import org.testng.Assert;
import org.testng.annotations.Test;

import static Pages.Pages.*;

public class VerifySocialLinksButtonsTest extends DefaultTest {
    @Test(priority = 1)
    public void verifyTwitterSocialLinkButton(){
        loginPage().typeUsername("standard_user");
        loginPage().typePassword("secret_sauce");
        loginPage().clickLoginButton();

        Assert.assertTrue(mainPage().isMainPagePresent());

        socialPage().clickTwitterButton();
        Selenide.switchTo().window(1);

        Selenide.sleep(3000);

        Assert.assertTrue(socialPage().isTwitterPagePresent());

        Selenide.sleep(1000);

    }

    @Test(priority = 2)
    public void verifyFacebookSocialLinkButton(){
        loginPage().typeUsername("standard_user");
        loginPage().typePassword("secret_sauce");
        loginPage().clickLoginButton();

        Assert.assertTrue(mainPage().isMainPagePresent());

        socialPage().clickFaceBookButton();
        Selenide.switchTo().window(2);

        Selenide.sleep(3000);

        Assert.assertTrue(socialPage().isFaceBookPagePresent());

        Selenide.sleep(1000);
    }

    @Test(priority = 3)
    public void verifyLinkedInSocialLinkButton(){
        loginPage().typeUsername("standard_user");
        loginPage().typePassword("secret_sauce");
        loginPage().clickLoginButton();

        Assert.assertTrue(mainPage().isMainPagePresent());

        socialPage().clickLinkedInButton();
        Selenide.switchTo().window(3);

        Selenide.sleep(10000);

        Assert.assertTrue(socialPage().isLinkedInPagePresent());

        Selenide.sleep(1000);
    }
}
