package pageobjects;

import base.ExcelHandler;
import base.PropertyFilehandler;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.Set;

public class AmazonHomePage {

    private WebDriver driver ; //null knowledge

    public AmazonHomePage(WebDriver driver){
        this.driver = driver;
    }

    public AmazonHomePage enterProductValue(String value){
        try{
            driver.findElement(By.id("twotabsearchtextbox")).sendKeys(value);
        }
        catch (ElementNotInteractableException e){
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("arguments[0].value='"+value+"';",driver.findElement(By.id("twotabsearchtextbox")));
            js.executeScript("window.scrollTo(0,700)","");
            js.executeScript("window.scrollTo(0,-document.body.scrollHeight)","");

            Actions a = new Actions(driver);
           // a.contextClick() - rightclick
            a.moveToElement(driver.findElement(By.xpath("//*[text()='Create your wishlist']"))).build().perform();
        }

          return this;
    }

    public AmazonHomePage enterProductValue(String name , int row , int col){
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys(ExcelHandler.getExcelData(name , row , col));
        return this;
    }

    public AmazonHomePage enterProductValue(String name, String file){
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys(PropertyFilehandler.getData(name,file));
        return this;
    }

    public AmazonHomePage clickSearchIcon(){
        try{
            driver.findElement(By.id("nav-search-submit-button")).click(); // implicit wait - 5 sec
        }
        catch (NoSuchElementException e){
            WebDriverWait driverWait = new WebDriverWait(driver, Duration.ofSeconds(20));
            driverWait.until(ExpectedConditions.presenceOfElementLocated(By.id("nav-search-submit-button")));
            driver.findElement(By.id("nav-search-submit-button")).click();
        }

        return this;
    }

    public void clickSearch(){
        try{
            driver.findElement(By.id("nav-search-submit-button")).click();
        } catch (ElementClickInterceptedException e) {
            JavascriptExecutor js = (JavascriptExecutor)driver;
            js.executeScript("arguments[0].click()",driver.findElement(By.id("nav-search-submit-button")));
        }


    }

    public void selectCategoryDropdownValue(){

       // Select select = new Select();
    }

    public AmazonHomePage clickBabyWishList(){
        WebElement element = driver.findElement(By.id("nav-link-accountList-nav-line-1"));
        Actions actions = new Actions(driver);
        actions.clickAndHold(element).build().perform();
        driver.findElement(By.linkText("Baby Wishlist")).sendKeys(Keys.chord(Keys.CONTROL,Keys.ENTER));
        return this;
    }

    public void switchWindow(){

//        try{
//            driver.findElement(By.xpath("//h2[text()='Baby Wishlist']")).isDisplayed();
//        }
//        catch(NoSuchElementException e){
//
//            WebDriverWait driverWait = new WebDriverWait(driver, Duration.ofSeconds(60));
//            driverWait.pollingEvery(Duration.ofSeconds(10));
//            driverWait.ignoring(NoSuchElementException.class);
//            driverWait.until(ExpectedConditions.presenceOfElementLocated(By.id("twotabsearchtextbox")));
//
//        }

        Set<String> winProp =driver.getWindowHandles();
     String parentWindow = driver.getWindowHandle();
     String childWindows = null;
     for(String win:winProp){
         if(!win.equals(parentWindow)){
             childWindows = win;
         }
     }
        System.out.println(winProp);
        System.out.println("parent" + parentWindow);
        System.out.println("Child" + childWindows);

        driver.switchTo().window(childWindows);
        System.out.println(driver.findElement(By.xpath("//h2[text()='Baby Wishlist']")).isDisplayed());
        driver.switchTo().window(parentWindow);

        for(String win : winProp){
            driver.switchTo().window(win);
            if(driver.getTitle().equals("child window name")){
                break;
            }
        }

    }






}
