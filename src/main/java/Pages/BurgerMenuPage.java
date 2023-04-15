package Pages;

import base.CustomLogger.PageTools;
import org.openqa.selenium.By;

public class BurgerMenuPage extends PageTools {

    private final By burgerMenu = (By.xpath("//button[text()='Open Menu']"));
    private final By allItemsButton = By.xpath("//a[@id='inventory_sidebar_link']");
    private final By aboutButton = By.xpath("//a[@id='about_sidebar_link']");
    private final By logoutButton = (By.xpath("//a[text()='Logout']"));

    private final By resetAppStateButton = By.xpath("//a[@id='reset_sidebar_link']");

    private final By buttonById = By.xpath("//a[%d]");




    public void clickOnBurgerMenu(){
        shouldHaveAttribute(burgerMenu,"id","react-burger-menu-btn");
        click(burgerMenu);
    }

    public void clickAllItemsButton() {
        shouldHaveAttribute(aboutButton,"id","inventory_sidebar_link");
        click(allItemsButton);
    }
    public void clickAboutButton() {
        shouldHaveAttribute(aboutButton,"id","about_sidebar_link");
        click(aboutButton);
    }

    public void clickLogoutButton(){
        shouldHaveAttribute(logoutButton,"id","logout_sidebar_link");
        click(logoutButton);
    }

    public void clickResetAppStateButton() {
        shouldHaveAttribute(resetAppStateButton,"id","reset_sidebar_link");
        click(resetAppStateButton);
    }

    public void clickButtonById(int id){
        click(buttonById,id);
    }


}
