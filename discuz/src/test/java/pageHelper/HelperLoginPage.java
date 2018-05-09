package pageHelper;

import org.openqa.selenium.By;
import page.PageLogin;
import util.SeleniumUtil;

/**
 * Created by PC on 2018/5/7.
 */
public class HelperLoginPage {

    /*输入用户名*/
    public static void inputUserName(SeleniumUtil seleniumUtil,String username){
        seleniumUtil.sendKeys(PageLogin.LOGIN_LINK_USERNAME,username);
    }
    /*输入密码*/
    public static void inputPassword(SeleniumUtil seleniumUtil,String password){
        seleniumUtil.sendKeys(PageLogin.LOGIN_LINK_PASSWORD,password);
    }
    /*点击登录按钮*/
    public static void clickButton(SeleniumUtil seleniumUtil){
        seleniumUtil.click(PageLogin.LOGIN_LINK_CLICK);
    }
    /*重构登录方法*/
    public static void login(SeleniumUtil seleniumUtil,String username,String password){
        inputUserName(seleniumUtil,username);
        inputPassword(seleniumUtil,password);
        clickButton(seleniumUtil);
    }
    /*退出登录*/
    public static void logOut(SeleniumUtil seleniumUtil){
        seleniumUtil.click(PageLogin.LOGOUT_LINK_LOGIN);
    }



}
