package base;

import org.openqa.selenium.WebDriver;
import pageobjects.*;

public class PageObjectManager {
    WebDriver driver;
    public PageObjectManager(WebDriver driver){
        this.driver = driver ;
    }

    public AmazonHomePage getAmazonHomePage(){
        AmazonHomePage homePage = new AmazonHomePage(driver);
        return homePage;
    }

    public ProductSpeificPage getProductSpecificPage(){
        ProductSpeificPage productSpeificPage = new ProductSpeificPage(driver);
        return productSpeificPage;
    }

    public SearchResultPage getSearchResultPage(){
        SearchResultPage searchResultPage = new SearchResultPage(driver);
        return searchResultPage;
    }

    public AmazonPaymentPage getPaymentPage(){
        AmazonPaymentPage paymentPage = new AmazonPaymentPage(driver);
        return paymentPage;
    }

    public BabyWishListPage getBabyWishListPage(){
        BabyWishListPage wishListPage = new BabyWishListPage(driver);
        return wishListPage;
    }
}
