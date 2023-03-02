package Practice;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

public class C02 extends TestBase {

    @Test
    public void test(){

        //1- https://www.amazon.com/ sayfasına gidin.
        driver.get("https://www.amazon.com/");

        //2- Arama kutusuna “city bike” yazip aratin
        WebElement aramaKutu = driver.findElement(By.id("twotabsearchtextbox"));
        aramaKutu.sendKeys("city bike"+ Keys.ENTER);

        //3- Görüntülenen sonuçların sayısını yazdırın
        System.out.println(driver.findElement(By.xpath("(//div[@class='sg-col-inner'])[1]")).getText());

        //4- Listeden ilk urunun resmine tıklayın.
        driver.findElement(By.xpath("(//span[@class='rush-component'])[3]")).click();


    }
}
