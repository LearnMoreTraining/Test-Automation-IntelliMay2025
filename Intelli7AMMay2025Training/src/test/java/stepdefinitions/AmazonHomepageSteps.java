package stepdefinitions;

import base.BrowserBase;
import base.CucumberContext;
import base.PageObjectManager;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.io.IOException;

public class AmazonHomepageSteps {

    WebElement catergoryDropdown;

    CucumberContext context;

    public AmazonHomepageSteps(CucumberContext context){
        this.context = context;
    }

    @Given("user naviagtes to Amazon Home Page")
    public void homePage() throws IOException {



    }

    @When("user enter the product name {string} in search box")
    public void enterProductName(String value) {

      // context.pageObjectManager.getAmazonHomePage().enterProductValue("data",0,0);
        context.pageObjectManager.getAmazonHomePage().enterProductValue("product","data");
        context.m.put("pie","3.14");
    }

    @Then("verify the search result")
    public void verifySearchResult() {


    }



    @And("verify the title of the current page")
    public void verifyTheTitle() {
        Assert.assertEquals(context.m.get("pie"),context.browserBase.launchBrowser().findElement(By.cssSelector("")).getText());


    }


    @When("user extracts dropdown values")
    public void userExtractsDropdownValues() {

//        catergoryDropdown = driver.findElement(By.id("searchDropdownBox"));
//        int size = catergoryDropdown.findElements(By.tagName("option")).size();
//
//           for(int i = 0 ; i < size ; i++){
//              String val = catergoryDropdown.findElements(By.tagName("option")).get(i).getText();
//               System.out.println(val);
//           }

    }

    @Then("user validate the office product value in the dropdown")
    public void userValidateTheOfficeProductValueInTheDropdown() {

    }

    @And("user select value from the dropdown")
    public void userSelectValueFromTheDropdown() {

        Select catergoryDrop = new Select(catergoryDropdown);
       // catergoryDrop.selectByVisibleText("Electronics");
       // catergoryDrop.selectByIndex(5);
        catergoryDrop.selectByValue("search-alias=furniture");

     //   Select a = new Select(driver.findElement(By.id("ControlGroupSearchView_AvailabilitySearchInputSearchView_DropDownListPassengerType_ADT")));
     //   a.selectByVisibleText("2");
    }

    @Given("user navigates to Spice jet")
    public void userNavigatesToSpiceJet() {
//
//        driver = new ChromeDriver();
//        driver.manage().window().maximize();
//        driver.get("https://book.spicejet.com/");

    }

    @When("user select values from the dropdown")
    public void userSelectValuesFromTheDropdown() {

//        driver.findElement(By.id("ControlGroupSearchView_AvailabilitySearchInputSearchVieworiginStation1_CTXT")).click();
//        driver.findElement(By.xpath("//a[@value='MAA']")).click();
//        driver.findElement(By.xpath("//div[@id='glsControlGroupSearchView_AvailabilitySearchInputSearchViewdestinationStation1_CTNR']/descendant::a[@value='BOM']")).click();
   }

    @When("user clicks on baby wish list")
    public void userClicksOnBabyWishList() {

        context.pageObjectManager.getAmazonHomePage().clickBabyWishList().switchWindow();

    }

    @Then("validate the navigation")
    public void validateTheNavigation() {
            Assert.assertFalse(context.pageObjectManager.getBabyWishListPage().isBabyWishListIsPresent());
        //Assert.assertTrue( context.pageObjectManager.getBabyWishListPage().isBabyWishListIsPresent());
        //  context.pageObjectManager.getBabyWishListPage().enterBabyProductValue("dress");
    }

    @Given("user search the product")
    public void userSearchTheProduct() {
       // context.pageObjectManager.getAmazonHomePage().enterProductValue("laptop").clickSearchIcon();
    }

    @When("user select the specific product")
    public void userSelectTheSpecificProduct() {
        context.pageObjectManager.getSearchResultPage().selectProduct("4");
    }

    @Then("verify the title of page")
    public void verifyTheTitleOfPage() {

    }
}
