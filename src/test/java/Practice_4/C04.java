package Practice_4;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.formula.functions.WeekNum;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.*;
import utilities.TestBase;

import java.io.File;
import java.io.IOException;

public class C04 extends TestBase {


    @Test
    public void test() throws IOException {
        //1- amazon anasayfaya gidin
        driver.get("https://www.amazon.com");

        //2- amazon anasayfaya gittiginizi test edin ve tum sayfanin goruntusunu kaydedin
        String expected = "amazon";
        String actual = driver.getCurrentUrl();
        Assert.assertTrue(actual.contains(expected));

        TakesScreenshot screenshot = (TakesScreenshot) driver;

        File file = new File("target/screenShot.png");

        File gecici = screenshot.getScreenshotAs(OutputType.FILE);

        FileUtils.copyFile(gecici,file);

        // 3- Nutella icin arama yapin
        WebElement aramakutusu = driver.findElement(By.id("twotabsearchtextbox"));
        aramakutusu.sendKeys("nutella"+ Keys.ENTER);

        //4- sonucun Nutella icerdigini test edin ve ilk urunun goruntusunu alin
        String expected2 = "nutella";
        String actual2 = driver.findElement(By.xpath("(//div[@class='sg-col-inner'])[1]")).getText();
        Assert.assertTrue(actual2.contains(expected2));
        driver.findElement(By.xpath("(//span[@class='a-size-base-plus a-color-base a-text-normal'])[1]")).click();

          screenshot = (TakesScreenshot) driver;
          file = new File("target/screenShot3.png");

         gecici = screenshot.getScreenshotAs(OutputType.FILE);

        FileUtils.copyFile(gecici,file);

    }






}
