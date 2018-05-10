package testCase.t4;

import org.testng.annotations.Test;
import pageHelper.HelperAnswerVoteTest;
import pageHelper.HelperLoginHelper;
import testCase.t1.BasicTestCase;

/**
 * Created by admin on 2018/5/9.
 */
public class VoteTest extends BasicTestCase{
    @Test
    public void voteArticle() throws InterruptedException {
        HelperLoginHelper.login(seleniumUtil,"duanjiangtao","duanjiangtao");
        Thread.sleep(3000);
        HelperAnswerVoteTest.voteArticle(seleniumUtil);
    }
}
