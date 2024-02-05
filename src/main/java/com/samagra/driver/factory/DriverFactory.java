package com.samagra.driver.factory;

import com.samagra.driver.MobileDriverPreReqImpl;
import com.samagra.driver.WebDriverPreReqImpl;
import com.samagra.driver.entity.MobileDriverPreReq;
import com.samagra.driver.entity.WebDriverPreReq;
import com.samagra.enums.RunMode;
import org.openqa.selenium.WebDriver;

public final class DriverFactory {
    private DriverFactory() {

    }

    public static WebDriver getDriverForWeb(WebDriverPreReq preReqs) {
        return preReqs.getRunMode().equals(RunMode.LOCAL) ?
                new WebDriverPreReqImpl().getLocal(preReqs) :
                new WebDriverPreReqImpl().getRemote(preReqs);
    }

    public static WebDriver getDriverForMobile(MobileDriverPreReq preReqs) {
        return preReqs.getRunMode().equals(RunMode.LOCAL) ?
                new MobileDriverPreReqImpl().getLocal(preReqs) :
                new MobileDriverPreReqImpl().getRemote(preReqs);
    }
}
