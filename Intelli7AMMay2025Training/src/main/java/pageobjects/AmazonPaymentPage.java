package pageobjects;

import base.ExcelHandler;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AmazonPaymentPage extends ExcelHandler {
    WebDriver driver;
    public AmazonPaymentPage(WebDriver driver) {
    }

    public void m1(){

        driver.findElement(By.id("")).sendKeys();
    }
}
