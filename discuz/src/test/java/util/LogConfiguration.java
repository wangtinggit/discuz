package util;

import org.apache.log4j.PropertyConfigurator;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;

/**
 * Created by PC on 2018/5/7.
 */
public class LogConfiguration {

    public static void initLog(){
        /*指定日期生成的格式*/
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy_MM_dd HH_mm_ss");
        /*获取日期*/
        String date = dateFormat.format(new Date());
        /*将日志文件存放在指定路径*/
        String path = "./log/"+date+".log";
        /*创建对象*/
        Properties properties = new Properties();
        /*配置日志输出格式*/
        properties.setProperty("log4j.rootLogger","info,toConsole,toFile");

        properties.setProperty("log4j.appender.toConsole","org.apache.log4j.ConsoleAppender");
        properties.setProperty("log4j.appender.toConsole.layout","org.apache.log4j.PatternLayout");
        properties.setProperty("log4j.appender.toConsole.layout.ConversionPattern","[%d{yyyy-MM-dd HH:mm:ss}] [%p] %m%n");

        properties.setProperty("log4j.appender.toFile","org.apache.log4j.DailyRollingFileAppender");
        properties.setProperty("log4j.appender.toFile.layout","org.apache.log4j.PatternLayout");
        properties.setProperty("log4j.appender.toFile.layout.ConversionPattern","[%d{yyyy-MM-dd HH:mm:ss}] [%p] %m%n");
        properties.setProperty("log4j.appender.toFile.file",path);
        /*使配置生效*/
        PropertyConfigurator.configure(properties);
    }
}
