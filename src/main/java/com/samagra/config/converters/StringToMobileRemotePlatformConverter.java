package com.samagra.config.converters;

import com.samagra.enums.MobileRemotePlatform;
import org.aeonbits.owner.Converter;

import java.lang.reflect.Method;

public class StringToMobileRemotePlatformConverter implements Converter<MobileRemotePlatform> {

    @Override
    public MobileRemotePlatform convert(Method method, String s) {
        return MobileRemotePlatform.valueOf(s.toUpperCase());
    }
}
