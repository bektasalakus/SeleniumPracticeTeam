package Practice_3;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.TestBase;

public class C01 extends TestBase {

    @Test
    public void test(){

        //1- https://www.amazon.com/ adresine gidin
        driver.get("https://www.amazon.com/");
        WebElement lists = driver.findElement(By.id("nav-link-accountList-nav-line-1"));
     sleep(2);
        //2- Sag ust bolumde bulunan “Account & Lists” menusunun acilmasi icin mouse’u bu menunun ustune getirin
        Actions actions = new Actions(driver);
        actions.moveToElement(lists).perform();
        sleep(2);
        //3- “Create a list” butonuna basin
        driver.findElement(By.xpath("//span[text()='Create a List']")).click();
        sleep(2);
        //4- Acilan sayfada “Your Lists” yazisi oldugunu test edin
        String expected = "Your Lists";
        String actual = driver.findElement(By.xpath("//div[@role='heading']")).getText();
        Assert.assertEquals(expected,actual);




    }
}
