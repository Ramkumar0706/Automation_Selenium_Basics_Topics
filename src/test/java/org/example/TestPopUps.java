package org.example;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestPopUps {

    @Test
    void popUp() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
//alerts
        driver.findElement(By.id("name")).sendKeys("Nitish");
        driver.findElement(By.id("alertbtn")).click();
        Thread.sleep(2000);
        driver.switchTo().alert().accept();
// confirm pop up
        driver.findElement(By.id("name")).sendKeys("Nitish");
        driver.findElement(By.id("confirmbtn")).click();
        Thread.sleep(2000);
        driver.switchTo().alert().dismiss();
    }
}
