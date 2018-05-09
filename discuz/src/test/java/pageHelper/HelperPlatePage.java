package pageHelper;

import page.PageLogin;
import page.PagePlate;
import util.SeleniumUtil;

/**
 * Created by PC on 2018/5/8.
 */
public class HelperPlatePage {
    /*点击默认板块*/
    public static void clickPlate(SeleniumUtil seleniumUtil){
        seleniumUtil.click(PagePlate.DEFAULT_LINK_PLATE);
    }
    /*点击新板块*/
    public static void clickNewPlate(SeleniumUtil seleniumUtil){
        seleniumUtil.click(PagePlate.NEW_CLICK_PLATE);
    }
    /*输入发帖标题*/
    public  static void inputPostTitle(SeleniumUtil seleniumUtil,String postTitle){
        seleniumUtil.sendKeys(PagePlate.DEFAULT_POST_TITLE,postTitle);
    }
    /*输入发帖内容*/
    public  static void inputPostContent(SeleniumUtil seleniumUtil,String postContent){
        seleniumUtil.sendKeys(PagePlate.DEFAULT_POST_CONTENT,postContent);
    }
    /*点击发表帖子*/
    public  static void clickSubmitPost(SeleniumUtil seleniumUtil){
        seleniumUtil.click(PagePlate.DEFAULT_CLICK_POST);
    }
    /*重构发帖方法*/
    public static void submit(SeleniumUtil seleniumUtil,String postTitle,String postContent){
        inputPostTitle(seleniumUtil,postTitle);
        inputPostContent(seleniumUtil,postContent);
        clickSubmitPost(seleniumUtil);
    }
    /*选择一个帖子*/
    public static void choosePost(SeleniumUtil seleniumUtil){
        seleniumUtil.click(PagePlate.DEFAULT_CHOOSE_POST);
    }
    /*输入回帖内容*/
    public static void inpuRreplyPost(SeleniumUtil seleniumUtil,String reply){
        seleniumUtil.sendKeys(PagePlate.DEFAULT_REPLY_POST,reply);
    }
    /*点击回复*/
    public static void clickReplyPost(SeleniumUtil seleniumUtil){
        seleniumUtil.click(PagePlate.DEFAULT_CLICK_REPLY);
    }
    /*重构回帖方法*/
    public static void replyPost(SeleniumUtil seleniumUtil,String reply){
        choosePost(seleniumUtil);
        inpuRreplyPost(seleniumUtil,reply);
        clickReplyPost(seleniumUtil);
    }
    /*点击删除帖子*/
    public static void clickDeletePost(SeleniumUtil seleniumUtil){
        seleniumUtil.click(PagePlate.DEFAULT_DELETE_POST);
        seleniumUtil.click(PagePlate.DEFAULT_DELETE_CLICK);
        seleniumUtil.click(PagePlate.DEFAULT_DELETE_YES);
    }
}
