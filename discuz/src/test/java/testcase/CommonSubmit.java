package testcase;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import pageHelper.HelperLoginPage;
import pageHelper.HelperPlatePage;

/**
 * Created by PC on 2018/5/8.
 */
public class CommonSubmit extends BasicTestCase {
    /*普通用户登录，发帖，回帖*/
    @Test
    public void login() throws InterruptedException {
        HelperLoginPage.login(seleniumUtil,"wtt","123456");
        HelperPlatePage.clickNewPlate(seleniumUtil);
        HelperPlatePage.publishPost(seleniumUtil,"付款了吗V","时空女神");
        HelperPlatePage.replyPost(seleniumUtil,"四大皆空烦恼");
    }
}
