package testcase;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import pageHelper.HelperLoginPage;

/**
 * Created by PC on 2018/5/7.
 */
public class LoginPage extends BasicTestCase {
    /*登录*/
    @Test
    public void login() throws InterruptedException {
        HelperLoginPage.login(seleniumUtil,"admin","password");
        Thread.sleep(3000);
        seleniumUtil.getText(By.xpath("//*[@id=\"um\"]/p[1]/strong/a"));
        HelperLoginPage.logout(seleniumUtil);

    }








}
