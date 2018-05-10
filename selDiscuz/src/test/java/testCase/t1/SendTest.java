package testCase.t1;

import org.testng.annotations.Test;
import pageHelper.HelperSendTest;

/**
 * Created by admin on 2018/5/8.
 */
public class SendTest extends BasicTestCase {

    @Test
    public void sendArticle(){

        HelperSendTest.sendArticles(seleniumUtil,"再见，过去","过去的日子再美好，也只是曾经");
}

}
