package stepdefinitions;

import base.CucumberContext;
import base.PageObjectManager;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

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

    @Given("user handles the calander")
    public void userHandlesTheCalander() {

        context.browserBase.launchBrowser().findElement(By.xpath("//*[@id='date_picker_id_1']/following-sibling::button")).click();

        context.browserBase.launchBrowser().findElement(By.xpath("//div[@class='ui-datepicker-group ui-datepicker-group-last']/child::table/descendant::a[@data-date='"+5+"']"));

        context.browserBase.launchBrowser().findElement(By.xpath("//div[@class='ui-datepicker-group ui-datepicker-group-last']/div/div/span")).getText();

        while(!context.browserBase.launchBrowser().findElement(By.xpath("//div[@class='ui-datepicker-group ui-datepicker-group-last']/div/div/span")).getText().equals("Sep")){
            context.browserBase.launchBrowser().findElement(By.cssSelector(".ui-icon.ui-icon-circle-triangle-e")).click();
        }

       int size = context.browserBase.launchBrowser().findElements(By.xpath("//table[@class='wikitable']/tbody/tr/th")).size();

        for(int i =0 ; i < size ; i++ ){
            context.browserBase.launchBrowser().findElements(By.xpath("//table[@class='wikitable']/tbody/tr/th")).get(i).getText();
        }

     List<WebElement> elements =context.browserBase.launchBrowser().findElements(By.xpath("//table[@class='wikitable']/tbody/tr/th"));
        List<String> l = new ArrayList<>();
        for(WebElement e:elements){
           l.add (e.getText());
        }
    }
}
