package hm4;

import Pages.Pages;
import base.DefaultTest;
import com.codeborne.selenide.Selenide;
import org.testng.Assert;
import org.testng.annotations.Test;

import static Pages.Pages.*;

public class VerifySocialLinksButtonsTest extends DefaultTest {
    @Test
    public void verifyTwitterSocialLinkButton(){
        loginPage().typeUsername("standard_user");
        loginPage().typePassword("secret_sauce");
        loginPage().clickLoginButton();

        Assert.assertTrue(mainPage().isMainPagePresent());

        socialPage().clickTwitterButton();

        Selenide.sleep(3000);

        Assert.assertTrue(socialPage().isTwitterPagePresent());

    }

    @Test
    public void verifyFacebookSocialLinkButton(){
        loginPage().typeUsername("standard_user");
        loginPage().typePassword("secret_sauce");
        loginPage().clickLoginButton();

        Assert.assertTrue(mainPage().isMainPagePresent());

        socialPage().clickFaceBookButton();

        Selenide.sleep(3000);

        Assert.assertTrue(socialPage().isFaceBookPagePresent());
    }

    @Test
    public void verifyLinkedInSocialLinkButton(){
        loginPage().typeUsername("standard_user");
        loginPage().typePassword("secret_sauce");
        loginPage().clickLoginButton();

        Assert.assertTrue(mainPage().isMainPagePresent());

        socialPage().clickLinkedInButton();

        Selenide.sleep(3000);

        Assert.assertTrue(socialPage().isLinkedInPagePresent());
    }
}
