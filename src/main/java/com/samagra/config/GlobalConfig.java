package com.samagra.config;

import com.samagra.converters.StringToBrowserTypeConverter;
import com.samagra.enums.BrowserType;
import org.aeonbits.owner.Config;

@Config.Sources(value = {
        "system:env",
        "system:properties",
        "file:src//main//resources//config.properties",
        "file:src//main//resources//${profile}.properties"
}
)
@Config.LoadPolicy(Config.LoadType.MERGE)
public interface GlobalConfig extends Config {

    @Key("browser")
    @DefaultValue("CHROME")
    @ConverterClass(StringToBrowserTypeConverter.class)
    BrowserType browser();

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