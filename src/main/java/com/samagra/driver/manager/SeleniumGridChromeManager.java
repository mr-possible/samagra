package com.samagra.driver.manager;

import com.samagra.config.factory.GlobalConfigFactory;
import com.samagra.enums.BrowserType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public final class SeleniumGridChromeManager {

    private SeleniumGridChromeManager() {
    }

    public static WebDriver getDriver() {
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setBrowserName(BrowserType.CHROME.name());
        return new RemoteWebDriver(GlobalConfigFactory.getConfig().seleniumGridURL(), caps);
    }
}
