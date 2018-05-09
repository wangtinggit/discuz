package page;

import org.openqa.selenium.By;

/**
 * Created by PC on 2018/5/8.
 */
public class PageManagerLogin {

    /*点击进入管理中心*/
    public static final By CLICK_PLATE_MANAGE = By.linkText("管理中心");
    /*输入管理员密码*/
    public static final By LOGIN_MANAGER_PASSWORD = By.xpath("/html/body/table[1]/tbody/tr/td[2]/form/p[4]/input");
    /*点击提交*/
    public static final By LOGIN_MANAGER_CLICK = By.name("submit");

    /*管理员退出*/
    public static final By LOGOUT_MANAGER_CLICK = By.linkText("退出");
    public static final By LOGOUT_MANAGER_LOGOUT = By.linkText("退出");

}
