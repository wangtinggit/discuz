package testcase;

import org.testng.annotations.Test;
import pageHelper.HelperLoginPage;
import pageHelper.HelperPlatePage;

/**
 * Created by PC on 2018/5/8.
 */
public class SubmitReply extends BasicTestCase {
    /*登录发帖回帖*/
    @Test
    public void submitReplyPost() throws InterruptedException {
        HelperLoginPage.login(seleniumUtil,"admin","password");
        Thread.sleep(2000);
        HelperPlatePage.submit(seleniumUtil,"abc","abc");
        Thread.sleep(2000);
        HelperPlatePage.clickPlate(seleniumUtil);
        Thread.sleep(2000);
        HelperPlatePage.replyPost(seleniumUtil,"jknvfksn");

    }
}
