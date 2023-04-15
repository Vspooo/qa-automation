package Pages;

public class Pages {
    private static LoginPage loginPage;
    public static LoginPage loginPage(){
    if (loginPage == null){
        loginPage = new LoginPage();
       }
    return loginPage;

    }

  private static MainPage mainPage;
    public static MainPage mainPage(){
        if (mainPage == null){
            mainPage = new MainPage();
        }
        return mainPage;
    }

   private static CartPage cartPage;
    public static CartPage cartPage(){
        if (cartPage == null){
            cartPage = new CartPage();
        }
        return cartPage;
    }

    private static CheckOutInformationPage checkOutInformation;
    public static CheckOutInformationPage checkOutInformation(){
        if (checkOutInformation == null){
            checkOutInformation = new CheckOutInformationPage();
        }
        return checkOutInformation;
    }

    private static CheckOutOverviewPage checkOutOverview;
    public static CheckOutOverviewPage checkOutOverview(){
        if (checkOutOverview == null){
            checkOutOverview = new CheckOutOverviewPage();
        }
        return checkOutOverview;
    }

    private static CheckOutCompletePage checkOutCompletePage;
    public  static CheckOutCompletePage checkOutCompletePage(){
        if (checkOutCompletePage == null){
            checkOutCompletePage = new CheckOutCompletePage();
        }
        return checkOutCompletePage;
    }

   private static ItemPage itemPage;
    public static ItemPage itemPage(){
        if (itemPage == null){
            itemPage = new ItemPage();
        }
        return itemPage;
    }

    private static BurgerMenuPage burgerMenuPage;
    public static BurgerMenuPage burgerMenuPage(){
        if (burgerMenuPage == null){
            burgerMenuPage = new BurgerMenuPage();
        }
        return burgerMenuPage;
    }

    private static SocialPage socialPage;
    public static SocialPage socialPage(){
        if (socialPage == null){
            socialPage = new SocialPage();
        }
        return socialPage;
    }


}
