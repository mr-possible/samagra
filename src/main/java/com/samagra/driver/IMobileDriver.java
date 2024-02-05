package com.samagra.driver;

import com.samagra.driver.entity.MobileDriverPreReq;
import org.openqa.selenium.WebDriver;

public interface IMobileDriver {
    WebDriver getLocal(MobileDriverPreReq preReq);
    WebDriver getRemote(MobileDriverPreReq preReq);
}
