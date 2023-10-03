import PagesQafox.ElementMethodPage;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.BaseTestQafox;

public class test5 extends BaseTestQafox {
    ElementMethodPage elementMethodPage=new ElementMethodPage();

    @Test
    public void preisTest5() {
        extentLogger.info("Kullanici macbook a ait fiyati dogrular");

        String preiss=elementMethodPage.getPreis();
        Assert.assertTrue(preiss.contains("602.00"), "ürünün fiyat degeri yoktur");

        extentLogger.info("test gecti ");
    }

}