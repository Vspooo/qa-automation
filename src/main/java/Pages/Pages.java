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


}
