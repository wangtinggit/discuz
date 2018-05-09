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
    /*普通用户登录*/
    @Test
    public void login(){
        HelperLoginPage.login(seleniumUtil,"wtt","123456");
    }
    /*用户登录，搜索haotest帖子,进入帖子，判断*/
    @Test
    public void searchPlate() throws InterruptedException {
        login();
        Thread.sleep(3000);
        HelperSearchPage.searchPlate(seleniumUtil,"haotest");
        Thread.sleep(3000);
        seleniumUtil.switchToWindow();
        HelperSearchPage.clickSearchPlate(seleniumUtil);
       seleniumUtil.switchToWindow();
        WebElement title = seleniumUtil.findElement(By.xpath("/html/body/div[7]/div[4]/div[2]/table[1]/tbody/tr/td[2]/h1"));
        seleniumUtil.assertForText(String.valueOf(title),"haotest");
    }
    /*用户退出*/
    @Test
    public void logOut(){
        HelperLoginPage.logOut(seleniumUtil);
    }
}
