package com.samagra.driver.manager.mobile.local;

import com.samagra.config.factory.GlobalConfigFactory;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.options.XCUITestOptions;
import org.openqa.selenium.WebDriver;

public class IosManager {
    private IosManager() {
    }

    public static WebDriver getIOSDriver() {
        XCUITestOptions options = new XCUITestOptions();
        options.setDeviceName("iPhone 13 Pro Max")
                .setApp(System.getProperty("user.dir") + "/ios-app.zip");
        return new IOSDriver(GlobalConfigFactory.getConfig().localAppiumServerURL(), options);
    }
}
