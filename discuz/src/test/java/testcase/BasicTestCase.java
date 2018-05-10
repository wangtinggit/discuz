package testcase;

import org.testng.annotations.BeforeMethod;
import util.LogConfiguration;
import util.ReadConfigFile;
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
        seleniumUtil.getDriver(ReadConfigFile.driverName);
        seleniumUtil.getUrl(ReadConfigFile.URL);
    }
    /*@AfterMethod
    public void clearTestCase() {
        seleniumUtil.quit();
    }*/
}
