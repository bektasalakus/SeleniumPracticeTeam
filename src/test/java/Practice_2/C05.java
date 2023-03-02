package Practice_2;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

import java.util.List;

public class C05 extends TestBase {

    @Test
    public void test(){

        //1) http://demo.guru99.com/test/guru99home/ sitesine gidiniz
        driver.get("http://demo.guru99.com/test/guru99home/");
        sleep(3);
        // 2) sayfadaki iframe sayısını bulunuz.
        int size = driver.findElements (By.tagName ("iframe")).size();
        System.out.println(size);
        sleep(3);

        //3) ilk iframe'deki (Youtube) play butonuna tıklayınız.
        WebElement youtube = driver.findElement(By.xpath("//iframe[@wmode='transparent']"));
        driver.switchTo().frame(youtube);
        sleep(3);
        driver.findElement(By.xpath("//button[@aria-label='Oynat']")).click();
       //4) ilk iframe'den çıkıp ana sayfaya dönünüz
        driver.switchTo().defaultContent();
        sleep(3);
        //5) ikinci iframe'deki (Jmeter Made Easy) linke (https://www.guru99.com/live-selenium-project.html) tıklayınız
        driver.switchTo().frame(2);

        driver.get("https://www.guru99.com/live-selenium-project.html");
        sleep(3);


    }
}
