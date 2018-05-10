package testCase.t4;

import org.testng.annotations.Test;
import pageHelper.HelperLoginHelper;
import pageHelper.HelperSendVoteArticleTest;
import testCase.t1.BasicTestCase;

/**
 * Created by admin on 2018/5/9.
 */
public class SendVoteArticleTest extends BasicTestCase{
    @Test
    public void sendArticle() throws InterruptedException {
        HelperLoginHelper.login(seleniumUtil,"duanjiangtao","duanjiangtao");

        Thread.sleep(4000);

        HelperSendVoteArticleTest.sendVote(seleniumUtil,"买一个电视机","买","不买","不发表意见");

    }
}
