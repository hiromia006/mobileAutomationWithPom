package com.emi.calculator.tetstcases;

import com.emi.calculator.screens.HomeScreen;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HomeTest extends BaseTest {

    @Test
    public void checkEmiCalculatorBtnShouldSucceed() {
        HomeScreen homeScreen = screen.getInstance(HomeScreen.class);
        Assert.assertTrue(homeScreen.hasEmiCalculateBtn());
    }

    @Test
    public void checkCompareLoanBtnShouldSucceed() {
        HomeScreen homeScreen = screen.getInstance(HomeScreen.class);
        Assert.assertTrue(homeScreen.hasCompareLoanBtn());
    }
}
