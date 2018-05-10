package pageHelper;

import Seleniumutil.SeleniumUtil;
import page.Pageexit;

/**
 * Created by admin on 2018/5/8.
 */
public class HelperExitTest {
    //用户退出
    public static void exit(SeleniumUtil seleniumUtil){
        seleniumUtil.waitForElementLoad(Pageexit.EXIT_BUTTON_USER,10);
        seleniumUtil.clickElement(Pageexit.EXIT_BUTTON_USER);
    }

    //管理员退出
    public  static  void exitManager(SeleniumUtil seleniumUtil){
        seleniumUtil.waitForElementLoad(Pageexit.EXIT_BUTTON_USER,10);
        seleniumUtil.clickElement(Pageexit.EXIT_BUTTON_USER);
    }
}
