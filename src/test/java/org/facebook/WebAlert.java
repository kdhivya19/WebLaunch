package org.facebook;

import org.checkerframework.checker.units.qual.A;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class WebAlert {
    
    public static void main(String[] args) throws Exception {
        
        // Specify the path to the Microsoft EdgeDriver executable
        System.setProperty("webdriver.edge.driver", "C:\\Users\\Admin\\eclipse-workspace\\org.facebook\\target\\Drive\\msedgedriver.exe");

        WebDriver driver = new EdgeDriver();
        // driver.get("https://demo.guru99.com/test/drag_drop.html");
        String s = "https://demo.automationtesting.in/Alerts.html";
        driver.navigate().to(s);
        driver.manage().window().maximize();

        driver.findElement(By.xpath("//button[@class='btn btn-danger']")).click();

        Alert alert = driver.switchTo().alert();
        alert.accept();

        driver.findElement(By.xpath("(//a[@class=\"analystic\"])[2]")).click();
        driver.findElement(By.xpath("//button[@onclick=\"confirmbox()\"]")).click();
        Thread.sleep(2000);
        alert.dismiss();
        
        driver.findElement(By.xpath("(//a[@class=\"analystic\"])[3]")).click();
        driver.findElement(By.xpath("//button[@onclick=\"promptbox()\"]")).click();
        Thread.sleep(2000);
        String text = alert.getText();
        System.out.println(text);
        alert.sendKeys("Task completed");
        alert.accept();

    }
}
