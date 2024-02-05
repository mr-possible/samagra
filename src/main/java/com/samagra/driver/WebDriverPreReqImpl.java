package com.samagra.driver;

import com.samagra.driver.entity.WebDriverPreReq;
import com.samagra.driver.manager.web.factory.LocalDriverFactory;
import com.samagra.driver.manager.web.factory.RemoteDriverFactory;
import org.openqa.selenium.WebDriver;

public class WebDriverPreReqImpl implements IWebDriver {
    @Override
    public WebDriver getLocal(WebDriverPreReq preReq) {
        return LocalDriverFactory.getDriver(preReq.getBrowserType());
    }

    @Override
    public WebDriver getRemote(WebDriverPreReq preReq) {
        return RemoteDriverFactory.getDriver(preReq.getBrowserRemotePlatform(), preReq.getBrowserType());
    }
}
