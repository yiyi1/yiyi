package Seleniumutil;

import org.apache.log4j.PropertyConfigurator;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;


//import org.apache.log4j.PropertyConfigurator;

/**
 * Created by admin on 2018/5/7.
 */
public class LogConfiguration {

    public static  void initLog() {

    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yy_MM_dd_HH_mm_ss");
    String date = simpleDateFormat.format(new Date());
    String file = "./Log/" + date + ".log";
    Properties properties = new Properties();
        properties.setProperty("log4j.rootLogger","info,toConsole,toFile");
        properties.setProperty("log4j.appender.toConsole","org.apache.log4j.ConsoleAppender");
        properties.setProperty("log4j.appender.toConsole.layout","org.apache.log4j.PatternLayout");
        properties.setProperty("log4j.appender.toConsole.layout.ConversionPattern","[%d{yyyy-MM-dd HH:mm:ss}] [%p] %m%n");
        properties.setProperty("log4j.appender.toFile","org.apache.log4j.DailyRollingFileAppender");
        properties.setProperty("log4j.appender.toFile.layout","org.apache.log4j.PatternLayout");
        properties.setProperty("log4j.appender.toFile.layout.ConversionPattern","[%d{yyyy-MM-dd HH:mm:ss}] [%p] %m%n");
        properties.setProperty("log4j.appender.toFile.file",file);

        PropertyConfigurator.configure(properties);
    }
}
