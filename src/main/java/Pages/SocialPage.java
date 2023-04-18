package Pages;

import base.CustomLogger.PageTools;
import org.openqa.selenium.By;

public class SocialPage extends PageTools {
    private final By twitterButton = By.xpath("//a[text()='Twitter']");
    private final By twitterHeader = By.xpath("//header[@role='banner']");

    private final By faceBookButton = By.xpath("//a[text()='Facebook']");
    private final By faceBookLogo = By.xpath("//div[@class='x6s0dn4 x78zum5 x1iyjqo2 x1n2onr6']");

    private final By linkedInButton = By.xpath("//a[text()='LinkedIn']");
    private final By linkedIdLogo = By.xpath("//div[@id='body-header']");


    public void clickTwitterButton () {
        click(twitterButton);
    }
    public void clickFaceBookButton() {
        click(faceBookButton);
    }
    public void clickLinkedInButton () {
        click(linkedInButton) ;
    }

    public boolean isTwitterPagePresent(){
       return isElementVisible(twitterHeader);
    }
    public boolean isFaceBookPagePresent(){
        return isElementVisible(faceBookLogo);
    }
    public boolean isLinkedInPagePresent(){
        return  isElementVisible(linkedIdLogo);
    }
}
