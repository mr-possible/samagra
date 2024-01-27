package com.samagra.config;

import com.samagra.config.converters.StringToURLConverter;
import org.aeonbits.owner.Config;

import java.net.URL;


@Config.Sources({"file:${user.dir}/src/test/resources/browser-stack.properties"})
@Config.LoadPolicy(Config.LoadType.MERGE)
public interface BrowserStackConfig extends Config {
    @Key("username")
    String userName();

    String key();

    @DefaultValue("https://${username}:${key}@hub-cloud.browserstack.com/wd/hub")
    @ConverterClass(StringToURLConverter.class)
    URL browserStackURL();
}