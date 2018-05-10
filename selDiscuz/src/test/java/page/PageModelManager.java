package page;

import org.openqa.selenium.By;

/**
 * Created by admin on 2018/5/8.
 */
public class PageModelManager {
    //管理中心
    public  static final By MANAGER_LINKTEXT_MANAGER=By.linkText("管理中心");

//    //密码
//    public static final By MANAGER_INPUT_PASS=By.name("admin_password");

//    //提交
//    public static  final  By MANAGER_BUTTON_SUBMIT=By.name("submit");

    //论坛
    public static final By MANAGER_LINKTEXT_DISCIZ=By.linkText("论坛");

    //添加新版块
    public static final By MANAGER_LINKTEXT_ADDMODEL=By.linkText("添加新版块");

    //新版块名称
    public static final  By MANAGER_INPUT_NAME=By.xpath("//*[@id=\"cpform\"]/table/tbody[3]/tr[1]/td[3]/div/input");

    //提交
    public static final By MANAGER_BUTTON_SUBMITNEWMODEL=By.id("submit_editsubmit");
}
