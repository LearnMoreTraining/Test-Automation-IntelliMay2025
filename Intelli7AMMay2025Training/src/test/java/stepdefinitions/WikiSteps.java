package stepdefinitions;

import base.CucumberContext;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class WikiSteps {
    CucumberContext testContext;
    public WikiSteps(CucumberContext testContext){
        this.testContext = testContext;
    }

    @Given("user extracts the shareholder and shareholding values")
    public void getValues(){

        testContext.pageObjectManager.getWikiPage().getShareHolderValue();
        testContext.pageObjectManager.getWikiPage().getShareHoldingValue();

    }

    @Then("validate the values")
    public void validateTheValues() {

    }
}
