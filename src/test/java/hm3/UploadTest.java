//package hm3;
//import base.DefaultTest;
//import org.openqa.selenium.By;
//import org.testng.annotations.Test;
//
//import java.io.File;
//
//import static com.codeborne.selenide.Selenide.$;
//import static com.codeborne.selenide.Selenide.$$;
//public class UploadTest extends DefaultTest
//{
//
//    public static String getFileByPathName(String fileName){
//    return new File("build/resourses/"+ fileName).getAbsolutePath();
//    }
//
//    @Test
//    public void OneTest() {
//    $(By.xpath("//input[@name ='userfile']")).uploadFile(new File(getFileByPathName("annual-enterprise-survey-2021-financial-year-provisional-csv.csv")));
//
//
//    }
//
//
//}
