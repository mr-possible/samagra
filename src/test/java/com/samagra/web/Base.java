package com.samagra.web;

import com.samagra.driver.Driver;
import org.testng.annotations.BeforeTest;

public class Base {
    @BeforeTest
    public void setup() {
        Driver.initialiseDriverForWeb();
    }

    @BeforeTest
    public void trash() {
        Driver.quitDriver();
    }
}
