package hm4;

import base.DefaultTest;
import com.codeborne.selenide.Selenide;
import org.testng.Assert;
import org.testng.annotations.Test;

import static Pages.Pages.*;

public class VerifyAccuracyOfFilter extends DefaultTest {
   @Test
    public void verifyAccuracyOfFilter(){
       loginPage().typeUsername("standard_user");
       loginPage().typePassword("secret_sauce");
       loginPage().clickLoginButton();
       Assert.assertTrue(mainPage().isMainPagePresent());

       mainPage().clickItemFilterButton();
       mainPage().clickOptionById(2);
      Selenide.sleep(1000);
       Assert.assertEquals(mainPage().getElementsNameText().get(0),"Test.allTheThings() T-Shirt (Red)");
   }
}
