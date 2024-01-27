package com.samagra.driver.manager.mobile.factory;

import com.samagra.driver.manager.mobile.local.AndroidManager;
import com.samagra.driver.manager.mobile.local.IosManager;
import com.samagra.enums.MobileOSType;
import org.openqa.selenium.WebDriver;

import java.util.EnumMap;
import java.util.Map;
import java.util.function.Supplier;

public final class LocalMobileDriverFactory {
    private LocalMobileDriverFactory() {
    }

    private static final Map<MobileOSType, Supplier<WebDriver>> MAP =
            new EnumMap<>(MobileOSType.class);

    static {
        MAP.put(MobileOSType.ANDROID, AndroidManager::getAndroidDriver);
        MAP.put(MobileOSType.IOS, IosManager::getIOSDriver);
    }

    public static WebDriver getDriver(MobileOSType osType) {
        return MAP.get(osType).get();
    }
}
