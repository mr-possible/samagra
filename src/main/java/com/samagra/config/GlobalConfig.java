package com.samagra.config;

import com.samagra.config.converters.StringToBrowserRemotePlatformConverter;
import com.samagra.config.converters.StringToBrowserRunModeConverter;
import com.samagra.config.converters.StringToBrowserTypeConverter;
import com.samagra.config.converters.StringToURLConverter;
import com.samagra.enums.BrowserRemotePlatform;
import com.samagra.enums.BrowserRunMode;
import com.samagra.enums.BrowserType;
import org.aeonbits.owner.Config;

import java.net.URL;

@Config.Sources(value = {
        "system:env",
        "system:properties",
        "file:src//main//resources//config.properties",
        "file:src//main//resources//${profile}.properties"
}
)
@Config.LoadPolicy(Config.LoadType.MERGE)
public interface GlobalConfig extends Config {

    @Key("web.browser")
    @DefaultValue("CHROME")
    @ConverterClass(StringToBrowserTypeConverter.class)
    BrowserType browser();

    @Key("web.runmode")
    @ConverterClass(StringToBrowserRunModeConverter.class)
    BrowserRunMode browserRunMode();

    @Key("web.browser.remote.platform")
    @ConverterClass(StringToBrowserRemotePlatformConverter.class)
    BrowserRemotePlatform browserRemotePlatform();

    @Key("selenium.grid.url")
    @ConverterClass(StringToURLConverter.class)
    URL seleniumGridURL();

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