package testcase;

import org.testng.annotations.Test;
import pageHelper.HelperLoginPage;

/**
 * Created by PC on 2018/5/7.
 */
public class LoginPage extends BasicTestCase {
    /*登录*/
    @Test
    public void login(){
        HelperLoginPage.login(seleniumUtil,"admin","password");
        HelperLoginPage.logout(seleniumUtil);
    }








}
