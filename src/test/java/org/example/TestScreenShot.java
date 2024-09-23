package org.example;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import java.io.File;
import java.io.IOException;


public class TestScreenShot {

    WebDriver driver;
    @Test
    void takeScreenShot() throws IOException {
        driver =new ChromeDriver();
        driver.get("https://www.allbirds.com/");
        TakesScreenshot image=(TakesScreenshot) driver;
       File img= image.getScreenshotAs(OutputType.FILE);
        File loaction=new File("D:\\Automation\\basicSelenium\\screenshot\\"+"signuperror.png");
        FileHandler.copy(img,loaction);




    }
}
