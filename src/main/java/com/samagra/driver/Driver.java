package com.samagra.driver;

import com.samagra.config.factory.GlobalConfigFactory;
import com.samagra.driver.manager.web.factory.LocalDriverFactory;
import org.openqa.selenium.WebDriver;

public class Driver {

    public static void initialiseDriver() {
        WebDriver driver = LocalDriverFactory.getDriver(GlobalConfigFactory.getConfig().browser());
        driver.get("https://sambhav.online");
    }

    public static void quitDriver() {

    }
}
