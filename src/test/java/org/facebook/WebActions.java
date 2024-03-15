package org.facebook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import java.awt.*;
import java.awt.event.KeyEvent;

public class WebActions {

		
		public static void main(String[] args) throws Exception{
			
			 // Specify the path to the Microsoft EdgeDriver executable
		   System.setProperty("webdriver.edge.driver", "C:\\Users\\Admin\\eclipse-workspace\\org.facebook\\target\\Drive\\msedgedriver.exe");
		   
		   WebDriver driver = new EdgeDriver();
		   //driver.get("https://www.facebook.com/");
		   String s = "https://www.facebook.com/";
		   driver.navigate().to(s);
	   
		   WebElement user = driver.findElement(By.id("email"));
		   Actions a = new Actions(driver);
		   a.sendKeys(user, "kdhivya19@gmail.com").build().perform();
		   a.doubleClick().build().perform();
		   a.contextClick().build().perform();
		   
		   Robot r = new Robot();	       
	       
		   r.keyPress(KeyEvent.VK_CONTROL);
		   r.keyPress(KeyEvent.VK_A);
		   
		   r.keyRelease(KeyEvent.VK_CONTROL);
		   r.keyRelease(KeyEvent.VK_A);
		   
		   r.keyPress(KeyEvent.VK_DOWN);
		   r.keyRelease(KeyEvent.VK_DOWN);
	       
		   
		   r.keyPress(KeyEvent.VK_CONTROL);
		   r.keyPress(KeyEvent.VK_C);
		   
		   r.keyRelease(KeyEvent.VK_CONTROL);
		   r.keyRelease(KeyEvent.VK_C);


		   r.keyPress(KeyEvent.VK_DOWN);
		   r.keyRelease(KeyEvent.VK_DOWN);
	       
		   r.keyPress(KeyEvent.VK_DOWN);
		   r.keyRelease(KeyEvent.VK_DOWN);
		   		   
		   r.keyPress(KeyEvent.VK_ENTER);
		   r.keyRelease(KeyEvent.VK_ENTER);
		   
		   r.keyPress(KeyEvent.VK_TAB);
		   r.keyRelease(KeyEvent.VK_TAB);
		   
		   
		   r.keyPress(KeyEvent.VK_CONTROL);
		   r.keyPress(KeyEvent.VK_V);
		   
		   r.keyRelease(KeyEvent.VK_CONTROL);
		   r.keyRelease(KeyEvent.VK_V);
	       
	    
		      
	       
	       
		
		   //WebElement fashion = driver.findElement(By.xpath("//span[text()='Fashion']"));
		   //Actions a = new Actions(driver); 
		   //a.moveToElement(fashion).click().perform();
			
	

	   
	   	
	}
}
