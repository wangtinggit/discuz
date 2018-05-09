package util;

import org.apache.log4j.Logger;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.*;
import java.util.NoSuchElementException;

/**
 * Created by PC on 2018/5/7.
 */
public class SeleniumUtil {
    public static Logger logger = Logger.getLogger(SeleniumUtil.class);
    public WebDriver driver = null;
    /*加载驱动*/
    public WebDriver getDriver(String driverType) throws IOException {
        if("chrome".equalsIgnoreCase(driverType)){
             System.setProperty("webdriver.chrome.driver",".\\tools\\chromedriver.exe");
            driver = new ChromeDriver();
            logger.info("启动chrome浏览器");
        }else if ("firefox".equalsIgnoreCase(driverType)){
            System.setProperty("webdriver.firefox.driver",".\\tools\\geckodriver.exe");
            driver = new FirefoxDriver();
            logger.info("启动Firefox浏览器");
        }else{
            logger.error("不能识别的浏览器");
        }
        return driver;
    }
    /*打开网址*/
    public void getUrl(String url){
        driver.get(url);
        logger.info("打开网址："+url);
    }
    /*返回元素的定位值信息*/
    public String getLocationByElement(WebElement element,String expectText){
        String text = element.toString();
        String expect = null;
        try {
            expect = text.substring(text.indexOf(expectText)+1,text.length()-1);
            logger.info("成功获取元素的定位值"+expect);
        }catch (Exception e){
            e.printStackTrace();
            logger.error("未找到元素的定位值"+expectText);
        }
        return expect;
    }
    /*找页面元素*/
    public WebElement findElement(By by){
        try {
            WebElement element = driver.findElement(by);
            logger.info("找到相对元素："+getLocationByElement(element,">"));
            return element;
        }catch (NoSuchElementException e){
            logger.error("没有找到相应元素");
        }
     return null;
    }
    /*识别一组元素*/
    public List<WebElement> findElements(By by){
        List<WebElement> elements = null;
        elements = driver.findElements(by);
        logger.info("找到一组元素");
        return elements;
    }
    /*清空元素上的内容*/
    public void clear(By by){
        WebElement element = driver.findElement(by);
        element.clear();
        logger.info("清空元素内容"+getLocationByElement(element,">"));
    }
    /*文本框中输入内容*/
    public void sendKeys(By by,String text){
        WebElement element = findElement(by);
        clear(by);
        try{
            element.sendKeys(text);
            logger.info("在元素"+getLocationByElement(element,">")+"成功输入内容:"+text);
        }catch (IllegalArgumentException e){
            e.printStackTrace();
            logger.error("输入内容失败");
        }
    }
    /*对元素做点击操作*/
    public void click(By by){
        WebElement element = findElement(by);
        try{
            element.click();
            logger.info("对元素："+getLocationByElement(element,">")+"做点击操作");
        }catch(StaleElementReferenceException e){
            e.printStackTrace();
            logger.error("点击失败");
        }
    }
    /*获取元素内容*/
    public String getText(By by){
        WebElement element = driver.findElement(by);
        String text = element.getText();
        logger.info("成功获取元素内容："+text);
        return text;
    }
    /*根据title判断当前页面是否是与预期页面*/
    public void assertPage(String expectPage){
        String actual = driver.getTitle();
        try {
            Assert.assertEquals(actual,expectPage);
            logger.info("找到对应title，当前页面正确："+actual);
        }catch (AssertionError e){
            logger.info("预期title是："+expectPage+",但实际title是："+actual);
            Assert.fail("预期title是："+expectPage+",但实际title是："+actual);
        }
    }
    /*判断元素是否存在*/
    public boolean isExit(By element){
        try {
            driver.findElement(element);
            logger.info("元素存在");
            return true;
        }catch (NoSuchElementException e){
            logger.error("元素:"+element.toString()+"不存在");
        }
        return false;
    }
    /*判断文本是否与预期一致*/
    public void assertForText(String actual, String expectText){
        try {
            Assert.assertEquals(actual,expectText);
            logger.info("找到预期文本："+expectText);
        }catch (AssertionError e){
            logger.info("预期文字是："+expectText+",但实际找到的是："+actual);
            Assert.fail("预期文字是："+expectText+",但实际找到的是："+actual);
        }
    }
    /*退出浏览器*/
    public void quit() {
        if (driver != null) {
            driver.quit();
            logger.info("成功退出浏览器");
        } else {
            logger.error("浏览器退出失败");
        }
    }
    /*设置显示等待元素*/
    public void waitForElementLoad(final By by,int timeOut){
        WebDriverWait wait = new WebDriverWait(driver,timeOut,1000);
        try{
            wait.until(new ExpectedCondition<Boolean>() {
                public Boolean apply(WebDriver driver){
                    WebElement element = driver.findElement(by);
                    return element.isDisplayed();
                }
            });
        }catch (TimeoutException e){
            e.printStackTrace();
            logger.error("超时!! " + timeOut+ " 秒之后还没找到元素 [" + by + "]");
            Assert.fail("超时!! " + timeOut + " 秒之后还没找到元素 [" + by + "]");
        }
        logger.info("找到了元素 [" + by + "]");
    }

    /*切换窗口*/
    public void switchToWindow(){
//        先获取当前窗口的句柄，
        String current_handle = driver.getWindowHandle();
//        打开新窗口后获取所有窗口的句柄，
        Set<String> all_handles = driver.getWindowHandles();
//        通过循环判断是不是当前的窗口句柄，
        Iterator<String> it = all_handles.iterator();
        while(it.hasNext()){
            if(it.next() == current_handle){
                continue;
            }
//          跳入新窗口
            WebDriver new_driver = driver.switchTo().window(it.next());
        }

    }

}
