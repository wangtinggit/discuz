package testcase;

import org.testng.annotations.Test;
import pageHelper.HelperLoginPage;
import pageHelper.HelperPlatePage;

/**
 * Created by PC on 2018/5/8.
 */
public class LoginSubRep extends BasicTestCase {
    /*登录发帖回帖*/
    @Test
    public void submitReplyPost() throws InterruptedException {
        HelperLoginPage.login(seleniumUtil,"admin","password");
        HelperPlatePage.clickPlate(seleniumUtil);
        HelperPlatePage.publishPost(seleniumUtil,"abc","abc");
        HelperPlatePage.replyPost(seleniumUtil,"jknvfksn");
        HelperLoginPage.logout(seleniumUtil);

    }
}
