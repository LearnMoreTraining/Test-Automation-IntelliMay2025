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

            FileInputStream fis = null;
            try {
                fis = new FileInputStream(new File("src/main/resources/config/frameworkconfi.properties"));
            } catch (FileNotFoundException e) {
                throw new RuntimeException(e);
            }
            Properties prop = new Properties();

            try {
                prop.load(fis);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

            if (prop.getProperty("browser").equalsIgnoreCase("chrome")) {
                driver = new ChromeDriver();
            } else if (prop.getProperty("browser").equalsIgnoreCase("edge")) {
                driver = new EdgeDriver();
            } else if (prop.getProperty("browser").equalsIgnoreCase("safari")) {
                driver = new SafariDriver();
            } else {
                throw new InvalidArgumentException("Configure Valid browser");
            }
            driver.manage().window().maximize();
            driver.get(prop.getProperty("url"));
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        }

        return driver;
    }
}
