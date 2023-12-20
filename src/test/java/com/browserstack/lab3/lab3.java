package com.browserstack.lab3;

import com.browserstack.SeleniumTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class lab3 extends SeleniumTest {
    @Test
    public void login() {
//        driver.get("https://opensource-demo.orangehrmlive.com/");
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

        WebElement usernameInput = driver.findElement(By.cssSelector("input.oxd-input.oxd-input--active[name='username']"));
        WebElement passwordInput = driver.findElement(By.cssSelector("input.oxd-input.oxd-input--active[name='password']"));

        WebElement parentElement = driver.findElement(By.id("parentElementId"));
        WebElement button = parentElement.findElement(By.className("orangehrm-login-button"));

        // Enter the username and password
        usernameInput.sendKeys("Admin");
        passwordInput.sendKeys("admin123");

        // Click the login button
        button.click();

        // Wait for a while to see the logged-in dashboard (you might need to adjust the sleep duration)
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        String actualUrl = "https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index";
        String expectedUrl = driver.getCurrentUrl();
        Assert.assertEquals(expectedUrl, actualUrl);
    }
}
