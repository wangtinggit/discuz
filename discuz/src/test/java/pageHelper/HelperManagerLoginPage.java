package pageHelper;

import page.PageManagerLogin;
import util.SeleniumUtil;

/**
 * Created by PC on 2018/5/8.
 */
public class HelperManagerLoginPage {
    /*点击进入管理中心*/
    public static void clickManagerPlate(SeleniumUtil seleniumUtil){
        seleniumUtil.click(PageManagerLogin.CLICK_PLATE_MANAGE);
    }
    /*输入管理员密码*/
    public static void inputManagerPwd(SeleniumUtil seleniumUtil,String magPwd){
        seleniumUtil.sendKeys(PageManagerLogin.LOGIN_MANAGER_PASSWORD,magPwd);
    }
    /*点击提交*/
    public static void clickManagerSubmit(SeleniumUtil seleniumUtil){
        seleniumUtil.click(PageManagerLogin.LOGIN_MANAGER_CLICK);
    }
    /*重构管理员登录*/
    public static void managerLogin(SeleniumUtil seleniumUtil,String magPwd){
        inputManagerPwd(seleniumUtil,magPwd);
        seleniumUtil.switchToWindow();
        clickManagerSubmit(seleniumUtil);
    }
    /*管理员退出*/
    public static void logout(SeleniumUtil seleniumUtil){
        seleniumUtil.click(PageManagerLogin.LOGOUT_MANAGER_CLICK);
        seleniumUtil.click(PageManagerLogin.LOGOUT_MANAGER_LOGOUT);
    }

}
