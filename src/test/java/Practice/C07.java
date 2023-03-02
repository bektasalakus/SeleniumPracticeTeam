package Practice;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import utilities.TestBase;

public class C07 extends TestBase {

    @Test
    public void test(){

        //1. http://zero.webappsecurity.com sayfasina gidin
        driver.get("http://zero.webappsecurity.com");

        //2. Signin buttonuna tiklayin
        driver.findElement(By.id("signin_button")).click();
        sleep(3);

        //3. Login alanine “username” yazdirin
        driver.findElement(By.id("user_login")).sendKeys("username");

        //4. Password alanine “password” yazdirin
        driver.findElement(By.id("user_password")).sendKeys("password");
        sleep(3);
        //5. Sign in buttonuna tiklayin
        driver.findElement(By.xpath("//input[@type='submit']")).click();
        sleep(2);
        driver.navigate().back();
        sleep(2);

        //6. Pay Bills sayfasina gidin
        driver.findElement(By.id("online-banking")).click();
        sleep(2);
        driver.findElement(By.id("pay_bills_link")).click();
        sleep(2);

        //7. amount kismina yatirmak istediginiz herhangi bir miktari yazin
        driver.findElement(By.id("sp_amount")).sendKeys("500");

        //8. tarih kismina “2020-09-10” yazdirin
        driver.findElement(By.id("sp_date")).sendKeys("2020-09-10");
        sleep(3);

        //9. Pay buttonuna tiklayin
        driver.findElement(By.id("pay_saved_payees")).click();

        //10. “The payment was successfully submitted.” mesajinin ciktigini test edin
        String expected="The payment was successfully submitted.";
        String actual = driver.findElement(By.xpath("//span[text()='The payment was successfully submitted.']"))
                .getText();
        Assert.assertTrue(actual.contains(expected));
        sleep(2);
    }
}
