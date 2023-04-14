package hm4;

import base.DefaultTest;
import org.testng.annotations.Test;

import static Pages.Pages.loginPage;
import static Pages.Pages.mainPage;

import static com.codeborne.selenide.Selenide.*;

public class VerifyValidOfFilterTest extends DefaultTest {
    @Test
    public void verifyFilters(){
        loginPage().typeUsername("standard_user");
        loginPage().typePassword("secret_sauce");
        loginPage().clickLoginButton();
        mainPage().clickItemFilterButton();
        for (int i = 0; i < mainPage().getItemFilterValues().size(); i++) {
            mainPage().getItemFilterValues().get(i).click();
            sleep(3000);
        }

        }
    }

