package stepdefinitions;

import base.CucumberContext;
import base.PageObjectManager;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;

public class SaleForceSteps {
    CucumberContext context;
    public SaleForceSteps(CucumberContext context){
        this.context = context;
    }

    @Given("user enter username {string} and password {string}")
    public void enterCredi(String user , String pas){
        WebElement username =  context.browserBase.launchBrowser().findElement(By.id("username"));
        username.sendKeys("ae");
        context.browserBase.launchBrowser().navigate().refresh();
        try{
            username.sendKeys("abc");
        } catch (StaleElementReferenceException e) {
            username= context.browserBase.launchBrowser().findElement(By.id("username"));
            username.sendKeys("abc");
        }

    }

    @And("user clicks on search icon")
    public void clicksSearchIcon() {
            context.pageObjectManager.getAmazonHomePage().clickSearchIcon();
    }

}
