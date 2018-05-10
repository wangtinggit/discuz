package testcase;

import org.testng.annotations.Test;
import pageHelper.HelperManagerLoginPage;

/**
 * Created by PC on 2018/5/8.
 */
public class ManagerLogout extends BasicTestCase {
    /*管理员退出登录*/
    @Test
    public void logout(){
        HelperManagerLoginPage.maglogout(seleniumUtil);
    }

}
