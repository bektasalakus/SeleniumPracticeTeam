package Practice_3;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.TestBase;

public class C04 extends TestBase {

    @Test
    public void test(){

        //2- https://html.com/tags/iframe/ sayfasina gidelim
        driver.get("https://html.com/tags/iframe/");

        // 3- video’yu gorecek kadar asagi inin
        Actions actions = new Actions(driver);
        WebElement text = driver.findElement(By.id("Powerful_but_easy_to_misuse"));
        actions.scrollToElement(text).perform();
        sleep(3);
        WebElement iFrame = driver.findElement(By.xpath("//iframe[@src='https://www.youtube.com/embed/owsfdh4gxyc']"));
        driver.switchTo().frame(iFrame);

        //4- videoyu izlemek icin Play tusuna basin
        driver.findElement(By.xpath("//button[@aria-label='Oynat']")).click();
        sleep(1);


        //5- videoyu calistirdiginizi test edin

        WebElement test = driver.findElement(By.xpath("//button[@class='ytp-play-button ytp-button']"));
        Assert.assertTrue(test.isDisplayed());
        sleep(3);



    }
}
