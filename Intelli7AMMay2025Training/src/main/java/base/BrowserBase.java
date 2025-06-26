package base;

import org.openqa.selenium.InvalidArgumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

public class BrowserBase {

    WebDriver driver ;
    public WebDriver launchBrowser()  {
     //   File f = new File("src/main/resources/frameworkconfi.properties");
        if(driver == null) {
            if (PropertyFilehandler.getData("browser","framework").equalsIgnoreCase("chrome")) {
                driver = new ChromeDriver();
            } else if (PropertyFilehandler.getData("browser","framework").equalsIgnoreCase("edge")) {
                driver = new EdgeDriver();
            } else if (PropertyFilehandler.getData("browser","framework").equalsIgnoreCase("safari")) {
                driver = new SafariDriver();
            } else {
                throw new InvalidArgumentException("Configure Valid browser");
            }
            driver.manage().window().maximize();
          //  driver.get(PropertyFilehandler.getData("url","framework"));
            driver.navigate().to(PropertyFilehandler.getData("url","framework"));
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        }

        return driver;
    }
}
