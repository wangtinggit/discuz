package testcase;

import org.testng.annotations.Test;
import pageHelper.HelperAddPlatePage;
import pageHelper.HelperLoginPage;
import pageHelper.HelperManagerLoginPage;

/**
 * Created by PC on 2018/5/8.
 */
public class ManagerAddPlate extends BasicTestCase {
    @Test
    public void addNewPlate() throws InterruptedException {
        HelperLoginPage.login(seleniumUtil,"admin","password");
        HelperManagerLoginPage.clickManagerPlate(seleniumUtil);
        HelperManagerLoginPage.managerLogin(seleniumUtil,"password");
        seleniumUtil.assertPage("Discuz! Board 管理中心 - 首页");
        HelperAddPlatePage.addPlate(seleniumUtil);
        HelperManagerLoginPage.maglogout(seleniumUtil);
        HelperLoginPage.logout(seleniumUtil);
    }
}
