package com.samagra.driver.manager.mobile.remote;

import com.samagra.config.BrowserStackConfig;
import com.samagra.config.factory.BrowserStackConfigFactory;
import com.samagra.config.factory.GlobalConfigFactory;
import com.samagra.enums.BrowserType;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public final class BrowserstackAndroidManager {

    private BrowserstackAndroidManager() {
    }

    public static WebDriver getDriver() {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("app", "bs://067b3d9696fb162c26cd37417fa5cf1a64cdcc87");
        capabilities.setCapability("device", "Google Pixel 3");
        capabilities.setCapability("os_version", "9.0");
        capabilities.setCapability("project", "First Java Project");
        capabilities.setCapability("build", "browserstack-build-1");
        capabilities.setCapability("name", "first_test");
        return new RemoteWebDriver(BrowserStackConfigFactory.getConfig()
                .browserStackURL(), capabilities);
    }
}
