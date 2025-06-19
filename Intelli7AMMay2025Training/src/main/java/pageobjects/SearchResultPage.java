package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class SearchResultPage {

    WebDriver driver;
    public SearchResultPage(WebDriver driver) {
        this.driver = driver;
    }

    public void sortBy(){

    }

    public void selectProduct(String value){

            driver.findElement(By.xpath("//div[@data-cel-widget='search_result_"+value+"']/descendant::a[2]")).sendKeys(Keys.chord(Keys.CONTROL,Keys.ENTER));
    }
}
