package com.test;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NewTest {
  @Test
  public void f() {
	  WebDriverManager.chromedriver().setup();
//	  System.setProperty("webdriver.chrome.driver", "/usr/bin/google-chrome" );
	  ChromeOptions options = new ChromeOptions();
	  options.addArguments("--headless");
	  ChromeDriver driver = new ChromeDriver(options);
	  driver.get("https://www.google.com");
	  System.out.println(driver.getCurrentUrl());
	  Assert.assertTrue(true);
	  driver.close();
  }
}
