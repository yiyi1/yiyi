package testCase.t2;

import org.testng.annotations.Test;
import pageHelper.HelperDeleteTest;
import pageHelper.HelperExitTest;
import pageHelper.HelperLoginHelper;
import pageHelper.HelperModelManagerTest;
import testCase.t1.BasicTestCase;

/**
 * Created by admin on 2018/5/8.
 */
public class Discuz2 extends BasicTestCase {
    @Test
    public void discuz() throws InterruptedException {

        HelperLoginHelper.login(seleniumUtil,"admin","admin");
        Thread.sleep(3000);
        HelperDeleteTest.deleteArticle(seleniumUtil,"违法内容");

        HelperModelManagerTest.newModel(seleniumUtil,"admin","分区","main");

        seleniumUtil.backHome();
        Thread.sleep(3000);
        HelperExitTest.exit(seleniumUtil);
        we.close();







    }
}
