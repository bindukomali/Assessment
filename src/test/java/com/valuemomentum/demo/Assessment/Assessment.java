package com.valuemomentum.demo.Assessment;



import org.testng.annotations.Test;
import java.io.File;
import java.io.IOException;
import java.time.Duration;


import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;


import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;


import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.TakesScreenshot;
//import org.openqa.selenium.support.ui.Select;

public class Assessment {
		WebDriver driver;
		
        @BeforeTest
        public void test_beforesuit() {
        	System.out.println("Before Suit");
        System.setProperty("webdriver.chrome.driver", "C:\\testing\\chrome_driver\\chromedriver.exe");
        // calling web driver
	    // calling web driver
         driver=new ChromeDriver();
    
        }
        
        @AfterTest
        public void test_aftersuit() {
        	System.out.println("After Suit");
       driver.close();
        driver.quit();
        }
        
		@Test
		public void verify() throws InterruptedException
	    {
	       
	        //driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	       
	        driver.get("https://www.medplusmart.com/");
	        driver.manage().window().maximize();
	        System.out.println(driver.getTitle());
	        File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	        try
	        {
	            FileUtils.copyFile(srcFile, new File("C:\\training\\java\\automationtest\\ScreenShot1\\image1.png"));
	        }
	        catch (IOException e) {
	           
	            e.printStackTrace();
	        }
	     
	        
        WebElement category=driver.findElement(By.xpath("(//*[text()='Health Store'])[2]"));
      
        Actions action=new Actions(driver);
        action.moveToElement(category).perform();
        File HamBurger = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        try
        {
            FileUtils.copyFile(HamBurger, new File("C:\\training\\java\\automationtest\\ScreenShot1\\image2.png"));
        }
        catch (IOException e) {
         
            e.printStackTrace();
        }
 
	    
      //personal care  
       // WebElement personalcare=driver.findElement(By.linkText("Personal Care"));
       // action.moveToElement(personalcare).perform();
       // System.out.println(driver.findElement(By.linkText("Personal Care")).getText());
     
        WebElement personalCare = new WebDriverWait(driver,Duration.ofSeconds(5))
                .until(ExpectedConditions.elementToBeClickable(By.xpath("(//a[@title='Personal Care'])")));
       
        System.out.println(personalCare.getText());
        personalCare.click();
        File PersonalC = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        try
        {
            FileUtils.copyFile(PersonalC, new File("C:\\training\\java\\automationtest\\ScreenShot1\\image3.png"));
        }
        catch (IOException e) {
         
            e.printStackTrace();
        }
        
       
       System.out.println(driver.findElement(By.linkText("Personal Care")).getText());
      
	   // driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
       //selecting oral care
       // driver.findElement(By.linkText("Oral Care")).click();
        WebElement oralCare = new WebDriverWait(driver,Duration.ofSeconds(5))
                .until(ExpectedConditions.elementToBeClickable(By.xpath("(//a[@title='Oral Care'])[2]")));

        System.out.println(oralCare.getText());
        oralCare.click();
        
        
       // WebElement oralCare=driver.findElement(By.xpath("(//a[@title='Oral Care'])[2]")).click();
       

        System.out.println(driver.findElement(By.linkText("Oral Care")).getText());
        System.out.println("Title: "+driver.getTitle());
        File oral_care = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        try 
        {
			FileUtils.copyFile(oral_care, new File("C:\\training\\java\\automationtest\\ScreenShot1\\image4.png"));
		}
        catch (IOException e) 
        {
			
			e.printStackTrace();
		}
       
	    
      
        
        //Select Toothpaste & powder
       // driver.findElement(By.xpath("(//a[@title='Tooth Paste & Powder'])[2]")).click();
        WebElement ToothPaste = new WebDriverWait(driver,Duration.ofSeconds(5))
                .until(ExpectedConditions.elementToBeClickable(By.xpath("(//a[@title='Tooth Paste & Powder'])[2]")));

 

        System.out.println(ToothPaste.getText());
        ToothPaste.click();
        
        File Toothpaste_powder = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        try
        {
            FileUtils.copyFile( Toothpaste_powder, new File("C:\\training\\java\\automationtest\\ScreenShot1\\image5.png"));
        }
        catch (IOException e) {
           
            e.printStackTrace();
        }
       
        
             
        System.out.println(driver.findElement(By.linkText("Tooth Paste & Powder")).getText());
        
        //slider
         WebElement slider = driver.findElement(By.xpath("//*[@class='slider-selection']")); 
         action.clickAndHold(slider);
         action.moveByOffset(-45, 0).build().perform();
         driver.findElement(By.xpath("(//*[@class='slider-handle round'])[2]")).click();
         File slider1= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
         try
         {
             FileUtils.copyFile(slider1, new File("C:\\training\\java\\automationtest\\ScreenShot1\\image6.png"));
         }
         catch (IOException e) {
            
             e.printStackTrace();
         }
         
          
         
         //select dropdown
        driver.findElement(By.linkText("140 grams")).click();     
      
       
         //change to 70gms
         driver.findElement(By.linkText("70 grams - Rs 55.00")).click();
      
         
      
         //Add to cart
         driver.findElement(By.xpath("(//*[text()='Add to Cart'])[2]")).click();
         
         File cart = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
         try
         {
             FileUtils.copyFile(cart, new File("C:\\training\\java\\automationtest\\ScreenShot1\\image7.png"));
         }
         catch (IOException e) {
            
             e.printStackTrace();
         }
           Thread.sleep(2000);
         
         driver.findElement(By.linkText("150 grams")).click();
       //  Thread.sleep(2000);
    
         //change to 80gms
         driver.findElement(By.linkText("80 grams - Rs 50.00")).click();
       //  Thread.sleep(2000);
    
         //Add to cart
         driver.findElement(By.xpath("(//*[text()='Add to Cart'])[6]")).click();
        // Thread.sleep(2000);
         
         File cart1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
         try
         {
             FileUtils.copyFile(cart1, new File("C:\\training\\java\\automationtest\\ScreenShot1\\image8.png"));
         }
         catch (IOException e) {
            
             e.printStackTrace();
         }
 	    
         
         //clicking on micro cart
        driver.findElement(By.id("microCartQty")).click();
         
         File cart2 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            try
            {
                FileUtils.copyFile(cart2, new File("C:\\training\\java\\automationtest\\ScreenShot1\\image9.png"));
            }
            catch (IOException e) {
             
                e.printStackTrace();
            }
            Thread.sleep(2000);
         
         //comparing 70 g
         WebElement element1 = driver.findElement(By.xpath("(//*[@class='productName'])[1]"));
         WebElement element2 = driver.findElement(By.xpath("(//*[@class='col-sm-6 col-md-6'])[1]"));
         String strng1 = element1.getText();
         String strng2=element2.getText();
         System.out.println(strng1);
        boolean retVal1 = strng1.equals(strng2);
        System.out.println(retVal1);
        
        
       
        //comparing 80g
        WebElement element3 = driver.findElement(By.xpath("(//*[@class='productName'])[3]"));
        WebElement element4 = driver.findElement(By.xpath("(//*[@class='col-sm-6 col-md-6'])[2]"));
        String strng3 = element3.getText();
        String strng4=element4.getText();
        System.out.println(strng3);
       boolean retVal2 = strng3.equals(strng4);
       System.out.println(retVal2);
         
       //view cart
       driver.findElement(By.id("pharmaCheckOutBtn")).click();
       
       
       //to get page title
     //  System.out.println("Title: "+driver.get());
       System.out.println("Title: "+driver.getTitle());
       
       
     
	}
	

	

	
}



