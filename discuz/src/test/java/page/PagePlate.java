package page;

import org.openqa.selenium.By;

/**
 * Created by PC on 2018/5/8.
 */
public class PagePlate {
    /*点击默认板块*/
    public static final By DEFAULT_LINK_PLATE = By.linkText("默认版块");
    /*点击新版块*/
    public static final By NEW_CLICK_PLATE = By.linkText("新版块名称");
    /*输入发帖标题*/
    public static final By DEFAULT_POST_TITLE = By.id("subject");
    /*输入发帖内容*/
    public static final By DEFAULT_POST_CONTENT = By.id("fastpostmessage");
    /*点击发表帖子*/
    public static final By DEFAULT_CLICK_POST = By.id("fastpostsubmit");
    /*选择一个帖子*/
    public static final By DEFAULT_CHOOSE_POST = By.xpath("/html/body/div[7]/div[4]/div/div/div[4]/div[2]/form/table/tbody[2]/tr/th/a[2]");
    /*输入回帖内容*/
    public static final By DEFAULT_REPLY_POST = By.className("pt");
    /*点击回复*/
    public static final By DEFAULT_CLICK_REPLY = By.name("replysubmit");
    /*选择一个要删除的帖子*/
    public static final By DEFAULT_DELETE_POST = By.name("moderate[]");
    /*点击删除*/
    public static final By DEFAULT_DELETE_CLICK = By.linkText("删除");
    /*点击确定删除*/
    public static final By DEFAULT_DELETE_YES = By.name("modsubmit");

}
