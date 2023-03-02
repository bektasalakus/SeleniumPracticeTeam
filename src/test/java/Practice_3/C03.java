package Practice_3;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.TestBase;

public class C03 extends TestBase {



    @Test
    public void test(){


        //1- "http://webdriveruniversity.com/Actions" sayfasina gidin
        driver.get("http://webdriveruniversity.com/Actions");

        // 2- Hover over Me First" kutusunun ustune gelin
        WebElement hoverOver = driver.findElement(By.xpath("(//button[@class='dropbtn'])[1]"));
        Actions actions = new Actions(driver);
        actions.moveToElement(hoverOver).perform();
        sleep(2);

        //3- Link 1" e tiklayin
        driver.findElement(By.linkText("Link 1")).click();

        //4- Popup mesajini yazdirin
        System.out.println(driver.switchTo().alert().getText());

        //5- Popup'i tamam diyerek kapatin
        driver.switchTo().alert().accept();

        //6- “Click and hold" kutusuna basili tutun
        WebElement kutu = driver.findElement(By.id("click-box"));
        actions.clickAndHold(kutu).perform();

        actions.release().perform();
        sleep(3);

        //7-“Click and hold" kutusunda cikan yaziyi yazdirin
        String yazi = kutu.getText();
        System.out.println(yazi);
        sleep(3);

        //8- “Double click me" butonunu cift tiklayin
        WebElement doubleClick = driver.findElement(By.tagName("h2"));
        actions.doubleClick(doubleClick).perform();
        sleep(3);


    }
}
