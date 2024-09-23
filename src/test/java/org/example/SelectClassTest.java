package org.example;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectClassTest {

        @Test
        void selectClassMethod() throws InterruptedException {

            WebDriver driver = new ChromeDriver();
            driver.get("D:\\Automation\\basicSelenium\\src\\test\\java\\index.html");
            driver.manage().window().maximize();

            // Locate the select element
            WebElement selectElement = driver.findElement(By.id("fruits"));
            Select select = new Select(selectElement);

            select.selectByIndex(1);
            Thread.sleep(1000);

            select.selectByValue("orange");
            Thread.sleep(1000);

            select.selectByVisibleText("Grape");
            Thread.sleep(1000);

            WebElement firstSelected = select.getFirstSelectedOption();
            System.out.println("First selected option: " + firstSelected.getText());


             select.getAllSelectedOptions();
            // 6. Get all options
            for (WebElement option : select.getOptions()) {
                System.out.println("Available option: " + option.getText());
            }

             select.deselectByIndex(1);
             select.deselectByValue("orange");
             select.deselectByVisibleText("Grape");
             select.deselectAll();

            driver.quit();
        }
    }

}
