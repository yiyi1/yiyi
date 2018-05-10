package testCase.t3;

import Seleniumutil.SeleniumUtil;
import org.testng.annotations.Test;
import pageHelper.HelperExitTest;
import pageHelper.HelperLoginHelper;
import pageHelper.HelperSearchTest;
import testCase.t1.BasicTestCase;

/**
 * Created by admin on 2018/5/8.
 */
public class Discuz3 extends BasicTestCase{
    @Test
    public void search() throws InterruptedException {
        HelperLoginHelper.login(seleniumUtil,"duanjiangtao","duanjiangtao");
        Thread.sleep(5000);
        HelperSearchTest.searchArticle(seleniumUtil,"haoTest");

        seleniumUtil.getHandles();

        HelperSearchTest.lookUpArticle(seleniumUtil);
        seleniumUtil.getHandles();

        HelperSearchTest.getTitle(seleniumUtil,"haoTest");
        HelperExitTest.exit(seleniumUtil);
    }
}
