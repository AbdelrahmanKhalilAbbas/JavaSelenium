package com.spacejat.dashboard.pages;

import com.spacejat.dashboard.Utils.ConfigUtils;
import com.spacejat.dashboard.base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainPage extends BasePage
{
    public MainPage(WebDriver driver) {
        super(driver);
    }
    /*
    LINK DEVICE IDENTITY
    */
    @FindBy(xpath = "//html/body/div/div[1]/div[1]/div[1]/button[1]")
    private WebElement LinkDeviceIdentity ;
    @FindBy(xpath = "//html/body/div[1]/div[1]/div[1]/div[9]/div/div/div[2]/div[2]/div/input")
    private WebElement InsertPinInput;
    @FindBy(xpath = "//html/body/div[1]/div[1]/div[1]/div[9]/div/div/div[2]/div[3]/button[2]")
    private WebElement ProceedInsertPin;
    @FindBy(xpath = "//html/body/div[1]/div[1]/div[1]/div[9]/div/div/div[2]/div[3]/button[1]")
    private WebElement CancelInsertPin;
    @FindBy(xpath = "//html/body/div[1]/div[1]/div[1]/div[9]/div/div/div[1]/button")
    private WebElement IconCloseLinkDeviceInsertPin;
    @FindBy(xpath = "//html/body/div[1]/div[1]/div[1]/div[9]/div/div/div[2]/div[2]/div/button")
    private WebElement iconRightInsertPin;
    @FindBy(xpath = "//html/body/div[1]/div[1]/div[1]/div[85]/div/div/div[2]/div[3]/button")
    private WebElement DismissInvalidInsertPin;
    @FindBy(xpath = "//html/body/div[1]/div[1]/div[1]/div[85]/div/div/div[1]/button")
    private WebElement IconCloseDismissInvalidInsertPin;
    /*
    "Have an Invitation Link?"
    */
    @FindBy(xpath = "//html/body/div/div[1]/div[1]/div[1]/div[3]/input")
    private WebElement EnterInvitationLinkToJoinSpaceOrMeetingInput;
    @FindBy(xpath = "//html/body/div/div[1]/div[1]/div[1]/div[3]/button")
    private WebElement iconRightInvitationLinkToJoinSpaceOrMeeting;
    // PopUp InvitationLinkNotFound
    @FindBy(xpath = "//html/body/div[1]/div[1]/div[1]/div[61]/div/div/div[2]/div[2]/button")
    private WebElement DismissInvitationLinkNotFound;
    @FindBy(xpath = "//html/body/div[1]/div[1]/div[1]/div[61]/div/div/div[1]/button")
    private WebElement IconCloseInvitationLinkNotFound;
    // PopUp InvitationLinkFound
    @FindBy(xpath = "//html/body/div[1]/div[1]/div[1]/div[2]/div/div/div[2]/div[2]/button[2]")
    private WebElement AcceptInvitationLinkFound;
    @FindBy(xpath = "//html/body/div[1]/div[1]/div[1]/div[2]/div/div/div[2]/div[2]/button[1]")
    private WebElement CancelInvitationLinkFound;
    @FindBy(xpath = "//html/body/div[1]/div[1]/div[1]/div[2]/div/div/div[1]/button")
    private WebElement IconCloseInvitationLinkFound;
    // Popups Create Identity
    @FindBy(xpath = "//html/body/div[1]/div[1]/div[1]/div[2]/div/div/div[2]/div[2]/button")
    private WebElement CreateIdentitySelectYourIdentity;
    @FindBy(xpath = "//html/body/div[1]/div[1]/div[1]/div[2]/div/div/div[2]/div[2]/div[1]/input")
    private WebElement FirstNameInput;
    @FindBy(xpath = "//html/body/div[1]/div[1]/div[1]/div[2]/div/div/div[2]/div[2]/div[2]/input")
    private WebElement LastNameInput;
    @FindBy(xpath = "//html/body/div[1]/div[1]/div[1]/div[2]/div/div/div[2]/div[3]/input")
    private WebElement BusinessEmailInput;
    @FindBy(xpath = "//html/body/div[1]/div[1]/div[1]/div[2]/div/div/div[2]/div[4]/input")
    private WebElement JobTitleInput;
    @FindBy(xpath = "//html/body/div[1]/div[1]/div[1]/div[2]/div/div/div[2]/div[5]/input")
    private WebElement MobileInput;
    @FindBy(xpath = "//html/body/div[1]/div[1]/div[1]/div[2]/div/div/div[2]/div[7]/button[1]")
    private WebElement CancelBCreateIdentity;
    @FindBy(xpath = "//html/body/div[1]/div[1]/div[1]/div[2]/div/div/div[2]/div[7]/button[2]")
    private WebElement CreateBCreateIdentity;
    @FindBy(xpath = "//html/body/div[1]/div[1]/div[1]/div[2]/div/div/div[1]/button")
    private WebElement IconCloseCreateIdentity;
    //Popups SelectYourIdentity
    @FindBy(xpath = "//html/body/div[1]/div[1]/div[1]/div[2]/div/div/div[2]/div[4]/button[1]")
    private WebElement CancelSelectYourIdentity;
    @FindBy(xpath = "//html/body/div[1]/div[1]/div[1]/div[2]/div/div/div[1]/button")
    private WebElement IconCloseSelectYourIdentity;
    @FindBy(xpath = "//html/body/div[1]/div[1]/div[1]/div[2]/div/div/div[2]/div[4]/button[2]")
    private WebElement JoinSelectYourIdentity;
    //Popups JoinMeetingAsAGuest
    @FindBy(xpath = "//html/body/div[1]/div[1]/div[1]/div[8]/div/div/div[1]/button")
    private WebElement IconCloseJoinMeetingAsAGuest;
    @FindBy(xpath = "//html/body/div[1]/div[1]/div[1]/div[8]/div/div/div[2]/div[2]/input")
    private WebElement EnterYourNameInput;
    @FindBy(xpath = "//html/body/div[1]/div[1]/div[1]/div[8]/div/div/div[2]/div[3]/input")
    private WebElement EnterYourEmailInput;
    @FindBy(xpath = "//html/body/div[1]/div[1]/div[1]/div[8]/div/div/div[2]/div[4]/button[2]")
    private WebElement JoinBJoinMeetingAsAGuest;
    @FindBy(xpath = "//html/body/div[1]/div[1]/div[1]/div[8]/div/div/div[2]/div[4]/button[1]")
    private WebElement CancelBJoinMeetingAsAGuest;
    //Popups SpaceInfo
    @FindBy(xpath = "//html/body/div[1]/div[29]/div/div/div[2]/div[2]/input")
    private WebElement SpaceNameInput;
    @FindBy(xpath = "//html/body/div[1]/div[29]/div/div/div[2]/div[5]/button")
    private WebElement StartSpaceInfo;
    @FindBy(xpath = "//html/body/div[1]/div[29]/div/div/div[1]/button[1]")
    private WebElement backIconSpaceInfo;
    @FindBy(xpath = "//html/body/div[1]/div[29]/div/div/div[1]/button[3]")
    private WebElement IconCloseSpaceInfo;
    // Terms and Conditions
    @FindBy(xpath = "//html/body/div/div[1]/div[1]/div[1]/button[2]")
    private WebElement TermsAndConditions;
    @FindBy(xpath = "//html/body/div[1]/div[1]/div[1]/div[11]/div/div/div/div[2]/div/button")
    private WebElement IAgree;
    @FindBy(xpath = "//html/body/div[1]/div[1]/div[1]/div[11]/div/div/div/div[1]/button")
    private WebElement IconCloseTermsAndConditions;

    public MainPage OpenSpaceJAT(){
        driver.navigate().to(ConfigUtils.getInstance().getBaseUrl());
        return this;
    }
    public HomePage LoginWithLinkDeviceIdentity(String Identity)
    {
        LinkDeviceIdentity.click();
        InsertPinInput.sendKeys(Identity);
        ProceedInsertPin.click();
        return new HomePage(driver);
    }
    public void CancelLoginWithLinkDeviceIdentity(String Identity){
        LinkDeviceIdentity.click();
        InsertPinInput.sendKeys(Identity);
        CancelInsertPin.click();
    }
    public void ExitLoginWithLinkDeviceIdentity(String Identity){
        LinkDeviceIdentity.click();
        InsertPinInput.sendKeys(Identity);
        IconCloseLinkDeviceInsertPin.click();
    }
    public void InvalidLoginWithLinkDeviceIdentity(String InvalidIdentity){
        LinkDeviceIdentity.click();
        InsertPinInput.sendKeys(InvalidIdentity);
        iconRightInsertPin.click();
        DismissInvalidInsertPin.click();
    }
    public void ExitInvalidLoginWithLinkDeviceIdentity(String InvalidIdentity){
        LinkDeviceIdentity.click();
        InsertPinInput.sendKeys(InvalidIdentity);
        iconRightInsertPin.click();
        IconCloseDismissInvalidInsertPin.click();
    }

    public void LoginWithInvitationLink(String InvitationLink,String firstName,String lastName,String businessEmail,String jobTitle,String Mobile)
    {
        EnterInvitationLinkToJoinSpaceOrMeetingInput.sendKeys(InvitationLink);
        iconRightInvitationLinkToJoinSpaceOrMeeting.click();
        AcceptInvitationLinkFound.click();
        CreateIdentitySelectYourIdentity.click();
        FirstNameInput.sendKeys(firstName);
        LastNameInput.sendKeys(lastName);
        BusinessEmailInput.sendKeys(businessEmail);
        JobTitleInput.sendKeys(jobTitle);
        MobileInput.sendKeys(Mobile);
        CreateBCreateIdentity.click();
        JoinSelectYourIdentity.click();
    }
    public void CancelAfterCreateIdentity(String InvitationLink, String firstName, String lastName, String businessEmail, String jobTitle, String Mobile){
        EnterInvitationLinkToJoinSpaceOrMeetingInput.sendKeys(InvitationLink);
        iconRightInvitationLinkToJoinSpaceOrMeeting.click();
        AcceptInvitationLinkFound.click();
        CreateIdentitySelectYourIdentity.click();
        FirstNameInput.sendKeys(firstName);
        LastNameInput.sendKeys(lastName);
        BusinessEmailInput.sendKeys(businessEmail);
        JobTitleInput.sendKeys(jobTitle);
        MobileInput.sendKeys(Mobile);
        CreateBCreateIdentity.click();
        CancelSelectYourIdentity.click();
    }
    public void CancelCreateIdentity(String InvitationLink){
        EnterInvitationLinkToJoinSpaceOrMeetingInput.sendKeys(InvitationLink);
        iconRightInvitationLinkToJoinSpaceOrMeeting.click();
        AcceptInvitationLinkFound.click();
        CreateIdentitySelectYourIdentity.click();
        CancelBCreateIdentity.click();
    }
    public void IconCloseCreateIdentity(String InvitationLink){
        EnterInvitationLinkToJoinSpaceOrMeetingInput.sendKeys(InvitationLink);
        iconRightInvitationLinkToJoinSpaceOrMeeting.click();
        AcceptInvitationLinkFound.click();
        CreateIdentitySelectYourIdentity.click();
        IconCloseCreateIdentity.click();
    }
    public void ExitSelectYourIdentity(String InvitationLink){
        EnterInvitationLinkToJoinSpaceOrMeetingInput.sendKeys(InvitationLink);
        iconRightInvitationLinkToJoinSpaceOrMeeting.click();
        AcceptInvitationLinkFound.click();
        IconCloseSelectYourIdentity.click();
    }
    public void CancelSelectYourIdentity(String InvitationLink){
        EnterInvitationLinkToJoinSpaceOrMeetingInput.sendKeys(InvitationLink);
        iconRightInvitationLinkToJoinSpaceOrMeeting.click();
        AcceptInvitationLinkFound.click();
        CancelSelectYourIdentity.click();
    }
    public void ExitLoginWithInvitationLink(String InvitationLink){
        EnterInvitationLinkToJoinSpaceOrMeetingInput.sendKeys(InvitationLink);
        iconRightInvitationLinkToJoinSpaceOrMeeting.click();
        IconCloseInvitationLinkFound.click();
    }
    public void CancelLoginWithInvitationLink(String InvitationLink){
        EnterInvitationLinkToJoinSpaceOrMeetingInput.sendKeys(InvitationLink);
        iconRightInvitationLinkToJoinSpaceOrMeeting.click();
        CancelInvitationLinkFound.click();
    }
    public void InvalidLoginWithInvitationLink(String InvalidInvitationLink){
        EnterInvitationLinkToJoinSpaceOrMeetingInput.sendKeys(InvalidInvitationLink);
        iconRightInvitationLinkToJoinSpaceOrMeeting.click();
        DismissInvitationLinkNotFound.click();
    }
    public void ExitInvalidLoginWithInvitationLink(String InvalidInvitationLink){
        EnterInvitationLinkToJoinSpaceOrMeetingInput.sendKeys(InvalidInvitationLink);
        iconRightInvitationLinkToJoinSpaceOrMeeting.click();
        IconCloseInvitationLinkNotFound.click();
    }
    public void JoinMeetingAsAGuest(String InvitationLinkMeeting,String EnterYourName,String EnterYourEmail){
        EnterInvitationLinkToJoinSpaceOrMeetingInput.sendKeys(InvitationLinkMeeting);
        iconRightInvitationLinkToJoinSpaceOrMeeting.click();
        EnterYourNameInput.sendKeys(EnterYourName);
        EnterYourEmailInput.sendKeys(EnterYourEmail);
        JoinBJoinMeetingAsAGuest.click();
    }
    public void ExitJoinMeetingAsAGuest(String InvitationLinkMeeting){
        EnterInvitationLinkToJoinSpaceOrMeetingInput.sendKeys(InvitationLinkMeeting);
        iconRightInvitationLinkToJoinSpaceOrMeeting.click();
        IconCloseJoinMeetingAsAGuest.click();
    }
    public void CancelJoinMeetingAsAGuest(String InvitationLinkMeeting){
        EnterInvitationLinkToJoinSpaceOrMeetingInput.sendKeys(InvitationLinkMeeting);
        iconRightInvitationLinkToJoinSpaceOrMeeting.click();
        CancelBJoinMeetingAsAGuest.click();
    }
    public void ExitTermsAndConditions(){
        TermsAndConditions.click();
        IconCloseTermsAndConditions.click();
    }
    public void AgreeTermsAndConditions(){
        TermsAndConditions.click();
// scroll down 738
        IAgree.click();
    }
}
