package testCase.t2;

import org.testng.annotations.Test;
import pageHelper.HelperExitTest;
import pageHelper.HelperLoginHelper;
import pageHelper.HelperModelManagerTest;
import testCase.t1.BasicTestCase;

/**
 * Created by admin on 2018/5/8.
 */
public class ExitManagerTest extends BasicTestCase{

    @Test
    public  void exitManager(){

        try {
            Thread.sleep(5000);
            HelperModelManagerTest.newModel(seleniumUtil,"admin","分区","main");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        seleniumUtil.backHome();
       HelperExitTest.exit(seleniumUtil);
        we.close();
    }

}
