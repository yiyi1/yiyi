package testCase.t3;

import org.testng.annotations.Test;
import pageHelper.HelperLoginHelper;
import pageHelper.HelperSearchTest;
import testCase.t1.BasicTestCase;

/**
 * Created by admin on 2018/5/8.
 */
public class SearchArticleTest extends BasicTestCase
{
    @Test
    public void searchArticle() throws InterruptedException {
        HelperLoginHelper.login(seleniumUtil,"duanjiangtao","duanjiangtao");
        Thread.sleep(2000);
        HelperSearchTest.searchArticle(seleniumUtil,"haoTest");

        Thread.sleep(2000);
        seleniumUtil.getHandles();
        seleniumUtil.getTitle("","");

    }
}
