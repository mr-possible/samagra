package com.samagra.driver.factory;

import com.samagra.config.factory.GlobalConfigFactory;
import com.samagra.driver.manager.ChromeManager;
import com.samagra.driver.manager.FirefoxManager;
import com.samagra.enums.BrowserType;
import org.openqa.selenium.WebDriver;

public final class LocalDriverFactory {
    private static WebDriver driver;

    private LocalDriverFactory() {
    }

    public static WebDriver getDriver(BrowserType browserType) {
        return isChrome(browserType) ? ChromeManager.getChromeDriver() : FirefoxManager.getFirefoxDriver();
    }

    private static boolean isChrome(BrowserType browserType) {
        return GlobalConfigFactory.getConfig().browser() == BrowserType.CHROME;
    }
}
