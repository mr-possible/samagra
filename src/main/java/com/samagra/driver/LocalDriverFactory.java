package com.samagra.driver;

import com.samagra.config.GlobalConfigFactory;
import com.samagra.driver.manager.ChromeManager;
import com.samagra.driver.manager.FirefoxManager;
import com.samagra.enums.BrowserType;
import org.openqa.selenium.WebDriver;

public final class LocalDriverFactory {
    private static WebDriver driver;

    private LocalDriverFactory() {
    }

    public static WebDriver getDriver() {
        if (getBrowserType() == BrowserType.CHROME) {
            driver = ChromeManager.getChromeDriver();
        }
        if (getBrowserType() == BrowserType.FIREFOX) {
            driver = FirefoxManager.getFirefoxDriver();
        }
        return driver;
    }

    private static BrowserType getBrowserType() {
        return GlobalConfigFactory.getConfig().browser();
    }
}
