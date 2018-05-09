package testcase;

import org.testng.annotations.Test;
import pageHelper.HelperLoginPage;
import pageHelper.HelperManagerLoginPage;

/**
 * Created by PC on 2018/5/8.
 */
public class ManagerLogin extends BasicTestCase {
    /*管理员登录*/
    @Test
    public void magLogin() throws InterruptedException {
        HelperLoginPage.login(seleniumUtil,"admin","password");
        Thread.sleep(2000);
        HelperManagerLoginPage.clickManagerPlate(seleniumUtil);
        Thread.sleep(2000);
        HelperManagerLoginPage.managerLogin(seleniumUtil,"password");
    }



}
