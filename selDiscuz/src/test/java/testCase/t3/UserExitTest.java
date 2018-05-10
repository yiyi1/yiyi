package testCase.t3;

import Seleniumutil.SeleniumUtil;
import org.testng.annotations.Test;
import pageHelper.HelperExitTest;
import pageHelper.HelperLoginHelper;
import testCase.t1.BasicTestCase;

/**
 * Created by admin on 2018/5/8.
 */
public class UserExitTest extends BasicTestCase{
    @Test
    public void exit(SeleniumUtil seleniumUtil) throws InterruptedException {
        HelperLoginHelper.login(seleniumUtil,"duanjiangtao","duanjiangtao");
          Thread.sleep(4000);
        HelperExitTest.exit(seleniumUtil);
    }
}
