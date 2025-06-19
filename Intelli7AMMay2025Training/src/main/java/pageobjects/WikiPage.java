package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WikiPage {
    WebDriver driver;
    public WikiPage(WebDriver driver) {
        this.driver = driver;
    }

    public List<String> getShareHolderValue(){
        List<String> shareholderValue = new ArrayList<String>();
       int size  = driver.findElements(By.xpath("//table[@class='wikitable sortable jquery-tablesorter']/tbody/tr/td[1]")).size();
       for(int i =0 ; i < size ; i++){
          String val = driver.findElements(By.xpath("//table[@class='wikitable sortable jquery-tablesorter']/tbody/tr/td[1]")).get(i).getText();
           shareholderValue.add(val);
       }
       return shareholderValue;
    }

    public List<String> getShareHoldingValue(){
        List<String> shareholdingValue = new ArrayList<String>();
        int size  = driver.findElements(By.xpath("//table[@class='wikitable sortable jquery-tablesorter']/tbody/tr/td[2]")).size();
        for(int i =0 ; i < size ; i++){
            shareholdingValue.add( driver.findElements(By.xpath("//table[@class='wikitable sortable jquery-tablesorter']/tbody/tr/td[2]")).get(i).getText());
        }
        return shareholdingValue;
    }

    public Map<String, String> getShareholderShareholdingValue(){

        Map<String,String> m = new HashMap<String,String>();
        int size  = driver.findElements(By.xpath("//table[@class='wikitable sortable jquery-tablesorter']/tbody/tr/td[1]")).size();
        for(int i =0 ; i < size ; i++){
            String col1Val = driver.findElements(By.xpath("//table[@class='wikitable sortable jquery-tablesorter']/tbody/tr/td[1]")).get(i).getText();
            String col2Val = driver.findElements(By.xpath("//table[@class='wikitable sortable jquery-tablesorter']/tbody/tr/td[2]")).get(i).getText();
            m.put(col1Val,col2Val);
        }
        return m;
    }
}
