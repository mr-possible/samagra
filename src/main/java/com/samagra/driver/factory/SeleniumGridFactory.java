package com.samagra.driver.factory;

import com.samagra.driver.manager.SeleniumGridChromeManager;
import com.samagra.driver.manager.SeleniumGridFirefoxManager;
import com.samagra.enums.BrowserType;
import org.openqa.selenium.WebDriver;

public final class SeleniumGridFactory {
    private SeleniumGridFactory() {
    }

    public static WebDriver getDriver(BrowserType browserType) {
        return
                browserType == BrowserType.CHROME
                        ? SeleniumGridChromeManager.getDriver() : SeleniumGridFirefoxManager.getDriver();
    }
}
