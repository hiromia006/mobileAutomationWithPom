package com.emi.calculator.tetstcases;

import com.emi.calculator.screens.CompareLoanScreen;
import com.emi.calculator.screens.HomeScreen;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CompareLoanTest extends BaseTest {
    CompareLoanScreen compareLoanScreen;

    @Test(priority = 0)
    public void compareLoansShouldSucceed() {
        HomeScreen homeScreen = screen.getInstance(HomeScreen.class);
        Assert.assertTrue(homeScreen.hasCompareLoanBtn());

        compareLoanScreen = homeScreen
                .tapOnCompareLoanBtn();

        compareLoanScreen = compareLoanScreen
                .fillLoan1Amount(500000)
                .fillInterest1(9)
                .fillMonth(12)
                .fillLoan2Amount(500000)
                .fillInterest2(10)
                .fillMonth2(12)
                .tapCalculateBtn();
        Assert.assertTrue(compareLoanScreen.hasResultLayout());

    }

    @Test(priority = 1)
    public void resetCompareLoansShouldSucceed() {
        compareLoanScreen = compareLoanScreen
                .tapResetBtn();
        Assert.assertFalse(compareLoanScreen.hasResultLayout());
    }

}
