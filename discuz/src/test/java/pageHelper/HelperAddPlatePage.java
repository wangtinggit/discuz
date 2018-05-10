package pageHelper;

import page.PageManage;
import util.SeleniumUtil;

/**
 * Created by PC on 2018/5/8.
 */
public class HelperAddPlatePage {
    /*点击论坛*/
    public static void clickForum(SeleniumUtil seleniumUtil){
        seleniumUtil.waitForElementLoad(PageManage.MANAGE_CLICK_FORUM);
       seleniumUtil.click(PageManage.MANAGE_CLICK_FORUM);
    }
    /*点击创建新版块*/
    public static void addNewPlate(SeleniumUtil seleniumUtil){
        seleniumUtil.waitForElementLoad(PageManage.MANAGE_ADD_PLATE);
        seleniumUtil.click(PageManage.MANAGE_ADD_PLATE);
    }
    /*点击提交*/
    public static void addPlateSubmit(SeleniumUtil seleniumUtil){
        seleniumUtil.waitForElementLoad(PageManage.MANAGE_CLICK_SUNMIT);
        seleniumUtil.click(PageManage.MANAGE_CLICK_SUNMIT);
    }
    /*重构添加新版块方法*/
    public static void addPlate(SeleniumUtil seleniumUtil){
        clickForum(seleniumUtil);
        seleniumUtil.iframe("main");
        addNewPlate(seleniumUtil);
        addPlateSubmit(seleniumUtil);
    }
}
