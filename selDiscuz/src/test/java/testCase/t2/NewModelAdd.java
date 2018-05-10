package testCase.t2;

import org.testng.annotations.Test;
import org.testng.reporters.jq.BannerPanel;
import pageHelper.HelperAnswerTest;
import pageHelper.HelperLoginHelper;
import pageHelper.HelperNewSendTest;
import testCase.t1.BasicTestCase;

/**
 * Created by admin on 2018/5/8.
 */
public class NewModelAdd extends BasicTestCase {

    @Test
    public void newModelAdd() throws InterruptedException {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        HelperLoginHelper.login(seleniumUtil,"duanjiangtao","duanjiangtao");

           Thread.sleep(4000);
        HelperNewSendTest.sendArticles(seleniumUtil,"我爱你","哈哈哈哈，是假的");
        Thread.sleep(2000);


    }
}
