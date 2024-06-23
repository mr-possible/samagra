package com.samagra.driver.factory.mobile;

import com.samagra.driver.manager.mobile.remote.BrowserstackAndroidManager;
import com.samagra.driver.manager.mobile.remote.BrowserstackIosManager;
import com.samagra.enums.MobileOSType;
import org.openqa.selenium.WebDriver;

import java.util.EnumMap;
import java.util.Map;
import java.util.function.Supplier;

public final class BrowserstackMobileFactory {
    private BrowserstackMobileFactory() {
    }

    private static final Map<MobileOSType, Supplier<WebDriver>> MAP =
            new EnumMap<>(MobileOSType.class);

    static {
        MAP.put(MobileOSType.ANDROID, BrowserstackAndroidManager::getDriver);
        MAP.put(MobileOSType.IOS, BrowserstackIosManager::getDriver);
    }

    public static WebDriver getDriver(MobileOSType osType) {
        return MAP.get(osType).get();
    }
}
