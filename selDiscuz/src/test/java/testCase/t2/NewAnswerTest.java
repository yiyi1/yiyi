package testCase.t2;

import org.testng.annotations.Test;
import org.testng.reporters.jq.BannerPanel;
import pageHelper.HelperAnswerTest;
import pageHelper.HelperSendTest;
import testCase.t1.BasicTestCase;

/**
 * Created by admin on 2018/5/8.
 */
public class NewAnswerTest extends BasicTestCase {
    @Test
    public void sendNew() throws InterruptedException {
        HelperAnswerTest.answerA(seleniumUtil,"哈哈哈哈");
    }
}
