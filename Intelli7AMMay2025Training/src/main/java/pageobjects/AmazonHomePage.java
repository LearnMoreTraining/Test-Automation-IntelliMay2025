package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class AmazonHomePage {

    WebDriver driver ; //null knowledge

    public AmazonHomePage(WebDriver driver){
        this.driver = driver;
    }

    public AmazonHomePage enterProductValue(String value){
          driver.findElement(By.id("twotabsearchtextbox")).sendKeys(value);
          return this;
    }

    public AmazonHomePage clickSearchIcon(){
        driver.findElement(By.id("nav-search-submit-button")).click();
        return this;
    }

    public void selectCategoryDropdownValue(){

       // Select select = new Select();
    }

    public void clickBabyWishList(){
        WebElement element = driver.findElement(By.id("nav-link-accountList-nav-line-1"));
        Actions actions = new Actions(driver);
        actions.clickAndHold(element).build().perform();
        driver.findElement(By.linkText("Baby Wishlist")).click();
    }




}
