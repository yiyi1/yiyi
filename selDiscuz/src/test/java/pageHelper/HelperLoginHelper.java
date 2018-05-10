package pageHelper;

/**
 * Created by admin on 2018/5/8.
 */
import page.PageLogin;
import Seleniumutil.SeleniumUtil;
import page.Pageexit;

public class HelperLoginHelper {

    //输入用户名
    public static void inputUser(SeleniumUtil seleniumutil,String name){
        seleniumutil.waitForElementLoad(PageLogin.LOGIN_INPUT_USER,10);
        seleniumutil.sendKeys(PageLogin.LOGIN_INPUT_USER,name);
    }

    //输入密码
    public static  void inputPass(SeleniumUtil seleniumutil,String pass){
        seleniumutil.waitForElementLoad(PageLogin.LOGIN_INPUT_PASS,10);
        seleniumutil.sendKeys(PageLogin.LOGIN_INPUT_PASS,pass);

    }
    //点击登录按钮
    public static  void clickButtonLogin(SeleniumUtil seleniumutil){
        seleniumutil.waitForElementLoad(PageLogin.LOGIN_BUTTON_LOGIN,10);
        seleniumutil.clickElement(PageLogin.LOGIN_BUTTON_LOGIN);
    }

    //点击登录
    public static  void  login(SeleniumUtil seleniumutil,String name,String pass){
        inputUser(seleniumutil,name);
        inputPass(seleniumutil,pass);
        clickButtonLogin(seleniumutil);

    }

}
