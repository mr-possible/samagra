package com.samagra.driver;

import com.samagra.driver.entity.MobileDriverPreReq;
import com.samagra.driver.manager.mobile.factory.LocalMobileDriverFactory;
import com.samagra.driver.manager.mobile.factory.RemoteMobileDriverFactory;
import org.openqa.selenium.WebDriver;

public class MobileDriverPreReqImpl implements IMobileDriver {
    @Override
    public WebDriver getLocal(MobileDriverPreReq preReq) {
        return LocalMobileDriverFactory.getDriver(preReq.getMobileOSType());
    }

    @Override
    public WebDriver getRemote(MobileDriverPreReq preReq) {
        return RemoteMobileDriverFactory.getDriver(preReq.getMobileRemotePlatform(), preReq.getMobileOSType());
    }
}
