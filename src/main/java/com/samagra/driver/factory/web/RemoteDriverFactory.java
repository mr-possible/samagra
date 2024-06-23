package com.samagra.driver.factory.web;

import com.samagra.enums.BrowserRemotePlatform;
import com.samagra.enums.BrowserType;
import org.openqa.selenium.WebDriver;

import java.util.EnumMap;
import java.util.Map;
import java.util.function.Function;

public final class RemoteDriverFactory {
    private RemoteDriverFactory() {
    }

    private static final Map<BrowserRemotePlatform, Function<BrowserType, WebDriver>> map = new EnumMap<>(BrowserRemotePlatform.class);

    static {
        map.put(BrowserRemotePlatform.SELENIUM_GRID, SeleniumGridFactory::getDriver);
        //TODO: add browserstack later
    }

    public static WebDriver getDriver(BrowserRemotePlatform browserRemotePlatform, BrowserType browserType) {
        return map.get(browserRemotePlatform).apply(browserType);
    }
}