package org.facebook;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;


import org.apache.commons.io.FileUtils;


public class WebScreenshot2 {

	public static void main(String[] args) throws Exception{
		
		 // Specify the path to the Microsoft EdgeDriver executable
	   System.setProperty("webdriver.edge.driver", "C:\\Users\\Admin\\eclipse-workspace\\org.facebook\\target\\Drive\\msedgedriver.exe");

	   
	   WebDriver driver = new EdgeDriver();
	   //driver.get("https://demo.guru99.com/test/drag_drop.html");
	   String s = "https://demo.guru99.com/test/drag_drop.html";
	   driver.navigate().to(s);
	   driver.manage().window().maximize();
	   
	   TakesScreenshot t = (TakesScreenshot)driver;
 File src = t.getScreenshotAs (OutputType.FILE);
 File des = new File("C:\\Users\\Admin\\eclipse-workspace\\org.facebook\\target\\Drive.Screenshot.png");
 FileUtils.copyFile(src, des);

	}
}
