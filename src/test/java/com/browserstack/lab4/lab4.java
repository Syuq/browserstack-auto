package com.browserstack.lab4;

import com.browserstack.SeleniumTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.List;

public class lab4 extends SeleniumTest {
    @BeforeTest
    public void setup() {
        driver.get("http://demo.guru99.com/test/ajax.html");
    }

    @Test
    public void clickYesRadioButton() {
        WebElement yesRadioButton = driver.findElement(By.id("yes"));
        yesRadioButton.click();

        List<WebElement> elements = driver.findElements(By.name("name"));
        System.out.println("Number of elements:" + elements.size());

        for (WebElement element : elements) {
            System.out.println("Radio button text: " + element.getAttribute("value"));
        }
    }

    @AfterTest
    public void teardown() {
        driver.quit();
    }
}
