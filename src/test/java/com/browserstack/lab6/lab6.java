package com.browserstack.lab6;

import com.browserstack.SeleniumTest;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class lab6 extends SeleniumTest {
    @Test
    public void test() throws Exception {
        driver.get("http://demo.seleniumeasy.com/javascript-alert-box-demo.html");

        driver.findElement(By.xpath("//*[@id='easycont']/div/div[2]/div[1]/div[2]/button")).submit();

        // Switching to Alert
        Alert alert = driver.switchTo().alert();

        // Capturing alert message.
        String alertMessage = driver.switchTo().alert().getText();

        // Displaying alert message
        System.out.println(alertMessage);
        Thread.sleep(5000);

        // Accepting alert
        alert.accept();
    }
}
