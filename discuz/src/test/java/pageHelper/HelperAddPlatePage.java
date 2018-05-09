package pageHelper;

import page.PageManage;
import util.SeleniumUtil;

/**
 * Created by PC on 2018/5/8.
 */
public class HelperAddPlatePage {
    /*点击论坛*/
    public static void clickForum(SeleniumUtil seleniumUtil){
        seleniumUtil.click(PageManage.MANAGE_CLICK_FORUM);
    }
    /*点击创建新版块*/
    public static void addNewPlate(SeleniumUtil seleniumUtil){
        seleniumUtil.click(PageManage.MANAGE_NEW_PLATE);
    }
    /*点击提交*/
    public static void addPlateSubmit(SeleniumUtil seleniumUtil){
        seleniumUtil.click(PageManage.MANAGE_NEW_PLATE);
    }
    /*重构添加新版块方法*/
    public static void addPlate(SeleniumUtil seleniumUtil){
        clickForum(seleniumUtil);
        addNewPlate(seleniumUtil);
        addPlateSubmit(seleniumUtil);
    }
}
