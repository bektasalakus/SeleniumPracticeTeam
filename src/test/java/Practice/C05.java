package Practice;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import utilities.TestBase;

public class C05 extends TestBase {
    @Test
    public void test(){


        //2- https://www.amazon.com/ adresine gidin
        driver.get("https://www.amazon.com/");

        //4- Sayfayi “refresh” yapin
        driver.navigate().refresh();

        //5- Sayfa basliginin “Spend less” ifadesi icerdigini test edin
        String expected ="Spend less";
        String actual = driver.getTitle();
        Assert.assertTrue(actual.contains(expected));

        //6- Gift Cards sekmesine basin
        driver.findElement(By.linkText("Gift Cards")).click();
        sleep(3);

        //7- Birthday butonuna basin
        driver.findElement(By.linkText("Birthday")).click();
        sleep(3);

        //8- Best Seller bolumunden ilk urunu tiklayin
        driver.findElement(By.xpath("(//img[@alt='Amazon.com eGift Card'])[1]")).click();
        sleep(2);

        //9- Gift card details’den 25 $’i secin
        driver.findElement(By.xpath("(//button[@id='gc-mini-picker-amount-1'])[1]")).click();
        sleep(2);

        //10-Urun ucretinin 25$ oldugunu test edin
        String expectedd ="$25.00";
        String actuall = driver.findElement(By.xpath("//span[@class='a-color-price a-text-bold']")).getText();
        Assert.assertEquals(expectedd,actuall);
        sleep(3);




    }
}
