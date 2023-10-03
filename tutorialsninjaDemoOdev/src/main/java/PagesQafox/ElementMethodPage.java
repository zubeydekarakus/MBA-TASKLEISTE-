package PagesQafox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ElementMethodPage extends PagesQafox {
    @FindBy(xpath = "/html/body/header/div/div/div[1]/div/h1/a")//Qafox.com
    public WebElement title;


    @FindBy(xpath = "/html/body/div[2]/div/div/div[2]/div[1]/div/div[1]/a/img")
    public WebElement macBook;

    @FindBy(xpath = "//*[@id=\"content\"]/div[2]/div[2]/div/div[1]/a/img")
    public WebElement resim2Iphone;

    @FindBy(xpath = "/html/body/div[2]/div/div/div[2]/div[3]/div/div[1]/a/img")
    public WebElement appleCinema30;

    @FindBy(xpath = "/html/body/div[2]/div/div/div[2]/div[1]/div/div[2]/p[2]")
    public WebElement macbookpreis;


    @FindBy(xpath = "//*[@id=\"content\"]/div[2]/div[2]/div/div[2]/p[2]")
    public WebElement iphonPreise;

    @FindBy(xpath = "content\"]/div[1]/div[1]/ul[2]/li[1]")
    public WebElement aciklamaa;


    @FindBy(xpath = "//*[@id=\"tab-description\"]/p/text()")
    public WebElement text;


//********************methodlar*****************

    public void macbookclick() {
        macBook.click();

    }

    public String titledogrula() {
        title.getText();
        return titledogrula();
    }


    public void iphonaTikla() {
        resim2Iphone.click();
    }

    public void resim3() {
        appleCinema30.click();
    }

    public String getPreis() {
        return macbookpreis.getText();

    }
    public String getIphonePreis(){
        return iphonPreise.getText();
    }
    public String description(){
        return text.getText();
    }
    public String descriptionButton(){
        return aciklamaa.getText();
    }
}