import PagesQafox.ElementMethodPage;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.BaseTestQafox;

public class test4 extends BaseTestQafox {
    ElementMethodPage elementMethodPage=new ElementMethodPage();
    @Test

    public void  test4(){
        extentLogger.info("kullanici iphona ait fiyati bir fiyati dogrular");
        String preiss2=elementMethodPage.getIphonePreis();
        Assert.assertTrue(preiss2.contains("$123."),"Fiyat ürüne aittir");


    }

}
