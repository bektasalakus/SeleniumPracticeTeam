package Practice_3;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v85.layertree.model.LayerId;
import org.openqa.selenium.interactions.Actions;
import utilities.TestBase;

import java.util.List;

public class C06 extends TestBase {

    @Test
    public void test(){

        //1."https://www.amazon.com" adresine gidin
        driver.get("https://www.amazon.com");

        //2.Sayfanin en altina inin
        Actions actions = new Actions(driver);
        actions.sendKeys(Keys.END).perform();

        sleep(2);

        //3.Web table tum body’sini yazdirin
        WebElement tableElementi = driver.findElement(By.tagName("tbody"));

        System.out.println(tableElementi.getText());

        //4.Web table’daki satir sayisinin 9 oldugunu test edin

        List<WebElement> tables = driver.findElements(By.xpath("//tbody/tr"));
        Assert.assertEquals(tables.size(),9);


        int sayi =1;
        //5.Tum satirlari yazdirin
        for (WebElement each:tables
             ) {
            System.out.println(sayi+"- "+each.getText());
            sayi++;
        }

        //6. Web table’daki sutun sayisinin 13 olduğunu test edin
        List<WebElement> sutun = driver.findElements(By.xpath("//tbody/tr[1]/td"));
        Assert.assertEquals(sutun.size(),13);

        //7. 5.sutunu yazdirin
        List<WebElement> sutun2 = driver.findElements(By.xpath("//tbody/tr/td[5]"));
        System.out.println("_______________________________________");
        for (WebElement sutuneach:sutun2
             ) {
            System.out.println(sutuneach.getText());
        }


        //8.  Satir ve sutun sayisini parametre olarak alip, hucredeki bilgiyi döndüren bir method olusturun

        System.out.println("Method");

        System.out.println(test(3,5));

    }

    public String test (int satirNo, int sutunNo) {

        String locate = "//tbody/tr[" + satirNo + "]/td[" + sutunNo + "]";

        String data = driver.findElement(By.xpath(locate)).getText();

        return data;
    }
}
