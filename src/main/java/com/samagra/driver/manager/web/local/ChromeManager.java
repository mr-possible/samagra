package com.samagra.driver.manager.web.local;

import com.samagra.driver.manager.DriverManager;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public final class ChromeManager {
  private ChromeManager() {
  }

  public static WebDriver getChromeDriver() {
    ChromeOptions options = new ChromeOptions();
    options.addArguments("--start-maximized");
    options.addArguments("--disable-extensions");
    options.addArguments("--disable-popup-blocking");

    WebDriverManager.chromedriver().setup();
    WebDriver driver = new ChromeDriver(options);
    DriverManager.setDriver(driver);

    return driver;
  }

}
