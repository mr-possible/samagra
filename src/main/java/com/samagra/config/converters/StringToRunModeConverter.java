package com.samagra.config.converters;

import com.samagra.enums.RunMode;
import org.aeonbits.owner.Converter;

import java.lang.reflect.Method;
import java.util.Map;

public class StringToRunModeConverter implements Converter<RunMode> {

    @Override
    public RunMode convert(Method method, String browserRunMode) {
        Map<String, RunMode> values = Map.of("local", RunMode.LOCAL, "remote", RunMode.REMOTE
        );

        /**
         * If the user mistakenly passes any un-supported mode,
         * then run tests on local as default (to ensure not to halt the process)
         */
        return values.getOrDefault(browserRunMode, RunMode.LOCAL);
    }
}
