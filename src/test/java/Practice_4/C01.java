package Practice_4;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

import java.util.List;

public class C01 extends TestBase {


    @Test
    public void test(){

        //1. “https://demoqa.com/webtables” sayfasina gidin

        driver.get("https://demoqa.com/webtables");

        //2. Headers da bulunan basliklari yazdirin
        String headers = driver.findElement(By.xpath("//div[@class='rt-tr']")).getText();
        System.out.println(headers);

        //3. 3.sutunun basligini yazdirin
        System.out.println(driver.findElement(By.xpath("(//div[@class='rt-resizable-header-content'])[2]")).getText());

        //4. Tablodaki tum datalari yazdirin

        WebElement table = driver.findElement(By.className("rt-tbody"));
        System.out.println(table.getText());

        //5. Tabloda kac tane bos olmayan cell (data) oldugunu yazdirin

        // 6. Tablodaki satir sayisini yazdirin

        //7. Tablodaki sutun sayisini yazdirin
        //8. Tablodaki 3.kolonu yazdirin
        //9. Tabloda "First Name" i Kierra olan kisinin Salary'sini yazdirin
        //10. Page sayfasinda bir method olusturun, Test sayfasindan satir ve sutun sayisini girdigimde bana datayi yazdirsin




    }






}
