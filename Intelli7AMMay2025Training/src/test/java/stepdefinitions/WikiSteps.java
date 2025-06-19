package stepdefinitions;

import base.CucumberContext;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

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
}
