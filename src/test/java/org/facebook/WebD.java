package org.facebook;

import java.io.File;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class WebD {
    public static void main(String[] args) throws Exception{
        // Specify the path to the Microsoft EdgeDriver executable
        System.setProperty("webdriver.edge.driver", "C:\\Users\\Admin\\eclipse-workspace\\org.facebook\\target\\Drive\\msedgedriver.exe");

        
        WebDriver driver = new EdgeDriver();
        //driver.get("https://www.facebook.com/");
        String s = "https://www.flipkart.com/";
        driver.navigate().to(s);
        driver.manage().window().minimize();
        driver.manage().window().maximize();
        driver.navigate().back();
        Thread.sleep(2000);
        driver.navigate().forward();
        driver.navigate().refresh();
                		
        //driver.manage().window().maximize();
		//driver.switchTo().newWindow(org.openqa.selenium.WindowType.TAB);
		
		
		String CurrentUrl = driver.getCurrentUrl();
		System.out.println(CurrentUrl);
		                        -   
		if (s.equals(CurrentUrl)) {
			System.out.println("Url Match");
			}
		else
		{
			System.err.println("Not match");
			}
		
		String pageSource = driver.getPageSource();
		System.out.println(pageSource);
		driver.getPageSource();
		
		driver.close();
		driver.quit();

		
		
		
            }
}
