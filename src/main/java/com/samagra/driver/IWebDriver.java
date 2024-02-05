package com.samagra.driver;

import com.samagra.driver.entity.WebDriverPreReq;
import org.openqa.selenium.WebDriver;

public interface IWebDriver {
    WebDriver getLocal(WebDriverPreReq preReq);
    WebDriver getRemote(WebDriverPreReq preReq);
}
