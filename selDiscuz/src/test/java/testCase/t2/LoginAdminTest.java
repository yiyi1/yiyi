package testCase.t2;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import pageHelper.HelperLoginHelper;
import testCase.t1.BasicTestCase;

/**
 * Created by admin on 2018/5/8.
 */
public class LoginAdminTest extends BasicTestCase{

    @Test
    public void loginManager(){
        HelperLoginHelper.login(seleniumUtil,"admin","admin");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        String text= seleniumUtil.findElement(By.xpath("//*[@id=\"online\"]/div/h3/span/strong[2]")).getText();
        Assert.assertEquals(text,"1","登录成功");

    }
}
