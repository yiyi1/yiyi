package testCase.t1;

import org.testng.annotations.Test;
import pageHelper.HelperExitTest;

/**
 * Created by admin on 2018/5/8.
 */
public class ExitTest extends BasicTestCase {
    @Test
    public  void exit(){
        HelperExitTest.exit(seleniumUtil);
        logger.info("退出登录成功");

    }
}
