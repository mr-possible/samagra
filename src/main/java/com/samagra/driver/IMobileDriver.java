package com.samagra.driver;

import com.samagra.driver.entity.MobileDriverPreReq;
import org.openqa.selenium.WebDriver;

public interface IMobileDriver {
    WebDriver getDriver(MobileDriverPreReq preReq);
}
