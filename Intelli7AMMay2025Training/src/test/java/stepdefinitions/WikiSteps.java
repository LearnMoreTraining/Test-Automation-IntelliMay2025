package stepdefinitions;

import base.CucumberContext;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class WikiSteps {
    CucumberContext testContext;
    public WikiSteps(CucumberContext testContext){
        this.testContext = testContext;
    }

    @Given("user extracts the shareholder and shareholding values")
    public void getValues(){


        testContext.pageObjectManager.getWikiPage().getShareHoldingValue();

        System.out.println(testContext.pageObjectManager.getWikiPage().getShareHolderValue());

    }

    @Then("validate the values")
    public void validateTheValues() {

        System.out.println(testContext.pageObjectManager.getWikiPage().getShareholderShareholdingValue());
        Assert.assertEquals("100.0%",testContext.pageObjectManager.getWikiPage().getShareholderShareholdingValue().get("Total"));
        Assert.assertEquals("Public",testContext.pageObjectManager.getWikiPage().getShareHolderValue().get(3));
        Assert.assertEquals("Total",testContext.pageObjectManager.getWikiPage().getShareHolderValue().get(5));

    }

    @Given("User handles drag and drop")
    public void userHandlesDragAndDrop() {
        testContext.browserBase.launchBrowser().switchTo().frame(testContext.browserBase.launchBrowser().findElement(By.className("demo-frame")));
        Actions s = new Actions(testContext.browserBase.launchBrowser());
        WebElement drag = testContext.browserBase.launchBrowser().findElement(By.id("draggable"));
        WebElement drop =  testContext.browserBase.launchBrowser().findElement(By.id("droppable"));
        s.dragAndDrop(drag,drop).build().perform();
        testContext.browserBase.launchBrowser().switchTo().defaultContent();

        testContext.browserBase.launchBrowser().switchTo().alert().accept();
        testContext.browserBase.launchBrowser().switchTo().alert().dismiss();
        testContext.browserBase.launchBrowser().switchTo().alert().sendKeys("");
        testContext.browserBase.launchBrowser().switchTo().alert().accept();
        testContext.browserBase.launchBrowser().switchTo().alert().getText();

        Assert.assertEquals("I am an alert box!", testContext.browserBase.launchBrowser().switchTo().alert().getText());


    }
}
