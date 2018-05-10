package page;

import org.openqa.selenium.By;

/**
 * Created by PC on 2018/5/8.
 */
public class PageTopic {
    /*点击发帖*/
    public static final By TOPIC_LINK_PLATE = By.xpath("//*[@id=\"newspecial\"]/img");
    /*点击发起投票*/
    public static final By TOPIC_CLICK_TOPIC = By.linkText("发起投票");
    /*投票标题*/
    public static final By TOPIC_PLATE_TITLE = By.id("subject");
    /*选项*/
    public static final By TOPIC_INPUT_OPTIONF = By.xpath("/html/body/div[7]/form/div/div/div[2]/div[4]/div[1]/div[2]/p[1]/input");
    public static final By TOPIC_INPUT_OPTIONS = By.xpath("/html/body/div[7]/form/div/div/div[2]/div[4]/div[1]/div[2]/p[2]/input");
    public static final By TOPIC_INPUT_OPTIONT = By.xpath("/html/body/div[7]/form/div/div/div[2]/div[4]/div[1]/div[2]/p[3]/input");
    /*内容*/
    public static final By TOPIC_PLATE_CONTENT = By.xpath("/html/body");
    /*点击发起投票*/
    public static final By TOPIC_CLICK_SUBMIT = By.xpath("//*[@id=\"postsubmit\"]");

}
