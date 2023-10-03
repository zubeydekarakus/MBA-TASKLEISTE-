import PagesQafox.ElementMethodPage;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import utilities.BaseTestQafox;

public class test6 extends BaseTestQafox {
    ElementMethodPage elementMethodPage=new ElementMethodPage();
    @Test
    public void textGetir() throws InterruptedException {
        extentLogger.info("Kullanici iphone gorseline tiklar");
        elementMethodPage.resim2Iphone.click();
        extentLogger.info("kullanici aciklama textini inceler");
        WebElement elementtext=driver.findElement(By.cssSelector("#tab-description"));
        System.out.println(elementtext.getText());
        System.out.println(elementtext.getText().length());
extentLogger.info("Kullanici aciklamamanin yetersiz oldugunu dogrular");
        int textUzunlugu=elementtext.getText().length();
        if (textUzunlugu!=350){
            System.out.println("Ürüne ait aciklama yeterlidir");
        }else{
            System.out.println("Ürüne ait aciklama yeterli degildir");
        }




    }
}
