package com.emi.calculator.tetstcases;

import com.emi.calculator.screens.EmiCalculatorScreen;
import com.emi.calculator.screens.EmiDetailScreen;
import com.emi.calculator.screens.HomeScreen;
import com.emi.calculator.util.General;
import org.testng.Assert;
import org.testng.annotations.Test;

public class EmiCalculatorTest extends BaseTest {
    EmiCalculatorScreen emiCalculatorScreen;
    EmiDetailScreen detailScreen;
    private int amount = 100000;

    @Test(priority = 0)
    public void calculateEmiShouldSucceed() {
        emiCalculatorScreen = screen.getInstance(HomeScreen.class)
                .tapOnEmiCalculatorBtn();

        emiCalculatorScreen = emiCalculatorScreen
                .fillAmount(500000)
                .fillInterestRate(8)
                .fillYear(2)
                .fillMonth(6)
                .fillProcessFee(2)
                .tapOnCalculateBtn();
        Assert.assertTrue(emiCalculatorScreen.hasDetailBtn());
    }

    @Test(priority = 1)
    public void resetShouldSucceed() {
        emiCalculatorScreen = emiCalculatorScreen
                .fillAmount(100000)
                .fillInterestRate(7)
                .fillYear(2)
                .fillMonth(6)
                .fillProcessFee(3)
                .tapOnResetBtn();
    }

    @Test(priority = 2)
    public void checkDetailShouldSucceed() {
        emiCalculatorScreen = emiCalculatorScreen
                .fillAmount(amount)
                .fillInterestRate(7)
                .fillYear(2)
                .fillMonth(6)
                .fillProcessFee(3)
                .tapOnCalculateBtn();
        Assert.assertTrue(emiCalculatorScreen.hasDetailBtn());

        detailScreen = emiCalculatorScreen
                .tapOnDetailBtn();
        Assert.assertTrue(detailScreen.hasDetailLayout());
    }

    @Test(priority = 3)
    public void checkDetailScreenAmountShouldSucceed() {
        Assert.assertEquals(amount, detailScreen.getLoanAmount());
    }

    @Test(priority = 4)
    public void clickBackBtnShouldSucceed() {
        emiCalculatorScreen = detailScreen
                .clickBackBtn();
        Assert.assertTrue(emiCalculatorScreen.hasDetailBtn());
    }


}
