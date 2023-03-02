package Practice_3;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.support.ui.Select;
import utilities.TestBaseClass;

import java.util.List;

public class C05 extends TestBaseClass {
    public static WebElement dropDown;
    public static Select select;
    @Test
    public void test1(){

        // 1- amazon gidin
          driver.get("https://www.amazon.com");

        //2- Arama kutusunun solundaki dropdown menuyu handle edip listesini ekrana yazdırın
        dropDown=driver.findElement(By.id("searchDropdownBox"));
        select = new Select(dropDown);
        List<WebElement> menu = select.getOptions();
        int sayi =1;
        for (WebElement each:menu
             ) {
            System.out.println(sayi+"- "+each.getText());
            sayi++;
        }

        // 3- dropdown menude 29 eleman olduğunu doğrulayın
        Assert.assertEquals(29,sayi);


    }

    @Test
    public void test2(){

        //1- dropdown menuden elektronik bölümü seçin
        select.selectByIndex(10);
        sleep(2);

        //2- arama kutusuna iphone yazip aratin ve bulunan sonuç sayısını yazdırın
        WebElement aramaKutusu = driver.findElement(By.id("twotabsearchtextbox"));
        aramaKutusu.sendKeys("iphone"+ Keys.ENTER);
        WebElement sonuc =driver.findElement(By.xpath("//div[@class='sg-col-inner']"));
        System.out.println(sonuc.getText());

        //3- sonuc sayisi bildiren yazinin iphone icerdigini test edin
        String expected ="iphone";
        String actual = sonuc.getText();
        Assert.assertTrue(actual.contains(expected));


        //4- ikinci ürüne relative locater kullanarak tıklayin
        driver.findElement(By.xpath("(//span[@class='a-size-base-plus a-color-base a-text-normal'])[2]")).click();

        //5- ürünün title'ni ve fiyatını variable’a assign edip ürünü sepete ekleyelim
        String isim =driver.findElement(By.xpath("//span[@id='productTitle']")).getText();
        String fiyat = driver.findElement(By.xpath("//span[@class='a-size-base a-color-price']")).getText();

        driver.findElement(By.id("abb_accessory_add_button_B08DXMGBQV")).click();
        sleep(2);
    }
    @Test
    public void test3(){


        //1- yeni bir sekme açarak amazon anasayfaya gidin
        driver.switchTo().newWindow(WindowType.TAB);
        driver.get("https://www.amazon.com");


        // 2-dropdown’dan bebek bölümüne secin
        dropDown=driver.findElement(By.id("searchDropdownBox"));
        select = new Select(dropDown);
        select.selectByIndex(3);
        sleep(2);

        //3-bebek puset aratıp bulundan sonuç sayısını yazdırın
        WebElement aramaKutusu = driver.findElement(By.id("twotabsearchtextbox"));
                aramaKutusu.sendKeys("bebek puset"+Keys.ENTER);
        sleep(2);
                String sonuc = driver.findElement(By.xpath("(//div[@class='sg-col-inner'])[1]")).getText();
        System.out.println(sonuc);

        //4-sonuç yazsının puset içerdiğini test edin
        String expected ="puset";
        Assert.assertTrue(sonuc.contains(expected));

        //5-üçüncü ürüne relative locater kullanarak tıklayin
        driver.findElement(By.xpath("(//span[@class='a-size-medium a-color-base a-text-normal'])[3]")).click();

        //6-title ve fiyat bilgilerini assign edelim ve ürünü sepete ekleyin
        String title = driver.findElement(By.xpath("//span[@id='productTitle']")).getText();
        String fiyat =driver.findElement(By.xpath("(//span[@class='a-price-whole'])[1]")).getText();
        driver.findElement(By.xpath("//input[@id='add-to-cart-button']")).click();

    }
    @Test
    public void test4(){

        //1-sepetteki ürünlerle eklediğimiz ürünlerin aynı olduğunu isim ve fiyat olarak doğrulayın
        driver.findElement(By.id("nav-cart-count-container")).click();
        sleep(2);

        // İLK ÜRÜN KARŞILAŞTIRMASI
        String Expectedİsim ="ALPHA GLASS";
        String Actualİsim = driver.findElement(By.xpath("(//span[@class='a-truncate-cut'])[6]")).getText();
        Assert.assertTrue(Actualİsim.contains(Expectedİsim));

        String ExpectedFiyat ="$19.88";
        String ActualFiyat = driver.findElement(By.xpath("(//p[@class='a-spacing-mini'])[2]")).getText();
        Assert.assertEquals(ExpectedFiyat,ActualFiyat);




        // İKİNCİ ÜRÜN KARŞILAŞTIRMASI
        String expectedİsim ="Bassinet Mattress";
        String actualİsim = driver.findElement(By.xpath("(//span[@class='a-truncate-cut'])[5]")).getText();
        Assert.assertTrue(actualİsim.contains(expectedİsim));

        String expectedFiyat ="$19.99";
        String actualFiyat = driver.findElement(By.xpath("(//p[@class='a-spacing-mini'])[1]")).getText();
        Assert.assertEquals(expectedFiyat,actualFiyat);

    }



}
