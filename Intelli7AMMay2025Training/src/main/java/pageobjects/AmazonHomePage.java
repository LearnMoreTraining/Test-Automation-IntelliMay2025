package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AmazonHomePage {

    WebDriver driver ; //null knowledge

    public AmazonHomePage(WebDriver driver){
        this.driver = driver;
    }

    public void enterProductValue(String value){
          driver.findElement(By.id("twotabsearchtextbox")).sendKeys(value);
    }

    public void clickSearchIcon(){
        driver.findElement(By.id("nav-search-submit-button")).click();
    }

    public void selectCategoryDropdownValue(){

    }


}
