package page;

import org.openqa.selenium.By;

/**
 * Created by PC on 2018/5/8.
 */
public class PagePlate {
    /*点击默认板块*/
    public static final By DEFAULT_LINK_PLATE = By.xpath("//*[@id=\"category_1\"]/table/tbody/tr[1]/td[2]/h2/a");
    /*点击新版块*/
    public static final By NEW_LINK_PLATE = By.linkText("新版块名称");
    /*输入发帖标题*/
    public static final By PUBLISH_INPUT_TITLE = By.id("subject");
    /*输入发帖内容*/
    public static final By PUBLISH_INPUT_CONTENT = By.id("fastpostmessage");
    /*点击发表帖子*/
    public static final By PUBLISH_CLICK_POST = By.id("fastpostsubmit");
    /*选择一个帖子*/
    public static final By REPLY_LINK_POST = By.xpath("//*[@id=\"normalthread_4\"]/tr/th/a[2]");
    /*输入回帖内容*/
    public static final By REPLY_INPUT_CONTENT = By.className("pt");
    /*点击回复*/
    public static final By REPLY_CLICK_POST = By.name("replysubmit");
    /*选择一个要删除的帖子*/
    public static final By DEFAULT_DELETE_POST = By.name("moderate[]");
    /*点击删除*/
    public static final By DEFAULT_DELETE_CLICK = By.linkText("删除");
    /*点击确定删除*/
    public static final By DEFAULT_DELETE_YES = By.name("modsubmit");

}
