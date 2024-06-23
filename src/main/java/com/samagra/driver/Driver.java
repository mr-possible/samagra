package com.samagra.driver;

import com.samagra.config.factory.GlobalConfigFactory;
import com.samagra.driver.entity.MobileDriverPreReq;
import com.samagra.driver.entity.WebDriverPreReq;
import com.samagra.driver.factory.DriverFactory;
import org.openqa.selenium.WebDriver;

public final class Driver {

    private static WebDriver driver = null;

    public static void initialiseDriverForWeb() {
        WebDriverPreReq preReqs = WebDriverPreReq.builder()
                .browserType(GlobalConfigFactory.getConfig().browser())
                .browserRemotePlatform(GlobalConfigFactory.getConfig().browserRemotePlatform())
                .build();
        driver = DriverFactory.getDriverForWeb(GlobalConfigFactory.getConfig().runMode()).getDriver(preReqs);
    }

    public static void initialiseDriverForMobile() {
        MobileDriverPreReq preReqs = MobileDriverPreReq.builder()
                .mobileOSType(GlobalConfigFactory.getConfig().mobileOS())
                .mobileRemotePlatform(GlobalConfigFactory.getConfig().mobileRemotePlatform())
                .build();
        driver = DriverFactory.getDriverForMobile(GlobalConfigFactory.getConfig().runMode()).getDriver(preReqs);
    }

    public static void quitDriver() {
        if (driver != null) {
            driver.quit();
        }
    }
}
