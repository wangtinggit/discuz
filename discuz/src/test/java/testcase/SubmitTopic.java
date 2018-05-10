package testcase;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import pageHelper.HelperLoginPage;
import pageHelper.HelperPlatePage;
import pageHelper.HelperTopicPage;

/**
 * Created by PC on 2018/5/8.
 */
public class SubmitTopic extends BasicTestCase{
    @Test
    public void topic() throws InterruptedException {
        HelperLoginPage.login(seleniumUtil,"admin","password");
        Thread.sleep(2000);
        HelperPlatePage.clickPlate(seleniumUtil);
        HelperTopicPage.clickSendPlate(seleniumUtil);
        HelperTopicPage.clickTopicPlate(seleniumUtil);
        HelperTopicPage.inputTopicTitle(seleniumUtil,"投票");
        HelperTopicPage.inputOptions(seleniumUtil,"1","2","3");
        /*seleniumUtil.iframe("e_iframe");
        HelperTopicPage.inputTopicContent(seleniumUtil,"为你哭");*/
        HelperTopicPage.clickTopicSubmit(seleniumUtil);
        seleniumUtil.getText(By.id("thread_subject"));


    }
}
