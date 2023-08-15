package com.emi.calculator.screens;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;

public class HomeScreen extends BaseScreen {
    private By btnStart = By.id("btnStart");
    private By btnCompare = By.id("btnCompare");

    public HomeScreen(AndroidDriver driver) {
        super(driver);
    }

    public EmiCalculatorScreen tapOnEmiCalculatorBtn() {
        getWebElement(btnStart).click();
        return getInstance(EmiCalculatorScreen.class);
    }

    public CompareLoanScreen tapOnCompareLoanBtn() {
        getWebElement(btnCompare).click();
        return getInstance(CompareLoanScreen.class);
    }

    public boolean hasEmiCalculatorBtn() {
        return getWebElements(btnStart).size() > 0;
    }

    public boolean hasCompareLoanBtn() {
        return getWebElements(btnCompare).size() > 0;
    }
}
