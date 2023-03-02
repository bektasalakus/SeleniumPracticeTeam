package Practice_2;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.TestBase;

public class C08 extends TestBase {

    @Test
    public void test(){

        //1- https://demoqa.com/droppable adresine gidelim
        driver.get("https://demoqa.com/droppable");

        //2- “Drag me” butonunu tutup “Drop here” kutusunun ustune birakalim
        WebElement dragMe = driver.findElement(By.id("draggable"));
        WebElement dropHere = driver.findElement(By.id("droppable"));
        sleep(2);
        Actions actions = new Actions(driver);
        actions.dragAndDrop(dragMe,dropHere).perform();
        sleep(2);
        // 3- “Drop here” yazisi yerine “Dropped!” oldugunu test edin
        String expected = "Dropped!";
        String actual = driver.findElement(By.xpath("//p[text()='Dropped!']")).getText();
        Assert.assertEquals(expected,actual);



    }
}
