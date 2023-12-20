package com.browserstack.lab4;

import com.browserstack.SeleniumTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Lab4v2 extends SeleniumTest {
    @Test
    public void lab4v2() throws Exception {
        driver.get("https://opensource-demo.orangehrmlive.com/");

        // Check the title
        Assert.assertTrue(driver.getTitle().matches("OrangeHRM"));
    }
}
