package Seleniumutil;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * Created by admin on 2018/5/8.
 */
public class ReadBrowser {

    public String driver;
    public String url2;
    public void read() throws IOException {

        Properties properties = new Properties();
        InputStream inputStream = new FileInputStream(".\\properties");
        properties.load(inputStream);
        driver=properties.getProperty("driver");
        url2=properties.getProperty("url");


    }
}
