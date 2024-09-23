package org.example;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestJavaScriptExecuter {
    WebDriver driver ;
@Test
    void disabledField(){
    driver =new ChromeDriver();
    driver.get("http://127.0.0.1:5500/index.html");
    WebElement element = driver.findElement(By.xpath("//form/input[2]"));
    JavascriptExecutor js=(JavascriptExecutor) driver;
    js.executeScript("document.getElementById('t1').value='Ramkumar'");
}

@Test
    void scrollupAndDown() throws InterruptedException {
        driver=new ChromeDriver();
        driver.get("https://www.allbirds.com/");
        driver.manage().window().maximize();
        Thread.sleep(2000);
        JavascriptExecutor js=(JavascriptExecutor)driver;
    for (int i = 1; i < 10; i++) {
//scroll down on the webpage
        js.executeScript("window.scrollBy(0, 1000)");
        Thread.sleep(3000);
    }
    for (int i = 1; i < 10; i++) {
//scroll up on the webpage
        js.executeScript("window.scrollBy(0, -1000)");
        Thread.sleep(3000);
    }
    }
}
