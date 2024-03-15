package org.facebook;

import java.io.File;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;


public class WebTags {
    public static void main(String[] args) throws Exception{
        // Specify the path to the Microsoft EdgeDriver executable
        System.setProperty("webdriver.edge.driver", "C:\\Users\\Admin\\eclipse-workspace\\org.facebook\\target\\Drive\\msedgedriver.exe");

        
        WebDriver driver = new EdgeDriver();
        //driver.get("https://www.facebook.com/");
        String s = "https://www.facebook.com/";
        driver.navigate().to(s);


        
          WebElement user = driver.findElement(By.id("email"));
          user.sendKeys("Dhivyaveer");
          user.clear();
          user.sendKeys("Dhivyaveera");
          
          String attribute = user.getAttribute("name");
          WebElement pass = driver.findElement(By.name("pass"));
          pass.sendKeys("Dhivyaveera25#");
          
          
          WebElement login = driver.findElement(By.linkText("Log in"));
          login.click();
          
          
          Thread.sleep(2000);
          
//          WebElement href = driver.findElement(By.linkText("Forgotten account"));
  //        href.click();
          driver.manage().window().minimize();          
          List<WebElement> tabs = driver.findElements(By.tagName("a"));
          for(int i=0;i<tabs.size();i++){
        	  WebElement text = tabs.get(i);
        	  String text2 = text.getText();
        	  System.out.println(text2);
        			  
          }
          
          
          
          
     
	
	
}
}
