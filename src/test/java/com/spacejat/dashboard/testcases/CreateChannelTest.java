package com.spacejat.dashboard.testcases;

import com.github.javafaker.Faker;
import com.spacejat.dashboard.Utils.ConfigUtils;
import com.spacejat.dashboard.Utils.propertiesUtils;
import com.spacejat.dashboard.base.BaseTest;
import com.spacejat.dashboard.pages.HomePage;
import com.spacejat.dashboard.pages.MainPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.awt.datatransfer.StringSelection;
import java.util.Properties;

public class CreateChannelTest extends BaseTest {
    @Test
    public void ShouldBeAbleCreateTheChannelPublic() throws InterruptedException {
        MainPage mainPage = new MainPage(getDriver());
        mainPage
                .OpenSpaceJAT()
                .LoginWithLinkDeviceIdentity(ConfigUtils.getInstance().getLinkDeviceIdentity())
                .CreateChannelPublic(Faker.instance().name().title(),Faker.instance().name().title());
    }
    @Test
    public void ShouldBeAbleCreateTheChannelLocked() throws InterruptedException {
    MainPage mainPage = new MainPage(getDriver());
    mainPage
            .OpenSpaceJAT()
            .LoginWithLinkDeviceIdentity(ConfigUtils.getInstance().getLinkDeviceIdentity())
            .CreateChannelLocked(Faker.instance().name().title());
}
}













//        WebElement iframeChannel = driver.findElement(By.cssSelector("#videoFrameHome"));
//        driver.switchTo().frame(iframeChannel);
//        driver.findElement(By.xpath("//html/body/div/div[1]/div[1]/div/div[2]/div[2]/div[1]/button"))
//                .click();
//        Thread.sleep(2000);
//        driver.findElement(By.xpath("//html/body/div/div[1]/div[1]/div/div[2]/div[2]/div[3]/button"))
//                .click();
//        Thread.sleep(2000);
//        driver.switchTo().defaultContent();
//        driver.findElement(By.xpath("//html/body/div/div[1]/div[53]/div[3]/div/aside/div/div[2]/div[2]/div[1]/div[2]/div/textarea"))
//                .sendKeys(Faker.instance().letterify("Abbas").toUpperCase());
//        Thread.sleep(2000);
//        driver.findElement(By.xpath("//html/body/div/div[1]/div[53]/div[3]/div/aside/div/div[2]/div[2]/div[1]/div[2]/div/button"))
//                .click();
//        Thread.sleep(2000);
//        String filePath = "D:\\project\\AutomationTestingSpaceJat\\src\\main\\resources\\images\\92020484_742667479599044_871889068441468928_n.jpg";
//        driver.findElement(By.xpath("//*[@id=\"divParent\"]/div[1]/button"))
//                .sendKeys(filePath);
//        Thread.sleep(2000);
//        driver.findElement(By.xpath("//html/body/div/div[1]/div[53]/div[3]/div/aside/div/div[2]/div[2]/div[1]/div[2]/div/div[3]/div/div/button"))
//                .click();
//        Thread.sleep(2000);
//        driver.findElement(By.xpath("//html/body/div/div[1]/div[53]/div[3]/div/aside/div/div[2]/div[2]/div[1]/div[2]/div/div[3]/div/div/div/div[2]/div/div[1]/div/button[1]"))
//                .click();
//        Thread.sleep(2000);
//        driver.findElement(By.xpath("//html/body/div/div[1]/div[53]/div[3]/div/aside/div/div[2]/div[2]/div[1]/div[2]/div/button"))
//                .click();
//        Thread.sleep(2000);
//        driver.switchTo().frame(iframeChannel);
//        driver.findElement(By.xpath("//html/body/div/div[1]/div[1]/div/div[2]/div[2]/div[1]/button"))
//                .click();
//        Thread.sleep(2000);
//        driver.findElement(By.xpath("//html/body/div/div[1]/div[1]/div/div[2]/div[2]/div[2]/button"))
//                .click();
//        Thread.sleep(2000);
//        driver.findElement(By.xpath("//html/body/div/div[1]/div[1]/div/div[2]/div[2]/div[4]/button"))
//                .click();
