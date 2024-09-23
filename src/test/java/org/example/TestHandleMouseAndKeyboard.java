package org.example;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.awt.*;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

public class TestHandleMouseAndKeyboard {

WebDriver driver;
    @Test
    void mouseEvent() throws AWTException, InterruptedException {
        driver=new ChromeDriver();
        driver.get("https://www.facebook.com");
        driver.manage().window().maximize();
        Robot r;
        r = new Robot();
        r.mouseMove(900,380);
        r.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        Thread.sleep(200);
        r.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);

        Thread.sleep(3000);
       // driver.quit();
    }
    @Test
    void keyboardEvent() throws InterruptedException, AWTException {
        driver=new ChromeDriver();
        driver.get("https://www.facebook.com");
        driver.manage().window().maximize();
        Robot r;
        r = new Robot();
        r.mouseMove(900,380);
        r.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        Thread.sleep(200);
        r.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
        r.keyPress(KeyEvent.VK_R);
        r.keyRelease(KeyEvent.VK_R);

        r.keyPress(KeyEvent.VK_A);
        r.keyRelease(KeyEvent.VK_A);

        r.keyPress(KeyEvent.VK_M);
        r.keyRelease(KeyEvent.VK_M);

        r.keyPress(KeyEvent.VK_SHIFT);
        r.keyPress(KeyEvent.VK_2);
        r.keyRelease(KeyEvent.VK_2);
        r.keyRelease(KeyEvent.VK_SHIFT);

        r.keyPress(KeyEvent.VK_2);
        r.keyRelease(KeyEvent.VK_2);

        r.keyPress(KeyEvent.VK_0);
        r.keyRelease(KeyEvent.VK_0);

        r.keyPress(KeyEvent.VK_0);
        r.keyRelease(KeyEvent.VK_0);

        r.keyPress(KeyEvent.VK_0);
        r.keyRelease(KeyEvent.VK_0);

        r.mouseMove(1000,460);
        r.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        Thread.sleep(200);
        r.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);

        Thread.sleep(2000);
        driver.navigate().back();

    }
}
