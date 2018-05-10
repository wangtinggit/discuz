package testcase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
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
        HelperManagerLoginPage.clickManagerPlate(seleniumUtil);
        HelperManagerLoginPage.managerLogin(seleniumUtil,"password");
        seleniumUtil.assertPage("Discuz! Board 管理中心 - 首页");


    }



}
