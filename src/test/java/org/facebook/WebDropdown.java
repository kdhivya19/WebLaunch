package org.facebook;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;



public class WebDropdown {

public static void main(String[] args) throws Exception {
        
        // Specify the path to the Microsoft EdgeDriver executable
        System.setProperty("webdriver.edge.driver", "C:\\Users\\Admin\\eclipse-workspace\\org.facebook\\target\\Drive\\msedgedriver.exe");

        WebDriver driver = new EdgeDriver();
        // driver.get("https://demo.guru99.com/test/drag_drop.html");
        String s = "https://chercher.tech/practice/practice-dropdowns-selenium-webdriver";
        driver.navigate().to(s);
        driver.manage().window().maximize();
        
       

        WebElement drop = driver.findElement(By.xpath("//select[@id=\"first\"]"));
        Select s1 = new Select(drop);
        s1.selectByIndex(0);
        Thread.sleep(2000);
        s1.selectByValue("Apple");
        Thread.sleep(2000);        
        s1.selectByVisibleText("Yahoo");

       
        
        
        boolean multiple = s1.isMultiple();
        System.out.println(multiple);
        
        List<WebElement> l = s1.getOptions();
        for(int i=l.size()-1;i>=0;i--) {
        	WebElement value = l.get(i);
        	String value2 = value.getText();
        	System.out.println(value2); 

        }
        
        WebElement drop2 = driver.findElement(By.xpath("//select[@id=\"second\"]"));
        Select s2 = new Select(drop2);
        s2.selectByIndex(0);
        s2.selectByIndex(1);
        s2.selectByIndex(2);
        s2.selectByIndex(3);        
        WebElement f = s2.getFirstSelectedOption();
        System.out.println(f.getText());
        
        

        
        
        
        
}
}
