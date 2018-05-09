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
        Thread.sleep(2000);
        HelperManagerLoginPage.clickManagerPlate(seleniumUtil);
        Thread.sleep(2000);
        HelperManagerLoginPage.managerLogin(seleniumUtil,"password");
        Thread.sleep(2000);
        HelperAddPlatePage.addPlate(seleniumUtil);
    }
}
