package com.samagra.converters;

import com.samagra.enums.BrowserType;
import org.aeonbits.owner.Converter;

import java.lang.reflect.Method;
import java.util.Map;

public class StringToBrowserTypeConverter implements Converter<BrowserType> {

    @Override
    public BrowserType convert(Method method, String browserName) {
        Map<String, BrowserType> browserMap = Map.of("chrome", BrowserType.CHROME, "firefox", BrowserType.FIREFOX);

        /**
         * If the user mistakenly passes any un-supported browser,
         * then run tests on chrome as default (to ensure not to halt the process)
         */
        return browserMap.getOrDefault(browserName.toUpperCase(), BrowserType.CHROME);
    }
}
