package Practice;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.locators.RelativeLocator;
import utilities.TestBase;

import java.util.List;

public class C06 extends TestBase {

    @Test
    public void test(){


        //1- https://www.amazon.com/ sayfasina gidelim
        driver.get("https://www.amazon.com/");
        sleep(2);
        // 2- arama kutusunu locate edelim
        WebElement aramaKutusu = driver.findElement(By.id("twotabsearchtextbox"));

        //3- “Samsung headphones” ile arama yapalim
        aramaKutusu.sendKeys("Samsung headphones"+ Keys.ENTER);

        // 4- Bulunan sonuc sayisini yazdiralim
        System.out.println(driver.findElement(By.xpath("(//div[@class='sg-col-inner'])[1]")));

        //5- Ilk urunu tiklayalim
        driver.findElement(By.xpath("(//img[@class='s-image'])[1]")).click();
         driver.navigate().back();
        //6- Sayfadaki tum basliklari yazdiralim

        List<WebElement> kulaklık = driver.findElements(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']"));

        int sayac = 1;

        for (WebElement each:kulaklık
             ) {
            System.out.println(sayac+"- "+each.getText());

            sayac++;

        }





 }

}
