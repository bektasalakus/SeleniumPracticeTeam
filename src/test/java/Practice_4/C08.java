package Practice_4;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

public class C08 extends TestBase {


    @Test
    public void test(){


        // wisequarter anasayfaya gidelim
        driver.get("https://www.wisequarter.com");
        //refresh diyerek reklami gecin
        driver.navigate().refresh();

        // Java Test otomation tanitimina kadar asagi inin
        WebElement otomasyonElementi= driver.findElement(By.xpath("(//img[@alt='Automation Engineer'])[1]"));

        sleep(2);
        JavascriptExecutor jse = (JavascriptExecutor) driver;

        jse.executeScript("arguments[0].scrollIntoView();",otomasyonElementi);

        // ve resmi click yapin ?
        sleep(2);

        jse.executeScript("arguments[0].click();",otomasyonElementi);

        // ekrana "JUnit bitti"

        jse.executeScript("alert('JUnit Bitti :)');");
        sleep(2);
    }
}
