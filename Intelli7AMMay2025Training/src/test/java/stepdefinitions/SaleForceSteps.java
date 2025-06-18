package stepdefinitions;

import base.CucumberContext;
import base.PageObjectManager;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;

public class SaleForceSteps {
    CucumberContext context;
    public SaleForceSteps(CucumberContext context){
        this.context = context;
    }

    @Given("user enter username {string} and password {string}")
    public void enterCredi(){


    }

    @And("user clicks on search icon")
    public void clicksSearchIcon() {
            context.pageObjectManager.getAmazonHomePage().clickSearchIcon();

    }

}
