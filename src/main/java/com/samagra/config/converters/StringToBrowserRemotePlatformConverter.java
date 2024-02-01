package com.samagra.config.converters;

import com.samagra.enums.BrowserRemotePlatform;
import org.aeonbits.owner.Converter;

import java.lang.reflect.Method;

public class StringToBrowserRemotePlatformConverter implements Converter<BrowserRemotePlatform> {
    @Override
    public BrowserRemotePlatform convert(Method method, String browserRemotePlatform) {
        return BrowserRemotePlatform.valueOf(browserRemotePlatform.toUpperCase());
    }
}
