package com.samagra.config;

import com.samagra.config.converters.*;
import com.samagra.enums.*;
import org.aeonbits.owner.Config;

import java.net.URL;

@Config.LoadPolicy(Config.LoadType.MERGE)
@Config.Sources({
        "system:properties",
        "system:env",
        "file:${user.dir}/src/test/resources/config.properties",
        "file:${user.dir}/src/test/resources/staging-config.properties",
        "file:${user.dir}/src/test/resources/dev-config.properties"
})
public interface GlobalConfig extends Config {

    @Key("runmode")
    @ConverterClass(StringToRunModeConverter.class)
    RunMode runMode();

    @Key("web.browser")
    @DefaultValue("CHROME")
    @ConverterClass(StringToBrowserTypeConverter.class)
    BrowserType browser();

    @Key("web.browser.remote.platform")
    @ConverterClass(StringToBrowserRemotePlatformConverter.class)
    BrowserRemotePlatform browserRemotePlatform();

    @Key("selenium.grid.url")
    @ConverterClass(StringToURLConverter.class)
    URL seleniumGridURL();

    @Key("mobile.os")
    @ConverterClass(StringToMobileOSConverter.class)
    MobileOSType mobileOS();

    @Key("mobile.remote.platform")
    @ConverterClass(StringToMobileRemotePlatformConverter.class)
    MobileRemotePlatform mobileRemotePlatform();

    @Key("appium.server.url")
    @ConverterClass(StringToURLConverter.class)
    @DefaultValue("http://127.0.0.1:4723/wd/hub")
    URL localAppiumServerURL();

    @Key("wait.least")
    int leastwait();

    @Key("wait.long")
    int longWait();

    @Key("wait.longest")
    int longestWait();

    @Key("db.name")
    String dbName();

    @Key("db.url")
    String dbURL();

    @Key("db.username")
    String dbUsername();

    @Key("db.password")
    String dbPassword();

    @Key("grid.enable")
    boolean isGridEnabled();

    @Key("grid.url")
    String gridURL();

    @Key("grid.host")
    String gridHost();

    @Key("aws.url")
    String awsURL();

    @Key("aws.username")
    String awsUsername();

    @Key("aws.password")
    String awsPassword();

    @Key("screenshot.enable")
    boolean takeScreenshot();

    @Key("kibana.url")
    String kibanaURL();

    @Key("kibana.username")
    String kibanaUsername();

    @Key("kibana.password")
    String kibanaPassword();

    @Key("app.url")
    String appUrl();
}