package PagesQafox;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public abstract class PagesQafox  {
    public PagesQafox(){
        PageFactory.initElements(Driver.getDriver(),this);
    }






}
