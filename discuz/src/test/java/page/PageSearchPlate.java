package page;

import org.openqa.selenium.By;

/**
 * Created by PC on 2018/5/8.
 */
public class PageSearchPlate {
    /*定位搜索文本框*/
    public static final By SEARCH_PLATE_CONTENT = By.id("scbar_txt");
    /*定位搜索按钮*/
    public static final By SEARCH_PLATE_CLICK = By.id("scbar_btn");
    /*进入帖子*/
    public static final By SEARCH_PLATE_INPUT = By.xpath("/html/body/div[5]/div/div/div[2]/ul/li/h3/a");
    /*查找帖子标题*/
    public static final By SEARCH_PLATE_TITLE = By.id("thread_subject");
}
