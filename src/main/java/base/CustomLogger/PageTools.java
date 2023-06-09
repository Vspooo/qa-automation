package base.CustomLogger;

import com.codeborne.selenide.*;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import java.util.List;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class PageTools extends CustomLogger {
    private static String getPreviousMethodNameAsText(){
      String methodName =  Thread.currentThread().getStackTrace()[3].getMethodName();
     String replacedName = methodName.replaceAll(String.format("%s|%s|%s",
              "(?<=[A-Z])(?=[A-Z][a-z])",
              "(?<=[^A-Z])(?=[A-Z])",
              "(?<=[A-Za-z])(?=[^A-Za-z])")," ");
     return replacedName.substring(0,1).toUpperCase() + replacedName.substring(1).toLowerCase();
    }
    public By byLocator(By by, Object... args){
        return LocatorParser.parseLocator(by,args);
    }

    public SelenideElement shouldBe(Condition condition, By by,Object... args){
        return $(byLocator(by,args)).shouldBe(condition);
    }

    public ElementsCollection shouldBe(CollectionCondition condition, By by , Object... args){
        return $$(byLocator(by,args)).shouldBe(condition);
    }

    protected void  type(String text, By by, Object... args){
        logInfo(getPreviousMethodNameAsText()+ " ',element -> " + byLocator(by,args) );
        shouldBe(Condition.visible, by,args).append(text);
    }

    protected void click(By by,Object... args){
        logInfo(getPreviousMethodNameAsText()+ " ',element -> " + byLocator(by,args) );
        shouldBe(Condition.enabled,by,args).scrollTo().click();
    }


    protected void waitUntilElementVisibility(By by, Integer time,Object... args){
        logInfo(getPreviousMethodNameAsText() + " ', should be visible in -> " + time + " seconds " + byLocator(by,args));
        $(byLocator(by,args)).waitUntil(Condition.visible,time);
    }
    protected void waitUntilElementInvisibility(By by, Integer time,Object... args){
        logInfo(getPreviousMethodNameAsText() + " ', should be visible in -> " + time + " seconds " + byLocator(by,args));
        $(byLocator(by,args)).waitUntil(Condition.hidden,time);
    }

    public String getElementText(By by,Object... args){
        logInfo(getPreviousMethodNameAsText() + " ', element -> " + byLocator(by,args));
        return shouldBe(Condition.visible,by,args).text();
    }

    public List<String> getElementsText(By by, Object... args){
        logInfo(getPreviousMethodNameAsText() + " ', element -> " + byLocator(by,args));
        return shouldBe(CollectionCondition.sizeGreaterThan(-1),by,args).texts();
    }

    public SelenideElement getElement(By by,Object... args){
        logInfo(getPreviousMethodNameAsText() + " ', element -> " + byLocator(by,args));
        return shouldBe(Condition.visible,by,args);
    }

    public List<SelenideElement> getElements(By by,Object... args){
        logInfo(getPreviousMethodNameAsText() + " ', element -> " + byLocator(by,args));
        return shouldBe(CollectionCondition.sizeGreaterThan(-1),by,args);
    }

    protected void shouldHaveAttribute(By by, String nameOfAttribute,String valueOfAttribute,Object... args){
        logInfo(getPreviousMethodNameAsText() + " ', element -> " + byLocator(by,args));
        $(byLocator(by,args)).shouldHave(Condition.attribute(nameOfAttribute,valueOfAttribute));
    }
    protected  void pressEnterButton(){
        Selenide.actions().sendKeys(Keys.ENTER).perform();
    }

    protected boolean isCondition(By by, Condition condition, Object... args){
        logInfo(getPreviousMethodNameAsText() + " ', element -> " + byLocator(by,args));
        return getElement(by,args).is(condition);
    }

    public boolean isElementVisible(By by,Object... args){
        logInfo(getPreviousMethodNameAsText() + " ', element -> " + byLocator(by,args));
        return isCondition(by,Condition.visible,args);
    }

    public boolean isElementNotEmpty(By by,Object... args){
        logInfo(getPreviousMethodNameAsText() + " ', element -> " + byLocator(by,args));
        return isCondition(by,Condition.not(Condition.empty),args);
    }
}



