package testcase;

import org.testng.annotations.Test;
import pageHelper.HelperLoginPage;
import pageHelper.HelperPlatePage;

/**
 * Created by PC on 2018/5/8.
 */
public class LoginDeletePost extends BasicTestCase {
    /*删除帖子*/
    @Test
    public void deletePost() throws InterruptedException {
        HelperLoginPage.login(seleniumUtil,"admin","password");     //登录
        Thread.sleep(2000);
        HelperPlatePage.clickPlate(seleniumUtil);   //点击默认版块
        Thread.sleep(2000);
        HelperPlatePage.clickDeletePost(seleniumUtil);      //点击删除
    }
}
