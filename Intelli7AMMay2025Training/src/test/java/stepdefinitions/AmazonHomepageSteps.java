package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonHomepageSteps {
   WebDriver driver;
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

        WebElement catergoryDropdown = driver.findElement(By.id("searchDropdownBox"));
        int size = catergoryDropdown.findElements(By.tagName("option")).size();

           for(int i = 0 ; i < size ; i++){
              String val = catergoryDropdown.findElements(By.tagName("option")).get(i).getText();
               System.out.println(val);
           }

        System.out.println("hello");

    }

    @Then("user validate the office product value in the dropdown")
    public void userValidateTheOfficeProductValueInTheDropdown() {

    }
}
