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
        Thread.sleep(2000);
        HelperPlatePage.clickPlate(seleniumUtil);
        Thread.sleep(2000);
        HelperPlatePage.replyPost(seleniumUtil,"jknvfksn");
    }
}
