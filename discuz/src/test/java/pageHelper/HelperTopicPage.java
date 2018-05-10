package pageHelper;

import page.PageTopic;
import util.SeleniumUtil;

/**
 * Created by PC on 2018/5/8.
 */
public class HelperTopicPage {
    /*点击发帖*/
    public static void clickSendPlate(SeleniumUtil seleniumUtil){
        seleniumUtil.waitForElementLoad(PageTopic.TOPIC_LINK_PLATE);
        seleniumUtil.click(PageTopic.TOPIC_LINK_PLATE);
    }
    /*点击发起投票*/
    public static void clickTopicPlate(SeleniumUtil seleniumUtil){
        seleniumUtil.waitForElementLoad(PageTopic.TOPIC_CLICK_TOPIC);
        seleniumUtil.click(PageTopic.TOPIC_CLICK_TOPIC);
    }
    /*输入标题*/
    public static void inputTopicTitle(SeleniumUtil seleniumUtil,String title){
        seleniumUtil.waitForElementLoad(PageTopic.TOPIC_PLATE_TITLE);
        seleniumUtil.sendKeys(PageTopic.TOPIC_PLATE_TITLE,title);
    }
    /*输入选项*/
    public static void inputOptionOne(SeleniumUtil seleniumUtil,String textOne){
        seleniumUtil.waitForElementLoad(PageTopic.TOPIC_INPUT_OPTIONF);
        seleniumUtil.sendKeys(PageTopic.TOPIC_INPUT_OPTIONF,textOne);
    }
    public static void inputOptionTwo(SeleniumUtil seleniumUtil,String textTwo){
        seleniumUtil.waitForElementLoad(PageTopic.TOPIC_INPUT_OPTIONS);
        seleniumUtil.sendKeys(PageTopic.TOPIC_INPUT_OPTIONS,textTwo);
    }
    public static void inputOptionThree(SeleniumUtil seleniumUtil,String textThree){
        seleniumUtil.waitForElementLoad(PageTopic.TOPIC_INPUT_OPTIONT);
        seleniumUtil.sendKeys(PageTopic.TOPIC_INPUT_OPTIONT,textThree);
    }
    /*输入内容*/
    public static void inputTopicContent(SeleniumUtil seleniumUtil,String content){
        seleniumUtil.waitForElementLoad(PageTopic.TOPIC_PLATE_CONTENT);
        seleniumUtil.sendKeys(PageTopic.TOPIC_PLATE_CONTENT,content);
    }
    /*点击发起投票*/
    public static void clickTopicSubmit(SeleniumUtil seleniumUtil){
        seleniumUtil.waitForElementLoad(PageTopic.TOPIC_CLICK_SUBMIT);
        seleniumUtil.click(PageTopic.TOPIC_CLICK_SUBMIT);
    }
    /*重构选项方法*/
    public static void inputOptions(SeleniumUtil seleniumUtil,String textOne,String textTwo,String textThree){
        inputOptionOne(seleniumUtil,textOne);
        inputOptionTwo(seleniumUtil,textTwo);
        inputOptionThree(seleniumUtil,textThree);
    }

}
