package com.browserstack.lab4;

import com.browserstack.SeleniumTest;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Lab4v2 extends SeleniumTest {
    @Test
    public void lab4v2() throws Exception {
        driver.get("https://opensource-demo.orangehrmlive.com/");

        // Check the title
        Assert.assertTrue(driver.getTitle().matches("OrangeHRM"));

        driver.get("https://demo.guru99.com/test/newtours/register.php");

        Select drpCountry = new Select(driver.findElement(By.name("country")));
        drpCountry.selectByVisibleText("ANTARCTICA");

        //Selecting Items in a Multiple SELECT elements
        driver.get("http://jsbin.com/osebed/2");
        Select fruits = new Select(driver.findElement(By.id("fruits")));
        fruits.selectByVisibleText("Banana");
        fruits.selectByIndex(1);
    }
}
