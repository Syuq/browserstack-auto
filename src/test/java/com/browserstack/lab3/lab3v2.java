package com.browserstack.lab3;

import com.browserstack.SeleniumFirefox;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class lab3v2 extends SeleniumFirefox {

    @Test
    public void testNavigation() throws Exception {
        driver.get("https://demoqa.com/");

        WebElement divElement = driver.findElement(By.xpath("//*[@id='app']/div/div/div[2]/div/div[1]"));

        WebElement listItem = driver.findElement(By.xpath("//*[@id='item-0']"));

        divElement.click();
        listItem.click();

        WebElement inputField = driver.findElement(By.xpath("//*[@id='userName']"));
        inputField.sendKeys("Your Full Name");

        WebElement inputElement = driver.findElement(By.xpath("//*[@id='userEmail']"));
        inputElement.sendKeys("example@example.com");

        WebElement textarea = driver.findElement(By.xpath("//*[@id='currentAddress']"));
        textarea.sendKeys("This is my current address.");

        WebElement textareaConfirm = driver.findElement(By.xpath("//*[@id='permanentAddress']"));
        textareaConfirm.sendKeys("This is my permanent address");

        WebElement button = driver.findElement(By.xpath("//*[@id='submit']"));
        button.click();

        String inputFieldConfirm = driver.findElement(By.id("name")).getText();
        Assert.assertEquals(inputFieldConfirm, "Your Full Name");

        String inputElementConfirm = driver.findElement(By.id("email")).getText();
        Assert.assertEquals(inputElementConfirm, "example@example.com");

        String textareaTest = driver.findElement(By.id("currentAddress")).getText();
        Assert.assertEquals(textareaTest, "This is my current address");

        String textarezz = driver.findElement(By.id("permanentAddress")).getText();
        Assert.assertEquals(textarezz, "This is my permanent address");
    }
}
