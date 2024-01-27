package com.samagra.driver.manager.mobile.local;

import com.samagra.config.factory.GlobalConfigFactory;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public final class AndroidManager {
    private AndroidManager() {
    }

    public static WebDriver getAndroidDriver() {
        UiAutomator2Options options = new UiAutomator2Options();
        options.setApp(System.getProperty("user.dir") + "/android-app.apk");
        return new AndroidDriver(GlobalConfigFactory.getConfig().localAppiumServerURL(), options);
    }

}
