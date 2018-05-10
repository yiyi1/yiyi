package testCase.t2;

import org.testng.annotations.Test;
import pageHelper.HelperExitTest;
import pageHelper.HelperLoginHelper;
import testCase.t1.BasicTestCase;

/**
 * Created by admin on 2018/5/8.
 */
public class UserLoginTest extends BasicTestCase{

    @Test
    public void loginUser() throws InterruptedException {
        Thread.sleep(3000);
        seleniumUtil.getHandles();
        Thread.sleep(3000);
        HelperExitTest.exit(seleniumUtil);
        Thread.sleep(5000);
        HelperLoginHelper.login(seleniumUtil,"duanjiangtao","duanjiangtao");


    }

}
