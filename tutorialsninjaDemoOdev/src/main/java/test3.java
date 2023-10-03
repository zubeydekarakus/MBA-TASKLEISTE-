import PagesQafox.ElementMethodPage;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.BaseTestQafox;
import utilities.Driver;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class test3 extends BaseTestQafox {
    ElementMethodPage elementMethodPage=new ElementMethodPage();

    @Test
    public void appleCinematest3() throws IOException {
        extentLogger.info("kullanici sayfaya giris yaptigini dogrular");
        String expectedMessage="Your Store";
        String actuelMassagee=driver.getTitle();
        Assert.assertEquals(expectedMessage,actuelMassagee,"sayfa görünülemedi");
        extentLogger.info("Kullanici apple cınema30 görseline tiklar");
        elementMethodPage.resim3();

        extentLogger.info("Kullanici ürün altinda verilen görsellerın uyumlulugu olmadigini screenshot ile dogrular");

        String date = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
        String screenshotPath = System.getProperty("user.dir") + "/test-output/ScreenShots/" + date + ".jpg";

        TakesScreenshot ts = (TakesScreenshot) Driver.getDriver();
        File kaynak = ts.getScreenshotAs(OutputType.FILE);

        File sonDosya = new File(screenshotPath);
        FileUtils.copyFile(kaynak, sonDosya);

        extentLogger.info("Test Fail oldu");
        //bug ticket yazildi

    }
}
