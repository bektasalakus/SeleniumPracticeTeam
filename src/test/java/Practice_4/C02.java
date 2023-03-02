package Practice_4;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.junit.Assert;
import org.junit.Test;
import utilities.TestBase;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class C02{



    @Test
    public void test() throws IOException {


    String dosya = "src/test/java/Practice_3/ulkeler.xlsx";
    FileInputStream fis = new FileInputStream(dosya);
    Workbook workbook = WorkbookFactory.create(fis);


    //- 1.satirdaki 2.hucreye gidelim ve yazdiralim
        System.out.println(workbook.getSheet("Sayfa1").getRow(0).getCell(1).toString());

        //- 1.satirdaki 2.hucreyi bir string degiskene atayalim ve yazdiralim -
        String hucre = workbook.getSheet("Sayfa1").getRow(0).getCell(1).toString();

    //  2.satir 4.cell’in afganistan’in baskenti oldugunu test edelim
        String expected = "Kabil";
        String actual =workbook.getSheet("Sayfa1").getRow(1).getCell(3).toString();
        Assert.assertEquals(expected,actual);

    //- Satir sayisini bulalim
        System.out.println(workbook.getSheet("Sayfa1").getLastRowNum() + 1);

        //- Fiziki olarak kullanilan satir sayisini bulun
        System.out.println(workbook.getSheet("Sayfa2").getPhysicalNumberOfRows());

        //- Ingilizce Ulke isimleri ve baskentleri bir map olarak kaydedelim
        Map<String,String> ulke = new TreeMap<>();
        int sonsatir =workbook.getSheet("Sayfa1").getLastRowNum();

        for (int i = 1; i <sonsatir ; i++) {

            String key = workbook.getSheet("Sayfa1").getRow(i).getCell(0).toString();
            String value = workbook.getSheet("Sayfa1").getRow(i).getCell(1).toString();
            ulke.put(key,value);
        }
        System.out.println(ulke);


}
}
