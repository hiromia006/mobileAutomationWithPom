package com.emi.calculator.screens;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;

public class HomeScreen extends BaseScreen {
    public HomeScreen(AndroidDriver driver) {
        super(driver);
    }

    public EmiCalculatorScreen tapOnEmiCalculatorBtn() {
        getWebElement(By.id("btnStart")).click();
        return getInstance(EmiCalculatorScreen.class);
    }

    public CompareLoanScreen tapOnCompareLoanBtn() {
        getWebElement(By.id("btnStart")).click();
        return getInstance(CompareLoanScreen.class);
    }
}
