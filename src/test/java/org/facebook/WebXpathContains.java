package org.facebook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;


public class WebXpathContains {
	public static void main(String[] args) throws Exception{
	
	 // Specify the path to the Microsoft EdgeDriver executable
   System.setProperty("webdriver.edge.driver", "C:\\Users\\Admin\\eclipse-workspace\\org.facebook\\target\\Drive\\msedgedriver.exe");

   
   WebDriver driver = new EdgeDriver();
   //driver.get("https://www.facebook.com/");
   String s = "https://www.flipkart.com/";
   driver.navigate().to(s);

   
   //driver.findElement(By.xpath("//input[contains(@placeholder, \"Email address\")]")).sendKeys("kdhivya19@gmail.com");
   //driver.findElement(By.xpath("//a[contains(text(), 'Forgotten pass')]")).click();

   
   WebElement fashion = driver.findElement(By.xpath("//span[text()='Fashion']"));
   Actions a = new Actions(driver); 
   a.moveToElement(fashion).click().perform();

   
  

}

}
