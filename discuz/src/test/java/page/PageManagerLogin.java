package page;

import org.openqa.selenium.By;

/**
 * Created by PC on 2018/5/8.
 */
public class PageManagerLogin {

    /*点击进入管理中心*/
    public static final By MANAGE_LINK_PLATE = By.xpath("//*[@id=\"um\"]/p[1]/a[6]");
    /*输入管理员密码*/
    public static final By LOGIN_INPUT_MAGPWD = By.xpath("/html/body/table[1]/tbody/tr/td[2]/form/p[4]/input");
    /*点击提交*/
    public static final By LOGIN_CLICK_SUBMIT = By.name("submit");

    /*后台管理员退出*/
    public static final By LOGOUT_CLICK_MANAGER = By.linkText("退出");

}
