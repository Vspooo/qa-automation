package hm3;
import com.codeborne.selenide.*;
import org.apache.commons.io.FileUtils;
import org.base.DefaultTest;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.File;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class DoubleClick extends DefaultTest {
    @Test
    public void FirstTest(){
        $(By.xpath("//p[text()= 'Click here to test your mouse clicks.']")).doubleClick();
    }
}
