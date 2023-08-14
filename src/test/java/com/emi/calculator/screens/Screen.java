package com.emi.calculator.screens;

import com.emi.calculator.util.General;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.lang.reflect.InvocationTargetException;
import java.time.Duration;
import java.util.List;

public abstract class Screen {
    AndroidDriver driver;
    WebDriverWait wait;

    public Screen(AndroidDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(this.driver, Duration.ofSeconds(General.WAIT_TIME));
    }

    public abstract WebElement getWebElement(By locator);

    public abstract List<WebElement> getWebElements(By locator);

    public abstract void waitForWebElement(By locator);

    public <T extends BaseScreen> T getInstance(Class<T> tClass) {
        try {
            return tClass.getDeclaredConstructor(AndroidDriver.class).newInstance(this.driver);
        } catch (InstantiationException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (InvocationTargetException e) {
            throw new RuntimeException(e);
        } catch (NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }
}
