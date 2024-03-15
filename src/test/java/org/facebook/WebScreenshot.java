package org.facebook;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;



public class WebScreenshot {
	
	public static void main(String[] args) throws Exception{
		
		 // Specify the path to the Microsoft EdgeDriver executable
	   System.setProperty("webdriver.edge.driver", "C:\\Users\\Admin\\eclipse-workspace\\org.facebook\\target\\Drive\\msedgedriver.exe");

	   
	   WebDriver driver = new EdgeDriver();
	   //driver.get("https://demo.guru99.com/test/drag_drop.html");
	   String s = "https://demo.guru99.com/test/drag_drop.html";
	   driver.navigate().to(s);
	   
	   
	 WebElement draga = driver.findElement(By.xpath("(//a[@class=\"button button-orange\"])[5]"));
	 WebElement dropb = driver.findElement(By.xpath("(//li[@class=\"placeholder\"])[1]"));
	 Actions a = new Actions(driver);
	 
	 a.dragAndDrop(draga, dropb).build().perform();

	 WebElement dragc = driver.findElement(By.xpath("(//a[@class=\"button button-orange\"])[2]"));
	 WebElement dropd = driver.findElement(By.xpath("(//li[@class=\"placeholder\"])[1]"));
	 Actions b = new Actions(driver);
	 
	 b.dragAndDrop(dragc, dropd).build().perform();
	 
	 WebElement drage = driver.findElement(By.xpath("(//a[@class=\"button button-orange\"])[8]"));
	 WebElement dropf = driver.findElement(By.xpath("(//li[@class=\"placeholder\"])[1]"));
	 Actions c = new Actions(driver);
	 
	 c.dragAndDrop(drage, dropf).build().perform();

	 WebElement dragg = driver.findElement(By.xpath("(//a[@class=\"button button-orange\"])[5]"));
	 WebElement droph = driver.findElement(By.xpath("(//li[@class=\"placeholder\"])[1]"));
	 Actions d = new Actions(driver);
	 
	 d.dragAndDrop(dragg, droph).build().perform();

//	 TakeScreenshot ts = (TakeScreenshot)driver;
	// File src ==ts.getScreenshotAS (OutputType.FILE);
	 //File des = new File("C:\Users\Admin\eclipse-workspace\org.facebook\target.Dhivya.png");
	 //File Utils.copyFile
	 

  
	   //WebElement user = driver.findElement(By.id("email"));
	   //Actions a = new Actions(driver);
	   //a.sendKeys(user, "kdhivya19@gmail.com").build().perform();
	   //a.doubleClick().build().perform();
	   //a.contextClick().build().perform();
	   
	   //TakeScreenshot ts = (TakeScreenshot)driver;
	   //File src ==ts.getScreenshotAS(OutputType.FILE);
	   //C:\Users\Admin\eclipse-workspace\org.facebook\target
	   
	   
	   
	}

}
