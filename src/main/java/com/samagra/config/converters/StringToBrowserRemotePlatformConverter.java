package com.samagra.config.converters;

import com.samagra.enums.BrowserRemotePlatform;
import org.aeonbits.owner.Converter;

import java.lang.reflect.Method;
import java.util.Map;

public class StringToBrowserRemotePlatformConverter implements Converter<BrowserRemotePlatform> {
    @Override
    public BrowserRemotePlatform convert(Method method, String browserRemotePlatform) {
        Map<String, BrowserRemotePlatform> values = Map.of(
                "selenium-grid", BrowserRemotePlatform.SELENIUM_GRID,
                "browserstack", BrowserRemotePlatform.BROWSERSTACK
        );

        /**
         * If the user mistakenly passes any un-supported platform,
         * then run tests on selenium-grid as default (to ensure not to halt the process)
         */
        return values.getOrDefault(browserRemotePlatform, BrowserRemotePlatform.SELENIUM_GRID);
    }
}
