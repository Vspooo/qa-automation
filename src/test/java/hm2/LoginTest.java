package hm2;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.base.DefaultTest;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import java.security.Key;
import java.util.List;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;


public class LoginTest extends DefaultTest {
 @Test
    public void TestOne(){
     $(By.xpath("//input[@name = 'user-name']")).append("standard_user");
     $(By.xpath("//input[@name = 'password']")).append("secret_sauce");
//     $(By.xpath("//input[@placeholder = 'Username']")).clear();
     $(By.xpath("//input[@name = 'login-button']")).click();
//     $(By.xpath("//input[@id = 'login-button']")).submit();
//  System.out.println($(By.xpath("//h3[@data-test = 'error']")).text());
//  List<String> names = $$(By.xpath("//div[@class = 'inventory_item_name']")).texts();
   ElementsCollection  elements = $$(By.xpath("//div[@id = 'inventory_container']"));
  for (SelenideElement element : elements) {
   $$(By.xpath("//button[@class = 'btn btn_primary btn_small btn_inventory']"));
   $(By.xpath("//a[@class = 'shopping_cart_link']")).click();
//   $(By.xpath("//button[@data-test = 'checkout']")).click();
//   $(By.xpath("//input[@placeholder = 'First Name']")).append("Volodymyr");
//   $(By.xpath("//input[@placeholder = 'Last Name']")).append("Voloshyn");
//   $(By.xpath("//input[@placeholder = 'Zip/Postal Code']")).append("30-810");
//   $(By.xpath("//input[@data-test = 'continue']")).click();
//   $(By.xpath("//button[@data-test = 'finish']")).click();
  }


 }
 @Test
   public void TestTwo(){
  $(By.xpath("//input[@placeholder = 'Username']")).append("problem_user");
  $(By.xpath("//input[@placeholder = 'Password']")).append("secret_sauce");
  $(By.xpath("//input[@id = 'login-button']")).click();
  $(By.xpath("//select[@class = 'product_sort_container']")).click();
  Selenide.actions().sendKeys(Keys.ESCAPE).perform();
 }

 @Test
 public void TestThree(){
  $(By.xpath("//input[@data-test = 'username']")).append("performance_glitch_user");
  $(By.xpath("//input[@id = 'password']")).append("secret_sauce");
  $(By.xpath("//input[@class  ='submit-button btn_action']")).click();
 }

}
