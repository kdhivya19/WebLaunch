package org.facebook;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class WebWindowHandle {
	
public static void main(String[] args) throws Exception {
        
        // Specify the path to the Microsoft EdgeDriver executable
        System.setProperty("webdriver.edge.driver", "C:\\Users\\Admin\\eclipse-workspace\\org.facebook\\target\\Drive\\msedgedriver.exe");

        WebDriver driver = new EdgeDriver();
        // driver.get("https://demo.guru99.com/test/drag_drop.html");
        String s = "https://www.flipkart.com/";
        driver.navigate().to(s);
        driver.manage().window().maximize();

        driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Vivo", Keys.ENTER);
        driver.findElement(By.xpath("(//div[@class=\"_4rR01T\"])[1]")).click();
	
        String parent = driver.getWindowHandle();

        Set<String> parent1 = driver.getWindowHandles();
        for (String x:parent1) {
        	if(!parent.equals(x) ) {
        		driver.switchTo().window(x);
        		String text = driver.findElement(By.xpath("//span[text()='vivo T2x 5G (Marine Blue, 128 GB)']")).getText();
        		System.out.println(text);
        		
        	}
        }
        
        
}}
