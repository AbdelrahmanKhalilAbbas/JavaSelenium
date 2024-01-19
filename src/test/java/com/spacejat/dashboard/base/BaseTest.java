package com.spacejat.dashboard.base;

import com.spacejat.dashboard.factory.DriverFactory;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {
    protected ThreadLocal <WebDriver> driver = new ThreadLocal<>();

    public void setDriver(WebDriver driver){
        this.driver.set(driver);
    }
    public WebDriver getDriver(){
        return this.driver.get();
    }
    @BeforeMethod
    public void SetUp(){
        WebDriver driver = new DriverFactory().initializeDriver();
        setDriver(driver);
        driver.get("https://www.google.com/");
    }
    @AfterMethod
    public void TearDown(){
        getDriver().quit();
    }
}
