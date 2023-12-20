package com.browserstack.lab2;


import com.browserstack.SeleniumTest;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
public class lab2 extends SeleniumTest {
    @Test
    public void testLab2(String[] args) throws Throwable {
        driver.navigate().to("https://opensource-demo.orangehrmlive.com/");
    }
}
