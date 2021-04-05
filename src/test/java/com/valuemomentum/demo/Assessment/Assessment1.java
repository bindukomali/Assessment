package com.valuemomentum.demo.Assessment;


	import java.io.File;
	import java.io.IOException;
	import java.util.List;
    import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
	//import org.openqa.selenium.Rectangle;
	    import org.openqa.selenium.WebDriver;
	    import org.openqa.selenium.WebElement;
	    import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
	 
	    public class Assessment1 {
	    	
	    	WebDriver driver;
	    	
	    	@BeforeTest
	 
	        public void test_beforesuite(){
	            // TODO Auto-generated method stub
	              //set the browser context
	             //set the browser context
	        	System.setProperty("webdriver.chrome.driver", "C:\\testing\\chrome_driver\\chromedriver.exe");
	            driver=  new ChromeDriver();
	            driver.manage().window().maximize();
	            driver.get("http://www.amazon.in");
	    	}
	    	
	    	@AfterTest
	    	public void test_aftersuite() {
	        driver.close();
	        
	        driver.quit();
	    	
	    	} 

	    	@Test
	    	public void verifyTask() throws IOException {
	            driver.findElement(By.xpath("//*[@class='hm-icon nav-sprite']")).click();
	           
	         
	        

		           WebElement menuItem =driver.findElement(By.xpath("//*[@class='hmenu hmenu-visible']"));
		    
		        
		          List<WebElement> value = menuItem.findElements(By.tagName("li"));
		        
		        for(WebElement item : value) {
		        	  File scrFile = item.getScreenshotAs(OutputType.FILE);
		              FileUtils.copyFile(scrFile, new File("./ScreenShot/image_"+item.getText()+".png"));
		            System.out.println("value of element"+ item.getText());
		            
		        }
		        driver.close();
		        
		        driver.quit();
		             
	        }
	        

}
