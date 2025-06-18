package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WikiPage {
    WebDriver driver;
    public WikiPage(WebDriver driver) {
        this.driver = driver;
    }

    public void getShareHolderValue(){
       int size  = driver.findElements(By.xpath("//table[@class='wikitable sortable jquery-tablesorter']/tbody/tr/td[1]")).size();
       for(int i =0 ; i < size ; i++){
          String val = driver.findElements(By.xpath("//table[@class='wikitable sortable jquery-tablesorter']/tbody/tr/td[1]")).get(i).getText();
           System.out.println(val);
       }
    }

    public void getShareHoldingValue(){
        int size  = driver.findElements(By.xpath("//table[@class='wikitable sortable jquery-tablesorter']/tbody/tr/td[2]")).size();
        for(int i =0 ; i < size ; i++){
            String val = driver.findElements(By.xpath("//table[@class='wikitable sortable jquery-tablesorter']/tbody/tr/td[2]")).get(i).getText();
            System.out.println(val);
        }
    }
}
