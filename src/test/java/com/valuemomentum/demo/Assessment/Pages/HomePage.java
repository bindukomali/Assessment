package com.valuemomentum.demo.Assessment.Pages;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class HomePage extends BasePage {
   
   
   public HomePage(WebDriver driver)
   {	
       super(driver);
       
   }
   
   //element
   @FindBy(xpath="//*[text()='Mobiles']")
   private WebElement _selectMoblies;
   
   public SearchResultsPage clickOnItem()
   {
       _selectMoblies.click();
   //    WebDriverHelper.switchToWindow();
       return new  SearchResultsPage(getDriver());
       //return null;
   }
   
}
