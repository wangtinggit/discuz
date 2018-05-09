package page;

import org.openqa.selenium.By;

/**
 * Created by PC on 2018/5/7.
 */
public class PageLogin {

    /*输入用户名*/
    public static final By LOGIN_LINK_USERNAME = By.id("ls_username");
    /*输入密码*/
    public static final By LOGIN_LINK_PASSWORD = By.id("ls_password");
    /*点击登录*/
    public static final By LOGIN_LINK_CLICK = By.xpath("//*[@id=\"lsform\"]/div/div/table/tbody/tr[2]/td[3]/button");
    /*退出登录*/
    public static final By LOGOUT_LINK_LOGIN = By.linkText("退出");

}
