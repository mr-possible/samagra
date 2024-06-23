package com.samagra.driver.impl;

import com.samagra.driver.IWebDriver;
import com.samagra.driver.entity.WebDriverPreReq;
import com.samagra.driver.factory.web.LocalDriverFactory;
import org.openqa.selenium.WebDriver;

public class WebDriverPreReqImpl implements IWebDriver {
    @Override
    public WebDriver getDriver(WebDriverPreReq preReq) {
        return LocalDriverFactory.getDriver(preReq.getBrowserType());
    }
}
