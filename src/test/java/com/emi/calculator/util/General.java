package com.emi.calculator.util;

public class General {
    final static public int WAIT_TIME = 30;

    public static void waitForDomStable() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
