package com.emi.calculator.screens;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;

public class EmiDetailScreen extends BaseScreen {
    public EmiDetailScreen(AndroidDriver driver) {
        super(driver);
    }

    public boolean hasDetailLayout() {
        return getWebElements(By.id("layoutToolbar")).size() > 0;
    }

    public int getLoanAmount() {
        String amount = getWebElement(By.id("loan_amount_result")).getText().trim().replaceAll(",", "");
        return Integer.parseInt(amount.trim());
    }

    public EmiCalculatorScreen clickBackBtn() {
        getWebElement(By.id("actionMenuBack")).click();
        return getInstance(EmiCalculatorScreen.class);
    }
}
