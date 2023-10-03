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

public class test2 extends BaseTestQafox {

    ElementMethodPage elementMethodPage = new ElementMethodPage();

    @Test
    public void iphonetest2() throws IOException {
        extentLogger.info("kullanici sayfaya giris yaptigini dogrular");
        String expectedMessage="Your Store";
        String actuelMassagee=driver.getTitle();
        Assert.assertEquals(expectedMessage,actuelMassagee,"sayfa görünülemedi");
        extentLogger.info("Kullanici iphone resmine tilar");
        elementMethodPage.iphonaTikla();


        extentLogger.info("Kullanici ürün altinda verilen fotograla uyumlulugu  screenshot ile dogrular");

        String date = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
        String screenshotPath = System.getProperty("user.dir") + "/test-output/ScreenShots/" + date + ".jpg";

        TakesScreenshot ts = (TakesScreenshot) Driver.getDriver();
        File kaynak = ts.getScreenshotAs(OutputType.FILE);

        File sonDosya = new File(screenshotPath);
        FileUtils.copyFile(kaynak, sonDosya);

        extentLogger.info("Test gecti");

    }

}
