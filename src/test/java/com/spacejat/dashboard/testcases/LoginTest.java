package com.spacejat.dashboard.testcases;

import com.github.javafaker.Faker;
import com.spacejat.dashboard.Utils.ConfigUtils;
import com.spacejat.dashboard.base.BaseTest;
import com.spacejat.dashboard.pages.MainPage;
import org.testng.annotations.Test;


public class LoginTest extends BaseTest {
    @Test
    public void ShouldBeAbleToLoginWithLinkIdentity(){
        MainPage mainPage = new MainPage(getDriver());
        mainPage
                .OpenSpaceJAT()
                .LoginWithLinkDeviceIdentity(ConfigUtils.getInstance().getLinkDeviceIdentity());
    }
    @Test
    public void ShouldBeAbleCancelToLoginWithLinkIdentity(){
        MainPage mainPage = new MainPage(getDriver());
        mainPage
                .OpenSpaceJAT()
                .CancelLoginWithLinkDeviceIdentity(ConfigUtils.getInstance().getLinkDeviceIdentity());
    }
    @Test
    public void ShouldBeAbleExitToLoginWithLinkIdentity(){
        MainPage mainPage = new MainPage(getDriver());
        mainPage
                .OpenSpaceJAT()
                .ExitLoginWithLinkDeviceIdentity(ConfigUtils.getInstance().getLinkDeviceIdentity());
    }
    @Test
    public void ShouldBeAbleInvalidToLoginWithLinkIdentity(){
        MainPage mainPage = new MainPage(getDriver());
        mainPage
                .OpenSpaceJAT()
                .InvalidLoginWithLinkDeviceIdentity(ConfigUtils.getInstance().getInvalidLinkDeviceIdentity());
    }
    @Test
    public void ShouldBeAbleExitInvalidToLoginWithLinkIdentity(){
        MainPage mainPage = new MainPage(getDriver());
        mainPage
                .OpenSpaceJAT()
                .ExitInvalidLoginWithLinkDeviceIdentity(ConfigUtils.getInstance().getInvalidLinkDeviceIdentity());
    }
    @Test
    public void ShouldBeAbleExitToLoginWithInvitationLink(){
        MainPage mainPage = new MainPage(getDriver());
        mainPage
                .OpenSpaceJAT()
                .ExitLoginWithInvitationLink(ConfigUtils.getInstance().getInvitationLinkSpace());
    }
    @Test
    public void ShouldBeAbleCancelToLoginWithInvitationLink(){
        MainPage mainPage = new MainPage(getDriver());
        mainPage
                .OpenSpaceJAT()
                .CancelLoginWithInvitationLink(ConfigUtils.getInstance().getInvitationLinkSpace());
    }
    @Test
    public void ShouldBeAbleCancelToSelectYourIdentity(){
        MainPage mainPage = new MainPage(getDriver());
        mainPage
                .OpenSpaceJAT()
                .CancelSelectYourIdentity(ConfigUtils.getInstance().getInvitationLinkSpace());
    }
    @Test
    public void ShouldBeAbleExitToSelectYourIdentity(){
        MainPage mainPage = new MainPage(getDriver());
        mainPage
                .OpenSpaceJAT()
                .ExitSelectYourIdentity(ConfigUtils.getInstance().getInvitationLinkSpace());
    }
    @Test
    public void ShouldBeAbleToCancelCreateIdentity(){
        MainPage mainPage = new MainPage(getDriver());
        mainPage
                .OpenSpaceJAT()
                .CancelCreateIdentity(ConfigUtils.getInstance().getInvitationLinkSpace());
    }
    @Test
    public void ShouldBeAbleToIconCloseCreateIdentity(){
        MainPage mainPage = new MainPage(getDriver());
        mainPage
                .OpenSpaceJAT()
                .IconCloseCreateIdentity(ConfigUtils.getInstance().getInvitationLinkSpace());
    }
    @Test
    public void ShouldBeAbleToLoginWithInvitationLink(){
        MainPage mainPage = new MainPage(getDriver());
        mainPage
                .OpenSpaceJAT()
                .LoginWithInvitationLink
                        (ConfigUtils.getInstance().getInvitationLinkSpace(),
                                Faker.instance().name().firstName(),
                                Faker.instance().name().lastName(),
                                "khalilbido01@gmail.com",
                                "Software test engineer",
                                "01142446676");
    }
    @Test
    public void ShouldBeAbleCancelAfterCreateIdentityToLoginWithInvitationLink(){
        MainPage mainPage = new MainPage(getDriver());
        mainPage
                .OpenSpaceJAT()
                .CancelAfterCreateIdentity
                        (ConfigUtils.getInstance().getInvitationLinkSpace(),
                                Faker.instance().name().firstName(),
                                Faker.instance().name().lastName(),
                                "khalilbido01@gmail.com",
                                "Software test engineer",
                                "01142446676");
    }
    @Test
    public void ShouldBeAbleInvalidToLoginWithInvitationLink(){
        MainPage mainPage = new MainPage(getDriver());
        mainPage
                .OpenSpaceJAT()
                .InvalidLoginWithInvitationLink(ConfigUtils.getInstance().getInvalidInvitationLinkSpace());
    }
    @Test
    public void ShouldBeAbleExitInvalidToLoginWithInvitationLink(){
        MainPage mainPage = new MainPage(getDriver());
        mainPage
                .OpenSpaceJAT()
                .ExitInvalidLoginWithInvitationLink(ConfigUtils.getInstance().getInvalidInvitationLinkSpace());
    }
    @Test
    public void ShouldBeAbleToJoinMeetingAsAGuest(){
        MainPage mainPage = new MainPage(getDriver());
        mainPage
                .OpenSpaceJAT()
                .JoinMeetingAsAGuest(
                ConfigUtils.getInstance().getInvitationLinkMeeting(),
                "Bido",
                "khalilbido01@gmail.com");
    }
    @Test
    public void  ShouldBeAbleExitToJoinMeetingAsAGuest(){
        MainPage mainPage = new MainPage(getDriver());
        mainPage
                .OpenSpaceJAT()
                .ExitJoinMeetingAsAGuest(ConfigUtils.getInstance().getInvitationLinkMeeting());
    }
    @Test
    public void  ShouldBeAbleCancelToJoinMeetingAsAGuest(){
        MainPage mainPage = new MainPage(getDriver());
        mainPage
                .OpenSpaceJAT()
                .CancelJoinMeetingAsAGuest(ConfigUtils.getInstance().getInvitationLinkMeeting());
    }
    @Test
    public void ShouldBeAbleToExitTermsAndConditions(){
        MainPage mainPage = new MainPage(getDriver());
        mainPage
                .OpenSpaceJAT()
                .ExitTermsAndConditions();
    }

}

