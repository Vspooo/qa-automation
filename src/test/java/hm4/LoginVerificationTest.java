package hm4;

import base.DefaultTest;
import org.testng.Assert;
import org.testng.annotations.Test;

import static Pages.Pages.loginPage;
import static Pages.Pages.mainPage;

public class LoginVerificationTest extends DefaultTest {
    @Test
    public void PositiveLoginTest(){
        loginPage().typeUsername("standard_user");
        loginPage().typePassword("secret_sauce");
        loginPage().clickLoginButton();
        Assert.assertTrue(mainPage().isMainPagePresent());
    }


    @Test
    public void NegativeLoginTest(){
        loginPage().typeUsername("dfgdfg");
        loginPage().typePassword("dfdgdfg");
        loginPage().clickLoginButton();
        Assert.assertTrue(mainPage().isMainPagePresent());

    }
}

//
//  for (int i = 0; i < userNames.size(); i++) {
//        String name = String.valueOf(i);
//
//        loginPage().typeUsername(name);
//        loginPage().typePassword(password);
//        loginPage().clickLoginButton();
//        mainPage().clickOnBurgerMenu();
//        mainPage().clickLogoutButton();
//        }