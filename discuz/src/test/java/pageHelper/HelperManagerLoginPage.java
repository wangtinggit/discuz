package pageHelper;

import page.PageManagerLogin;
import util.SeleniumUtil;

/**
 * Created by PC on 2018/5/8.
 */
public class HelperManagerLoginPage {
    /*点击进入管理中心*/
    public static void clickManagerPlate(SeleniumUtil seleniumUtil){
        seleniumUtil.waitForElementLoad(PageManagerLogin.MANAGE_LINK_PLATE);
        seleniumUtil.click(PageManagerLogin.MANAGE_LINK_PLATE);
    }
    /*输入管理员密码*/
    public static void inputManagerPwd(SeleniumUtil seleniumUtil,String magPwd){
        seleniumUtil.waitForElementLoad(PageManagerLogin.LOGIN_INPUT_MAGPWD);
        seleniumUtil.sendKeys(PageManagerLogin.LOGIN_INPUT_MAGPWD,magPwd);
    }
    /*点击提交*/
    public static void clickManagerSubmit(SeleniumUtil seleniumUtil){
        seleniumUtil.waitForElementLoad(PageManagerLogin.LOGIN_CLICK_SUBMIT);
        seleniumUtil.click(PageManagerLogin.LOGIN_CLICK_SUBMIT);
    }
    /*重构管理员登录*/
    public static void managerLogin(SeleniumUtil seleniumUtil,String magPwd){
        seleniumUtil.switchToWindow();
        inputManagerPwd(seleniumUtil,magPwd);
        clickManagerSubmit(seleniumUtil);
    }
    /*管理员退出*/
    public static void maglogout(SeleniumUtil seleniumUtil){
        seleniumUtil.waitForElementLoad(PageManagerLogin.LOGOUT_CLICK_MANAGER);
        seleniumUtil.click(PageManagerLogin.LOGOUT_CLICK_MANAGER);
    }
}
