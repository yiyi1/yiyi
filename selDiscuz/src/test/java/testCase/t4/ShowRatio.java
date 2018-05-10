package testCase.t4;

import org.testng.annotations.Test;
import pageHelper.HelperLoginHelper;
import pageHelper.HelperSendVoteArticleTest;
import pageHelper.HelperVotegetTest;
import testCase.t1.BasicTestCase;

/**
 * Created by admin on 2018/5/9.
 */
public class ShowRatio extends BasicTestCase{
    @Test
    public void show()  {

        HelperLoginHelper.login(seleniumUtil,"duanjiangtao","duanjiangtao");

        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        HelperSendVoteArticleTest.model(seleniumUtil);

        HelperVotegetTest.getTitle(seleniumUtil);
    }
}
