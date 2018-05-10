package testCase.t1;

import Seleniumutil.LogConfiguration;
import Seleniumutil.ReadBrowser;
import Seleniumutil.SeleniumUtil;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.io.IOException;


/**
 * Created by admin on 2018/5/8.
 */
public class BasicTestCase {
    Logger logger =Logger.getLogger(BasicTestCase.class);
   public WebDriver we = null;
   public SeleniumUtil seleniumUtil = new SeleniumUtil();
    @BeforeClass
    public void setUp() throws IOException {

        LogConfiguration.initLog();
        ReadBrowser readBrowser = new ReadBrowser();
        readBrowser.read();
        //System.setProperty("webdriver.gecko.driver","J:\\google\\deiver\\driver\\geckodriver.exe");
        System.setProperty("webdriver.chrome.driver","J:\\google\\deiver\\driver\\chromedriver.exe");
        we=seleniumUtil.getWebd(readBrowser.driver);
        seleniumUtil.urlOpean(readBrowser.url2);
    }

    @AfterClass
    public void teatDown(){
      //  we.quit();
        logger.info("driver成功关闭");

    }
}
