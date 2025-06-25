package hooks;

import base.CucumberContext;
import io.cucumber.java.*;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hooks {

    private CucumberContext context;

    public Hooks(CucumberContext context){
        this.context = context;
    }

    @Before
    public void beforeCall(){
        System.out.println("Execution is started");
    }

    @After
    public void closeDriver(){
       context.browserBase.launchBrowser().quit();
    }

    @AfterStep
    public void screenshotCapture(Scenario s){
        TakesScreenshot screenshot = (TakesScreenshot)context.browserBase.launchBrowser();
       byte [] data= screenshot.getScreenshotAs(OutputType.BYTES);
       s.attach(data,"image/png",s.getName());
    }
}
