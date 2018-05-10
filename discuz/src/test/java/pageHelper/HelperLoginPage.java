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
        seleniumUtil.waitForElementLoad(PageLogin.LOGIN_INPUT_USERNAME);
        seleniumUtil.sendKeys(PageLogin.LOGIN_INPUT_USERNAME,username);
    }
    /*输入密码*/
    public static void inputPassword(SeleniumUtil seleniumUtil,String password){
        seleniumUtil.waitForElementLoad(PageLogin.LOGIN_INPUT_PASSWORD);
        seleniumUtil.sendKeys(PageLogin.LOGIN_INPUT_PASSWORD,password);
    }
    /*点击登录按钮*/
    public static void clickButton(SeleniumUtil seleniumUtil){
        seleniumUtil.waitForElementLoad(PageLogin.LOGIN_CLICK_LOGIN);
        seleniumUtil.click(PageLogin.LOGIN_CLICK_LOGIN);
    }
    /*重构登录方法*/
    public static void login(SeleniumUtil seleniumUtil,String username,String password){
        inputUserName(seleniumUtil,username);
        inputPassword(seleniumUtil,password);
        clickButton(seleniumUtil);
    }
    /*退出登录*/
    public static void logout(SeleniumUtil seleniumUtil){
        seleniumUtil.waitForElementLoad(PageLogin.LOGIN_CLICK_LOGOUT);
        seleniumUtil.click(PageLogin.LOGIN_CLICK_LOGOUT);
    }



}
