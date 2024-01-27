package com.samagra.driver.manager.web.factory;

import com.samagra.driver.manager.web.remote.SeleniumGridChromeManager;
import com.samagra.driver.manager.web.remote.SeleniumGridFirefoxManager;
import com.samagra.enums.BrowserType;
import org.openqa.selenium.WebDriver;

import java.util.EnumMap;
import java.util.Map;
import java.util.function.Supplier;

public final class SeleniumGridFactory {
    private SeleniumGridFactory() {
    }

    private static final Map<BrowserType, Supplier<WebDriver>> map = new EnumMap<>(BrowserType.class);

    static {
        map.put(BrowserType.CHROME, SeleniumGridChromeManager::getDriver);
        map.put(BrowserType.FIREFOX, SeleniumGridFirefoxManager::getDriver);
    }

    public static WebDriver getDriver(BrowserType browserType) {
        return map.get(browserType).get();
    }
}
