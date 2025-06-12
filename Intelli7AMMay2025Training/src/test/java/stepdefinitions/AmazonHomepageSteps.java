package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AmazonHomepageSteps {
   WebDriver driver;
    WebElement catergoryDropdown;
    @Given("user naviagtes to Amazon Home Page")
    public void homePage(){
        driver = new ChromeDriver();
        driver.get("https://www.amazon.in/");
    }

    @When("user enter the product name {string} in search box")
    public void enterProductName(String value) {
      //  driver.findElement(By.id("twotabsearchtextbox")).sendKeys(value);
     //   driver.findElement(By.className("nav-input nav-progressive-attribute")).sendKeys(value);
     //   driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys(value);
        driver.findElement(By.xpath("//input[@class='nav-input nav-progressive-attribute']")).sendKeys(value);
    }

    @Then("verify the search result")
    public void verifySearchResult() {
    }

    @And("user clicks on search icon")
    public void clicksSearchIcon() {
      //  driver.findElement(By.id("nav-search-submit-button")).click();
        driver.findElement(By.xpath("//input[@type='submit']")).click();
    }

    @And("verify the title of the current page")
    public void verifyTheTitle() {

        String title = driver.getTitle();
        System.out.println(title);
    }


    @When("user extracts dropdown values")
    public void userExtractsDropdownValues() {

        catergoryDropdown = driver.findElement(By.id("searchDropdownBox"));
        int size = catergoryDropdown.findElements(By.tagName("option")).size();

           for(int i = 0 ; i < size ; i++){
              String val = catergoryDropdown.findElements(By.tagName("option")).get(i).getText();
               System.out.println(val);
           }

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

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://book.spicejet.com/");

    }

    @When("user select values from the dropdown")
    public void userSelectValuesFromTheDropdown() {

        driver.findElement(By.id("ControlGroupSearchView_AvailabilitySearchInputSearchVieworiginStation1_CTXT")).click();
        driver.findElement(By.xpath("//a[@value='MAA']")).click();
        driver.findElement(By.xpath("//div[@id='glsControlGroupSearchView_AvailabilitySearchInputSearchViewdestinationStation1_CTNR']/descendant::a[@value='BOM']")).click();
    }
    
    }
