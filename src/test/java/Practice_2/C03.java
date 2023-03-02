package Practice_2;

import org.junit.Test;
import utilities.TestBase;

public class C03 extends TestBase {

    @Test
    public void test(){


        //2- https://the-internet.herokuapp.com/basic_auth sayfasina gidin
        driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
        sleep(3);
        //3- asagidaki yontem ve test datalarini kullanarak authentication’i yapin
        //Html komutu : https://username:password@URL Username : admin

        //password : admin


    }
}
