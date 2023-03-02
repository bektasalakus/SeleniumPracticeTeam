package Practice;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

import java.util.List;

public class C08 extends TestBase {

    @Test
    public void test(){

        //2- https://www.google.com/ adresine gidin
        driver.get("https://www.google.com/");

        // 4- Sayfa basliginin “Google” ifadesi icerdigini test edin
        String expected ="Google";
        String actual = driver.getTitle();
        Assert.assertTrue(actual.contains(expected));

        // 5- Arama cubuguna “Nutella” yazip aratin
        WebElement aramaKutusu = driver.findElement(By.xpath("//input[@name='q']"));
        aramaKutusu.sendKeys("Nutella");
        aramaKutusu.submit();

        //6- Bulunan sonuc sayisini yazdirin
        String sonuc = driver.findElement(By.id("result-stats")).getText();
        System.out.println(sonuc);



        //7- sonuc sayisinin 10 milyon’dan fazla oldugunu test edin
        WebElement sonucElementi= driver.findElement(By.id("result-stats"));

        String sonucYazisi= sonucElementi.getText();



        String[] Arr = sonucYazisi.split(" ");

        String sonucArr= Arr[1];

        sonucArr = sonucArr.replaceAll("\\D","");


        int Expected =10000000;
        int Actual= Integer.parseInt(sonucArr);


        if (Actual>Expected){
              System.out.println("TEST : PASSED");
        }else System.out.println("TEST : FAİLED");





















    }



}
