package com.samagra.config.converters;

import com.samagra.enums.BrowserRunMode;
import org.aeonbits.owner.Converter;

import java.lang.reflect.Method;
import java.util.Map;

public class StringToBrowserRunModeConverter implements Converter<BrowserRunMode> {

    @Override
    public BrowserRunMode convert(Method method, String browserRunMode) {
        Map<String, BrowserRunMode> values = Map.of("local", BrowserRunMode.LOCAL, "remote", BrowserRunMode.REMOTE
        );

        /**
         * If the user mistakenly passes any un-supported mode,
         * then run tests on local as default (to ensure not to halt the process)
         */
        return values.getOrDefault(browserRunMode, BrowserRunMode.LOCAL);
    }
}
