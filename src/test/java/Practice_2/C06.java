package Practice_2;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WindowType;
import utilities.TestBase;

public class C06 extends TestBase {

    @Test
    public void test(){


        //● Amazon anasayfa adresine gidin.
        driver.get("https://www.amazon.com");
        sleep(2);
        //● Sayfa’nin window handle degerini String bir degiskene atayin
        String ilkSayfa = driver.getWindowHandle();
        sleep(2);

        //● Sayfa title’nin “Amazon” icerdigini test edin
        String expeced = "Amazon";
        String actual = driver.getTitle();
        Assert.assertTrue(actual.contains(expeced));
        sleep(2);
        //● Yeni bir tab olusturup, acilan tab’da wisequarter.com adresine gidin
        driver.switchTo().newWindow(WindowType.TAB);
        driver.get("https://www.wisequarter.com");
        sleep(2);
        //● Sayfa title’nin “wisequarter” icerdigini test edin
        String expected = "Wise Quarter";
        String actualTitle = driver.getTitle();
        Assert.assertTrue(actualTitle.contains(expected));
        sleep(2);
        //● Yeni bir window olusturup, acilan sayfada walmart.com adresine gidin
        driver.switchTo().newWindow(WindowType.WINDOW);
        driver.get("https://www.walmart.com");
        sleep(2);
        //● Sayfa title’nin “Walmart” icerdigini test edin
        String expectedTile = "Walmart";
        String actualTitle2 = driver.getTitle();
        Assert.assertTrue(actualTitle2.contains(expectedTile));
        sleep(2);
        //● Ilk acilan sayfaya donun ve amazon sayfasina dondugunuzu test edin
        driver.switchTo().window(ilkSayfa);
        String expedtedURL = "https://www.amazon.com/";
        String actualURL = driver.getCurrentUrl();
        Assert.assertEquals(expedtedURL,actualURL);


        sleep(2);




    }
}
