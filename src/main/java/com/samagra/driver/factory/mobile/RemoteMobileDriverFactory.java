package com.samagra.driver.factory.mobile;

import com.samagra.enums.MobileOSType;
import com.samagra.enums.MobileRemotePlatform;
import org.openqa.selenium.WebDriver;

import java.util.EnumMap;
import java.util.Map;
import java.util.function.Function;

public final class RemoteMobileDriverFactory {
    private RemoteMobileDriverFactory() {
    }

    private static final Map<MobileRemotePlatform, Function<MobileOSType, WebDriver>> MAP =
            new EnumMap<>(MobileRemotePlatform.class);

    static {
        //TODO: add saucelabs later
        //MAP.put(MobileRemotePlatform.SAUCELABS, SauceLabsMobileFactory::getDriver);
        MAP.put(MobileRemotePlatform.BROWSERSTACK, BrowserstackMobileFactory::getDriver);
    }

    public static WebDriver getDriver(MobileRemotePlatform mobilePlatformType,
                                      MobileOSType osType) {
        return MAP.get(mobilePlatformType).apply(osType);
    }
}
