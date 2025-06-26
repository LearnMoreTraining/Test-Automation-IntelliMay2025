package base;

import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class CucumberContext {

   public PageObjectManager pageObjectManager;
   public BrowserBase browserBase;
   public Map <String , String > m = new HashMap<>();
   public TakesScreenshot screenshot;
   public CucumberContext text;

    public CucumberContext() throws IOException {
        browserBase = new BrowserBase();
        pageObjectManager = new PageObjectManager(browserBase.launchBrowser());
        text = new CucumberContext();
    }


    public void TakeScreen(){

    }


}
