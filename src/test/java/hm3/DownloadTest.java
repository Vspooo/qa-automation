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



public class DownloadTest extends DefaultTest {

    @BeforeTest
    public  void  download(){
        Configuration.reportsFolder = "downloads";
        Configuration.fileDownload = FileDownloadMode.FOLDER;
    }

    @Test
    public void FirstTest(){
        $(By.xpath("//h3[@class = 'block-document__title']//a[1]")).scrollTo();
       try {
           $(By.xpath("//h3[@class = 'block-document__title']//a[text() = 'International trade: December 2022 quarter – CSV']")).download();
       } catch (Exception e) {
           throw new RuntimeException(e);
       }
    }
}


//    $(By.xpath("//h3[@class = 'block-document__title']//a[1]")).click();
//        $(By.xpath("//h3[@class = 'block-document__title']//a[text() = 'International trade: December 2022 quarter – CSV']")).scrollTo();
//        $(By.xpath("//h3[@class = 'block-document__title']//a[text() = 'International trade: December 2022 quarter – CSV']")).click();