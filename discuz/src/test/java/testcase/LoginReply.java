package testcase;

import org.testng.annotations.Test;
import pageHelper.HelperLoginPage;
import pageHelper.HelperPlatePage;

/**
 * Created by PC on 2018/5/8.
 */
public class LoginReply extends  BasicTestCase {

    /*登录回帖*/
    @Test
    public void replyPost() throws InterruptedException {
        HelperLoginPage.login(seleniumUtil,"admin","password");
        HelperPlatePage.clickPlate(seleniumUtil);
        HelperPlatePage.choosePost(seleniumUtil);
        HelperPlatePage.replyPost(seleniumUtil,"jknvfksn");
        HelperLoginPage.logout(seleniumUtil);
    }
}
