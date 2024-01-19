package com.spacejat.dashboard.testcases;

import com.spacejat.dashboard.Utils.ConfigUtils;
import com.spacejat.dashboard.Utils.propertiesUtils;
import com.spacejat.dashboard.base.BaseTest;
import com.spacejat.dashboard.pages.HomePage;
import com.spacejat.dashboard.pages.MainPage;
import org.testng.annotations.Test;

import java.util.Properties;

public class ChatOne2OneTest extends BaseTest {
    @Test
    public void ShouldBeAbleToOpenChatOne2One() throws InterruptedException {
        MainPage mainPage = new MainPage(getDriver());
        mainPage
                .OpenSpaceJAT()
                .LoginWithLinkDeviceIdentity(ConfigUtils.getInstance().getLinkDeviceIdentity())
                .CreateChat();
    }
//    @Test
//    public void ShouldBeAbleToOpenChatOneToOne()
//    {
//        MainPage mainPage = new MainPage(driver);
//        mainPage
//        .OpenSpaceJAT()
//        .LoginWithLinkDeviceIdentity(ConfigUtils.getInstance().getLinkDeviceIdentity());
//    }
}
