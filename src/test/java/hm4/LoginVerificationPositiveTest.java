package hm4;

import Pages.LoginPage;
import base.DefaultTest;
import com.codeborne.selenide.ElementsCollection;
import org.testng.annotations.Test;

import java.util.List;

import static Pages.Pages.loginPage;
import static Pages.Pages.mainPage;

public class LoginVerificationPositiveTest extends DefaultTest {
    @Test
    public void PositiveLoginTest(){
        System.out.println(loginPage().getUserNames());
        for (int i = 0; i < loginPage().getUserNames().size(); i++) {
            for (String userName : loginPage().getUserNames()) {
                loginPage().typeUsername(userName);
                loginPage().typePassword(loginPage().getUserPassword());
                loginPage().clickLoginButton();
                mainPage().clickOnBurgerMenu();
                mainPage().clickLogoutButton();
            }

        }

//        String password = loginPage().getUserPassword();

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