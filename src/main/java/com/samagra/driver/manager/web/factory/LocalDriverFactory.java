package com.samagra.driver.manager.web.factory;

import com.samagra.driver.manager.web.local.ChromeManager;
import com.samagra.driver.manager.web.local.FirefoxManager;
import com.samagra.enums.BrowserType;
import org.openqa.selenium.WebDriver;

import java.util.EnumMap;
import java.util.Map;
import java.util.function.Supplier;

public final class LocalDriverFactory {

    private LocalDriverFactory() {
    }

    private static final Map<BrowserType, Supplier<WebDriver>> map = new EnumMap<>(BrowserType.class);

    static {
        map.put(BrowserType.CHROME, ChromeManager::getChromeDriver);
        map.put(BrowserType.FIREFOX, FirefoxManager::getFirefoxDriver);
    }

    public static WebDriver getDriver(BrowserType browserType) {
        return map.get(browserType).get();
    }
}
