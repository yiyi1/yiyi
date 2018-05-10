package testCase.t1;

import org.testng.annotations.Test;
import pageHelper.HelperLoginHelper;

/**
 * Created by admin on 2018/5/8.
 */
public class LoginTest extends BasicTestCase {

    @Test
    public void login(){

              HelperLoginHelper.login(seleniumUtil,"duanjiangtao","duanjiangtao");


    }
}
