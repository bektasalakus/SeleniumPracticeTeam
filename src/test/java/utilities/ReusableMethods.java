package utilities;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ReusableMethods {

    public static void tumSayfaScreen(WebDriver driver){

        TakesScreenshot ts = (TakesScreenshot) driver;

        LocalDateTime ldt = LocalDateTime.now();
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyyMMddhhmmss");
        String dinamikDosyaYol = "target/ScreenShot"+ldt.format(dtf)+".png";

        File tumsayfascreen = new File(dinamikDosyaYol);

        File gecici = ts.getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(gecici,tumsayfascreen);
        } catch (IOException e) {
        }

    }

    public static void webelementScreen(WebElement istenenElement){

        LocalDateTime ldt = LocalDateTime.now();
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy,MM,dd,hh,mm,ss");
        String dinamikDosyaYol = "target/WebElementScreenShot"+ldt.format(dtf)+".png";

        File elementScreen = new File(dinamikDosyaYol);

        File gecici = istenenElement.getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(gecici,elementScreen);
        } catch (IOException e) {
        }


    }
}
