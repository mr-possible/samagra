package com.samagra.driver.entity;

import com.samagra.enums.BrowserRemotePlatform;
import com.samagra.enums.BrowserType;
import com.samagra.enums.RunMode;
import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class WebDriverPreReq {
    private BrowserType browserType;
    private BrowserRemotePlatform browserRemotePlatform;
}
