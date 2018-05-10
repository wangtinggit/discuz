package page;

import org.openqa.selenium.By;

/**
 * Created by PC on 2018/5/8.
 */
public class PageSearchPlate {
    /*定位搜索文本框*/
    public static final By SEARCH_INPUT_CONTENT = By.xpath("//*[@id=\"scbar_txt\"]");
    /*定位搜索按钮*/
    public static final By SEARCH_PLATE_CLICK = By.id("scbar_btn");
    /*进入帖子*/
    public static final By SEARCH_LINK_POST = By.xpath("//*[@id=\"7\"]/h3/a/strong/font");

}
