package com.samagra.driver;

import org.openqa.selenium.WebDriver;

public class Driver {


    public static void initialiseDriver() {
        WebDriver driver = LocalDriverFactory.getDriver();
        driver.get("https://sambhav.online");
    }

    public static void quitDriver() {

    }
}
