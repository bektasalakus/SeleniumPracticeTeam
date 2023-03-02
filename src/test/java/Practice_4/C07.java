package Practice_4;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import utilities.ReusableMethods;
import utilities.TestBase;

public class C07 extends TestBase {

@Test
        public void test() {
    // amazon anasayfaya gidin
    driver.get("https://www.amazon.com");

    // Nutella icin arama yapin
    WebElement aramaKutusu = driver.findElement(By.id("twotabsearchtextbox"));
    aramaKutusu.sendKeys("Nutella" + Keys.ENTER);

    // Sonuclarin Nutella icerdigini test edin

    WebElement sonucYaziElementi = driver.findElement(By.xpath("//h1[@class='a-size-base s-desktop-toolbar a-text-normal']"));
    String actualSonucYazisi = sonucYaziElementi.getText();

    String expectedIcerik = "Nutella";

    Assert.assertTrue(actualSonucYazisi.contains(expectedIcerik));

    // ve rapora eklenmek icin sonuc yazisi elementinin fotografini cekin

    ReusableMethods.webelementScreen(sonucYaziElementi);
}
}
