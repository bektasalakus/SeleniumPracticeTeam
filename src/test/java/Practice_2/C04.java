package Practice_2;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

public class C04 extends TestBase {

    @Test
    public void test(){

        //1 ) https://the-internet.herokuapp.com/iframe adresine gidin.
        driver.get("https://the-internet.herokuapp.com/iframe");
        //- “An IFrame containing....” textinin erisilebilir oldugunu test edin ve konsolda yazdirin.
        WebElement ıFrame = driver.findElement(By.id("mce_0_ifr"));
        driver.switchTo().frame(ıFrame);
        WebElement text = driver.findElement(By.tagName("p"));
        Assert.assertTrue(text.isEnabled());
        System.out.println(text.getText());

        //- Text Box’a “Merhaba Dunya!” yazin.
        text.sendKeys("Merhaba Dunya!");
        sleep(2);
        //- TextBox’in altinda bulunan “Elemental Selenium” linkini textinin gorunur oldugunu dogrulayin ve konsolda yazdirin.
        driver.switchTo().defaultContent();
        WebElement elemental= driver.findElement(By.xpath("//a[text()='Elemental Selenium']"));
        Assert.assertTrue(elemental.isDisplayed());

        sleep(3);





    }
}
