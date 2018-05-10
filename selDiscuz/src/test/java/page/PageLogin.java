package page;

import org.openqa.selenium.By;

/**
 * Created by admin on 2018/5/8.
 */
public class PageLogin {

    //用户名
    public static final By LOGIN_INPUT_USER = By.id("ls_username");

    //密码
    public static final By LOGIN_INPUT_PASS = By.id("ls_password");

    //登录按钮
    public static final By LOGIN_BUTTON_LOGIN = By.xpath("/html/body/div[5]/div/div[1]/form/div/div/table/tbody/tr[2]/td[3]/button");


}