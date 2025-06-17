package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

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

       // Select select = new Select();
    }

    public void clickBabyWishList(){
        WebElement element = driver.findElement(By.id("nav-link-accountList-nav-line-1"));
        Actions actions = new Actions(driver);
        actions.clickAndHold(element).build().perform();
        driver.findElement(By.linkText("Baby Wishlist")).click();
    }


}
