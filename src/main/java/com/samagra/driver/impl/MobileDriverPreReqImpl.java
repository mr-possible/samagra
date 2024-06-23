package com.samagra.driver.impl;

import com.samagra.driver.IMobileDriver;
import com.samagra.driver.entity.MobileDriverPreReq;
import com.samagra.driver.factory.mobile.LocalMobileDriverFactory;
import org.openqa.selenium.WebDriver;

public class MobileDriverPreReqImpl implements IMobileDriver {
    @Override
    public WebDriver getDriver(MobileDriverPreReq preReq) {
        return LocalMobileDriverFactory.getDriver(preReq.getMobileOSType());
    }
}
