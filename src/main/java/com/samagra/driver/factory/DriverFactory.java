package com.samagra.driver.factory;

import com.samagra.driver.IMobileDriver;
import com.samagra.driver.IWebDriver;
import com.samagra.driver.impl.MobileDriverPreReqImpl;
import com.samagra.driver.impl.WebDriverPreReqImpl;
import com.samagra.enums.RunMode;

import java.util.EnumMap;
import java.util.Map;
import java.util.function.Supplier;

public final class DriverFactory {

    private static final Map<RunMode, Supplier<IWebDriver>> WEB = new EnumMap<>(RunMode.class);
    private static final Map<RunMode, Supplier<IMobileDriver>> MOBILE = new EnumMap<>(RunMode.class);

    static {
        WEB.put(RunMode.LOCAL, WebDriverPreReqImpl::new);
        WEB.put(RunMode.REMOTE, WebDriverPreReqImpl::new);
        MOBILE.put(RunMode.LOCAL, MobileDriverPreReqImpl::new);
        MOBILE.put(RunMode.REMOTE, MobileDriverPreReqImpl::new);
    }

    private DriverFactory() {
    }

    public static IWebDriver getDriverForWeb(RunMode runMode) {
        return WEB.get(runMode).get();
    }

    public static IMobileDriver getDriverForMobile(RunMode runMode) {
        return MOBILE
                .get(runMode).get();
    }
}
