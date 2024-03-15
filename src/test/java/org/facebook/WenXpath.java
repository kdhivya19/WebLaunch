package org.facebook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class WenXpath {
	public static void main(String[] args) throws Exception{
	
	 // Specify the path to the Microsoft EdgeDriver executable
    System.setProperty("webdriver.edge.driver", "C:\\Users\\Admin\\eclipse-workspace\\org.facebook\\target\\Drive\\msedgedriver.exe");

    
    WebDriver driver = new EdgeDriver();
    //driver.get("https://www.facebook.com/");
    String s = "https://www.facebook.com/";
    driver.navigate().to(s);
    driver.manage().window().minimize();
    driver.manage().window().maximize();

    
    driver.findElement(By.xpath("//input[@type='text']")).sendKeys("kdhivya19@gmail.com");
    driver.findElement(By.xpath("//a[text()='Forgotten password?']")).click();
    
    
    

}}
