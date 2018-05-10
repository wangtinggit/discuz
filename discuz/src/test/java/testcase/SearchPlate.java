package testcase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import pageHelper.HelperLoginPage;
import pageHelper.HelperPlatePage;
import pageHelper.HelperSearchPage;

/**
 * Created by PC on 2018/5/8.
 */
public class SearchPlate extends BasicTestCase {
       /*用户登录，搜索haotest帖子,进入帖子，判断*/
    @Test
    public void searchPlate() throws InterruptedException {
        HelperLoginPage.login(seleniumUtil,"wtt","123456");
        HelperSearchPage.searchPlate(seleniumUtil,"haotest");
        seleniumUtil.switchToWindow();
        HelperSearchPage.clickSearchPlate(seleniumUtil);
        seleniumUtil.switchToWindow();
        WebElement title = seleniumUtil.findElement(By.xpath("//*[@id=\"thread_subject\"]"));
        seleniumUtil.assertForText(String.valueOf(title),"haotest");
        HelperLoginPage.logout(seleniumUtil);
    }

}
