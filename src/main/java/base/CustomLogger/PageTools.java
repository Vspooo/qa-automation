package base.CustomLogger;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

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

    protected SelenideElement shouldBe(Condition condition, By by,Object... args){
        return $(byLocator(by,args)).shouldBe(condition);
    }

    protected void  type(String text, By by, Object... args){
        logInfo(getPreviousMethodNameAsText()+ " ',element -> " + byLocator(by,args) );
        shouldBe(Condition.visible, by,args).append(text);
    }

    protected void click(By by,Object... args){
        logInfo(getPreviousMethodNameAsText()+ " ',element -> " + byLocator(by,args) );
        shouldBe(Condition.enabled,by,args).click();
    }

}



