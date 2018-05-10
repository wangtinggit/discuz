package testcase;

import org.testng.annotations.Test;
import pageHelper.HelperLoginPage;
import pageHelper.HelperPlatePage;

/**
 * Created by PC on 2018/5/8.
 */
public class LoginSubmit extends BasicTestCase {
    /*登录发帖*/
    @Test
    public void loginSubmit() throws InterruptedException {
        HelperLoginPage.login(seleniumUtil,"admin","password");
        Thread.sleep(3000);
        HelperPlatePage.clickPlate(seleniumUtil);
        Thread.sleep(3000);
        HelperPlatePage.publishPost(seleniumUtil,"abc","abc");
        HelperLoginPage.logout(seleniumUtil);
        Thread.sleep(3000);
    }
}
