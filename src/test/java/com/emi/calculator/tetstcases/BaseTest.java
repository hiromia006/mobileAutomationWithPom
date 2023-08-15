package com.emi.calculator.tetstcases;

import com.emi.calculator.screens.BaseScreen;
import com.emi.calculator.screens.Screen;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeClass;

import java.net.MalformedURLException;
import java.net.URL;

public class BaseTest {
    AndroidDriver driver;
    Screen screen;

    @BeforeClass
    public void setUpAndroid() {
        try {
            DesiredCapabilities capabilities = new DesiredCapabilities();
            capabilities.setCapability("udid", "192.168.56.101:5555");
            capabilities.setCapability("platformVersion", "12");
            capabilities.setCapability("platformName", "Android");
            capabilities.setCapability("appPackage", "com.continuum.emi.calculator");
            capabilities.setCapability("appActivity", "com.finance.emicalci.activity.Splash_screnn");

            driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);

            screen = new BaseScreen(driver);
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
    }

    public AndroidDriver getDriver() {
        return driver;
    }


}
