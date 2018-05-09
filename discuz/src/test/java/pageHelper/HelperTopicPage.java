package pageHelper;

import page.PageTopic;
import util.SeleniumUtil;

/**
 * Created by PC on 2018/5/8.
 */
public class HelperTopicPage {
    /*点击发起投票*/
    public static void clickTopicPlate(SeleniumUtil seleniumUtil){
        seleniumUtil.click(PageTopic.DEFAULT_TOPIC_PLATE);
    }

}
