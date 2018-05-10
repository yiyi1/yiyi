package testCase.t2;

import org.testng.annotations.Test;
import org.testng.reporters.jq.BannerPanel;
import pageHelper.HelperLoginHelper;
import pageHelper.HelperModelManagerTest;
import testCase.t1.BasicTestCase;

/**
 * Created by admin on 2018/5/8.
 */
public class NewModelTest extends BasicTestCase {

    @Test
    public void newModel(){
        HelperLoginHelper.login(seleniumUtil,"admin","admin");
        try {
            Thread.sleep(5000);
            HelperModelManagerTest.newModel(seleniumUtil,"admin","分区","main");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
