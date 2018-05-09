package testcase;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import util.ReadBrowser;
import util.LogConfiguration;
import util.SeleniumUtil;

import java.io.IOException;

/**
 * Created by PC on 2018/5/7.
 */
public class BasicTestCase {
    public SeleniumUtil seleniumUtil = null;

    @BeforeMethod
    public void initTestCase() throws IOException {
        LogConfiguration.initLog();
        seleniumUtil = new SeleniumUtil();
//        ReadBrowser browser = new ReadBrowser();
//        browser.initConf();
        seleniumUtil.getDriver(ReadBrowser.driverName);
        seleniumUtil.getUrl(ReadBrowser.URL);
    }
    /*@AfterMethod
    public void clearTestCase() {
        seleniumUtil.quit();
    }*/
}
