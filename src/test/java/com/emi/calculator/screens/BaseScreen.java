package com.emi.calculator.screens;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

public class BaseScreen extends Screen {
    public BaseScreen(AndroidDriver driver) {
        super(driver);
    }

    @Override
    public WebElement getWebElement(By locator) {
        WebElement webElement = null;
        try {
            waitForWebElement(locator);
            webElement = driver.findElement(locator);

        } catch (Exception exception) {
            System.out.println(locator.toString() + " No found");
        }
        return webElement;
    }

    @Override
    public List<WebElement> getWebElements(By locator) {
        List<WebElement> webElements = null;
        try {
            waitForWebElement(locator);
            webElements = driver.findElements(locator);

        } catch (Exception exception) {
            System.out.println(locator.toString() + " No found");
        }
        return webElements;
    }

    @Override
    public void waitForWebElement(By locator) {
        try {
            wait.until(ExpectedConditions.presenceOfElementLocated(locator));
        } catch (Exception exception) {
            System.out.println(locator.toString() + " Not Loading");
        }
    }
}
