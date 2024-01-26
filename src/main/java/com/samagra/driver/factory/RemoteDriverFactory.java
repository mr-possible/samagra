package com.samagra.driver.factory;

import com.samagra.enums.BrowserRemotePlatform;
import com.samagra.enums.BrowserType;
import org.openqa.selenium.WebDriver;

public final class RemoteDriverFactory {
    private RemoteDriverFactory() {
    }

    public static WebDriver getDriver(BrowserRemotePlatform browserRemotePlatform, BrowserType browserType) {
        if (browserRemotePlatform == BrowserRemotePlatform.SELENIUM_GRID) {
            SeleniumGridFactory.getDriver(browserType);
        }

        if (browserRemotePlatform == BrowserRemotePlatform.BROWSERSTACK) {
            //TODO - kept for later.
        }

        return null;
    }

}
