package com.samagra.driver.manager;

import org.openqa.selenium.WebDriver;

import java.util.Objects;

public final class DriverManager {
  private static final ThreadLocal<WebDriver> THREAD_LOCAL = new ThreadLocal<>();

  private DriverManager() {
  }

  public static WebDriver getDriver() {
    return THREAD_LOCAL.get();
  }

  public static void setDriver(WebDriver driver) {
    if (Objects.nonNull(driver)) {
      THREAD_LOCAL.set(driver);
    }
  }

  public static void unload() {
    THREAD_LOCAL.remove();
  }
}
