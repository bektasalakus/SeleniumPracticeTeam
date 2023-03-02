package Practice;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

import java.util.List;

public class C01 extends TestBase {

    @Test
    public void test(){


        // 2- https://www.automationexercise.com/ adresine gidin
        driver.get("https://www.automationexercise.com/");

        // 3- Sayfada 147 adet link bulundugunu test edin.

        List<WebElement> link = driver.findElements(By.tagName("a"));

        int expected= 147;
        int actual = link.size();
        Assert.assertTrue(expected==actual);


        // 4- Products linkine tiklayin
        driver.findElement(By.xpath("//*[text()=' Products']")).click();
        sleep(3);

        // 5- special offer yazisinin gorundugunu test edin
        WebElement resim = driver.findElement(By.id("sale_image"));
        Assert.assertTrue(resim.isDisplayed());
        sleep(2);
        // 6- Sayfayi kapatin
    }


}
