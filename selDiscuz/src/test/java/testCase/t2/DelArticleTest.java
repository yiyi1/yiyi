package testCase.t2;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import pageHelper.HelperDeleteTest;
import pageHelper.HelperLoginHelper;
import testCase.t1.BasicTestCase;

/**
 * Created by admin on 2018/5/8.
 */
public class DelArticleTest extends BasicTestCase{
    @Test
    public void deleArticle() throws InterruptedException {
        HelperLoginHelper.login(seleniumUtil,"admin","admin");

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        HelperDeleteTest.deleteArticle(seleniumUtil,"违法内容");

    }
}
