package pageHelper;

import page.PageSearchPlate;
import util.SeleniumUtil;

/**
 * Created by PC on 2018/5/8.
 */
public class HelperSearchPage {

    /*输入搜索内容*/
    public static void inputSearch(SeleniumUtil seleniumUtil,String searchContent){
        seleniumUtil.sendKeys(PageSearchPlate.SEARCH_PLATE_CONTENT,searchContent);
    }
    /*点击搜索按钮*/
    public static void clickSearch(SeleniumUtil seleniumUtil){
        seleniumUtil.click(PageSearchPlate.SEARCH_PLATE_CLICK);
    }
    /*进入帖子*/
    public static void clickSearchPlate(SeleniumUtil seleniumUtil){
        seleniumUtil.click(PageSearchPlate.SEARCH_PLATE_INPUT);
    }
    /**/
    /*重构搜索方法*/
    public static void searchPlate(SeleniumUtil seleniumUtil,String searchContent) {
        inputSearch(seleniumUtil,searchContent);
        clickSearch(seleniumUtil);
    }
}
