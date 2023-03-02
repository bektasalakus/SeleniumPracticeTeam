package Practice_3;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.TestBase;

public class C02 extends TestBase {

    @Test
    public void test(){

        //2- https://www.amazon.com sayfasina gidelim
        driver.get("https://www.amazon.com");
        WebElement aramaKutu = driver.findElement(By.id("twotabsearchtextbox"));
        aramaKutu.click();
        sleep(3);
        //3- Arama kutusuna actions method’larine kullanarak Samsung A71 yazdirin ve Enter’a basarak arama yaptirin
        Actions actions = new Actions(driver);

        actions.keyDown(Keys.SHIFT)
                .sendKeys("s")
                .keyUp(Keys.SHIFT)
                .sendKeys("amsung ")
                .keyDown(Keys.SHIFT)
                .sendKeys("a")
                .keyUp(Keys.SHIFT)
                .sendKeys("71"+Keys.ENTER).perform();

        sleep(3);


        //4- aramanin gerceklestigini test edin
       String expected = "Samsung A71";
       String actual = driver.findElement(By.xpath("//span[@class='a-color-state a-text-bold']")).getText();
        Assert.assertTrue(actual.contains(expected));


    }
}
