package com.samagra.config.converters;

import com.samagra.enums.MobileOSType;
import org.aeonbits.owner.Converter;

import java.lang.reflect.Method;
import java.util.Map;

public class StringToMobileOSConverter implements Converter<MobileOSType> {

    @Override
    public MobileOSType convert(Method method, String s) {
        Map<String, MobileOSType> mobileOSMap = Map.of("android", MobileOSType.ANDROID, "ios", MobileOSType.IOS);

        /**
         * If the user mistakenly passes any un-supported OS,
         * then run tests on android as default (to ensure not to halt the process)
         */
        return mobileOSMap.getOrDefault(s.toUpperCase(), MobileOSType.ANDROID);
    }
}
