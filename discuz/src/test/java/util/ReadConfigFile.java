package util;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * Created by PC on 2018/5/8.
 */
public class ReadConfigFile {
    public static String driverName;
    public static  String URL;
    public static void initConf() throws IOException {
        Properties p = new Properties();
        /*加载配置文件*/
        InputStream inputStream = new FileInputStream(".\\configuration");
        p.load(inputStream);
        driverName = p.getProperty("driverName");
        URL =  p.getProperty("url");
        inputStream.close();
    }
    static {
        try {
            ReadConfigFile.initConf();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
