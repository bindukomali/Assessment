package com.valuemomentum.demo.Assessment;

import org.apache.logging.log4j.*;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.valuemomentum.demo.Assessment.Pages.HomePage;
import com.valuemomentum.demo.Assessment.Pages.ProductDetailsPage;
import com.valuemomentum.demo.Assessment.Pages.SearchResultsPage;
import com.valuemomentum.demo.Assessment2.BaseTest;
public class SmokeTest extends BaseTest {

 

    private static final Logger Logger = LogManager.getLogger(SmokeTest.class);
    WebDriver driver;
    
    HomePage homePage;
    SearchResultsPage searchResultsPage;
    ProductDetailsPage productDetailsPage;
    //ProductPage productPage;
    
    @BeforeClass
    public void setup()
    {    
    
        Logger.info("Setup method called");
        homePage = new HomePage(getDriver());
    }
    
     
    @Test(priority = 1,enabled = true)
    public void verifyMobile() throws Exception
    {        
    	 Logger.info("Mobile");
    //    System.out.println(" Thread id : "+Thread.currentThread().getId());                                                     
        searchResultsPage=homePage.clickOnItem();
        //Thread.sleep(2000);
        //js.executeScript("window.scrollBy(0,500)");
        //homePage.enterSearchText(searchtext);
        //searchResultsPage.clickOnItem();
        //searchResultsPage.clickOnItem();
        Logger.info("filter");
        searchResultsPage.clickOnFilter();
        Logger.info("Usb");
        productDetailsPage=searchResultsPage.clickOnProduct();  
        Logger.info("Add to cart");
        productDetailsPage.clickOnAddToCart();
    }
                
}