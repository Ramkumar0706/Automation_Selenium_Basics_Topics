package org.example;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestWebElementinterface {
    WebDriver driver;

    @Test
    void webElementMethod(){
        driver=new ChromeDriver();
        driver.get("https://www.facebook.com");
        WebElement element = driver.findElement(By.xpath("//button[@name=\"login\"]"));
        Point location = element.getLocation();
        int x = location.getX();
        System.out.println(x);
        System.out.println(location.getY());

        Dimension size = element.getSize();
        System.out.println(size.getHeight());
        System.out.println(size.getWidth());

        System.out.println(element.isDisplayed());

        System.out.println(element.isEnabled());

        System.out.println(element.isSelected());

        System.out.println(element.getAttribute("name"));

        System.out.println(element.getText());
        System.out.println(element.getTagName());
        System.out.println();

        driver.quit();
    }
}
