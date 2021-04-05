package com.valuemomentum.demo.Assessment2;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

 

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

 

public class WebDriverHelper extends BaseTest {
    
    
    
    public static void captureScreenshot(String methodName)
    {
        File scrFile = ((TakesScreenshot)getDriver()).getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(scrFile, new File("C:\\training\\java\\automationtest\\ScreenShot\\"+methodName+".png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        
    }
    
    public static void switchToWindow()
    {
     String currentWindow =  driver.getWindowHandle();
     Set<String> windows = driver.getWindowHandles();
     Iterator<String> ite = windows.iterator();
     while(ite.hasNext()) {
         String newWindow=ite.next();
         if(!currentWindow.equals(newWindow)) {
             getDriver().switchTo().window(newWindow);
         }
     }
    }

 

}