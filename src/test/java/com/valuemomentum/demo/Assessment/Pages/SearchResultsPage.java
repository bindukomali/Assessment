package com.valuemomentum.demo.Assessment.Pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.valuemomentum.demo.Assessment2.WebDriverHelper;

 
public class SearchResultsPage extends BasePage {

 

    public SearchResultsPage(WebDriver driver) {
        super(driver);
    }

     // element
    @FindBy(xpath = "//*[text()='Cloudtail India']")
    private WebElement Cloudtail;

    public ProductDetailsPage clickOnFilter() {
        Cloudtail.click();
        return new ProductDetailsPage(driver);
    }
        
        @FindBy(xpath = "//*[text()='AmazonBasics USB Type-C to USB-A 2.0 Male Cable - 3 Feet (0.9 Meters) - Black']")
        private WebElement USB;
 

        public ProductDetailsPage clickOnProduct() {
            USB.click();
        
        WebDriverHelper.switchToWindow();
        return new ProductDetailsPage(driver);

}
        
}