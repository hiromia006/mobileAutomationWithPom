package com.emi.calculator.screens;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;

public class EmiCalculatorScreen extends BaseScreen {
    public EmiCalculatorScreen(AndroidDriver driver) {
        super(driver);
    }

    public EmiCalculatorScreen fillAmount(int amount) {
        getWebElement(By.id("etLoanAmount")).sendKeys(String.valueOf(amount));
        return this;
    }

    public EmiCalculatorScreen fillInterestRate(int interestRate) {
        getWebElement(By.id("etInterest")).sendKeys(String.valueOf(interestRate));
        return this;
    }

    public EmiCalculatorScreen fillYear(int yearNumber) {
        getWebElement(By.id("etYears")).sendKeys(String.valueOf(yearNumber));
        return this;
    }

    public EmiCalculatorScreen fillMonth(int monthNumber) {
        getWebElement(By.id("etMonths")).sendKeys(String.valueOf(monthNumber));
        return this;
    }

    public EmiCalculatorScreen fillProcessFee(int fee) {
        getWebElement(By.id("etFee")).sendKeys(String.valueOf(fee));
        return this;
    }

    public EmiCalculatorScreen tapOnCalculateBtn() {
        getWebElement(By.id("btnCalculate")).click();
        return this;
    }

    public EmiCalculatorScreen tapOnResetBtn() {
        getWebElement(By.id("btnReset")).click();
        return this;
    }

    public EmiDetailScreen tapOnDetailBtn() {
        getWebElement(By.id("btnDetail")).click();
        return getInstance(EmiDetailScreen.class);
    }
}
