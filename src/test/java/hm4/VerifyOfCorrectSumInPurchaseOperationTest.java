package hm4;

import base.DefaultTest;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

import static Pages.Pages.*;

public class VerifyOfCorrectSumInPurchaseOperationTest extends DefaultTest {
    @Test
    public void verifyOfCorrectSumInPurchaseOperation(){
        Assert.assertTrue(loginPage().isLoginPagePresent());
        loginPage().typeUsername("standard_user");
        loginPage().typePassword("secret_sauce");
        loginPage().clickLoginButton();

        Assert.assertTrue(mainPage().isMainPagePresent());
        while (mainPage().getAddButtons().size()>0){
            mainPage().clickAddToCartButton();
        }
        Assert.assertTrue(mainPage().isCartNotEmpty());

        mainPage().clickShoppingCartButton();

        Assert.assertTrue(cartPage().isCartPagePresent());
        cartPage().clickCheckOutButton();

        Assert.assertTrue(checkOutOverview().isCheckOutOverviewPagePresent());
        checkOutInformation().typeFistNameInput("vova");
        checkOutInformation().typeLastNameInput("voloshyn");
        checkOutInformation().typePostalCode("30-100");
        checkOutInformation().clickContinueButton();

        Assert.assertTrue(checkOutOverview().isCheckOutOverviewPagePresent());

        List<String> listPrices = checkOutOverview().getItemPriceList();
        String expectedPrice = checkOutOverview().getExpectedPrice();

        List<Double> parsedPrice = new ArrayList<>();
        for (int i = 0; i < listPrices.size(); i++) {
             String s = listPrices.get(i).replaceAll("\\$","");
             parsedPrice.add(Double.parseDouble(s));
        }

        Object[] objects = parsedPrice.toArray();
        double result = 0;
        for (Object value : objects) {
            result += (double) value;
        }

        String replacedPrice = expectedPrice.replaceAll("Item total: \\$","");
        System.out.println(replacedPrice);
        double price = Double.parseDouble(replacedPrice);

        Assert.assertEquals(result,price);

    }
}
