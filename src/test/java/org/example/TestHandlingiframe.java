package org.example;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestHandlingiframe{
    WebDriver driver;

    @Test
    void testSwitchTo(){
        driver=new ChromeDriver();
        driver.get("http://127.0.0.1:5500/index.html");
        driver.switchTo().frame(0);
        driver.findElement(By.id("t2")).sendKeys("r");
        driver.switchTo().defaultContent();
        driver.findElement(By.xpath("//form/input[1]")).sendKeys("R");
//Using Id
        driver.switchTo().frame(0);
        driver.findElement(By.id("t2")).sendKeys("a");
        driver.switchTo().defaultContent();
        driver.findElement(By.xpath("//form/input[1]")).sendKeys("A");
// using name tag
        driver.switchTo().frame("frameName");
        driver.findElement(By.id("t2")).sendKeys("m");
        driver.switchTo().defaultContent();
        driver.findElement(By.xpath("//form/input[1]")).sendKeys("M");
//using i frame WebElement
        driver.switchTo().frame(driver.findElement(By.xpath("//iframe")));
        driver.findElement(By.id("t2")).sendKeys("r");
        driver.switchTo().defaultContent();
        driver.findElement(By.xpath("//form/input[1]")).sendKeys("R");
    }


}
