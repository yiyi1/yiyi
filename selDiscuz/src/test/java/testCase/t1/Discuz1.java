package testCase.t1;

import org.testng.annotations.Test;
import pageHelper.HelperAnswerTest;
import pageHelper.HelperExitTest;
import pageHelper.HelperLoginHelper;
import pageHelper.HelperSendTest;

/**
 * Created by admin on 2018/5/8.
 */
public class Discuz1 extends BasicTestCase {
    @Test
   public void discuz() throws InterruptedException {

       HelperLoginHelper.login(seleniumUtil,"duanjiangtao","duanjiangtao");
       Thread.sleep(3000);
      // HelperSendTest.sendArticles(seleniumUtil,"hello,","好好待我");


        HelperAnswerTest.answerA2(seleniumUtil,"我会的好好地");

//        HelperExitTest.exit(seleniumUtil);


   }
}
