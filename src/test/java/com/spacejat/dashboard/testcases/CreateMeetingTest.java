package com.spacejat.dashboard.testcases;

import com.github.javafaker.Faker;
import com.spacejat.dashboard.Utils.ConfigUtils;
import com.spacejat.dashboard.Utils.propertiesUtils;
import com.spacejat.dashboard.base.BaseTest;
import com.spacejat.dashboard.pages.HomePage;
import com.spacejat.dashboard.pages.MainPage;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import java.util.Properties;

public class CreateMeetingTest extends BaseTest {
    @Test
    public void ShouldBeAbleCreateTheMeetingPublic() throws InterruptedException {
        MainPage mainPage = new MainPage(getDriver());
        mainPage
                .OpenSpaceJAT()
                .LoginWithLinkDeviceIdentity(ConfigUtils.getInstance().getLinkDeviceIdentity())
                .CreateMeetingPublic(Faker.instance().name().title());
    }
    @Test
    public void ShouldBeAbleCreateTheMeetingPrivate() throws InterruptedException {
        MainPage mainPage = new MainPage(getDriver());
        mainPage
                .OpenSpaceJAT()
                .LoginWithLinkDeviceIdentity(ConfigUtils.getInstance().getLinkDeviceIdentity())
                .CreateMeetingPrivate(Faker.instance().name().title());
    }
}
