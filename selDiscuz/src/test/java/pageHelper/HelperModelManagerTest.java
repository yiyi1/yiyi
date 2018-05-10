package pageHelper;

import Seleniumutil.SeleniumUtil;
import page.PageModelManager;

/**
 * Created by admin on 2018/5/8.
 */
public class HelperModelManagerTest {
    //进入管理中心
    public static void clickManager(SeleniumUtil seleniumUtil){
        seleniumUtil.waitForElementLoad(PageModelManager.MANAGER_LINKTEXT_MANAGER,10);
        seleniumUtil.clickElement(PageModelManager.MANAGER_LINKTEXT_MANAGER);
    }

//    //输入密码
//    public static void inputPass(SeleniumUtil seleniumUtil,String pass){
//        seleniumUtil.sendKeys(PageModelManager.MANAGER_INPUT_PASS,pass);
//    }

//    //登录
//    public static  void clickSubmit(SeleniumUtil seleniumUtil){
//        seleniumUtil.clickElement(PageModelManager.MANAGER_BUTTON_SUBMIT);
//    }

    //进入论坛版块
    public static  void  clickDiscuz(SeleniumUtil seleniumUtil){
        seleniumUtil.waitForElementLoad(PageModelManager.MANAGER_LINKTEXT_DISCIZ,10);
        seleniumUtil.clickElement(PageModelManager.MANAGER_LINKTEXT_DISCIZ);
    }

    //点击添加新模块
    public  static  void clickNew(SeleniumUtil seleniumUtil){
        seleniumUtil.waitForElementLoad(PageModelManager.MANAGER_LINKTEXT_ADDMODEL,10);
        seleniumUtil.clickElement(PageModelManager.MANAGER_LINKTEXT_ADDMODEL);
    }

    //输入名称
    public  static  void inputName(SeleniumUtil seleniumUtil ,String name){
        seleniumUtil.waitForElementLoad(PageModelManager.MANAGER_INPUT_NAME,10);
        seleniumUtil.sendKeys(PageModelManager.MANAGER_INPUT_NAME,name);
    }

    //提交新模块
    public static  void clickSubmitNew(SeleniumUtil seleniumUtil){
        seleniumUtil.waitForElementLoad(PageModelManager.MANAGER_BUTTON_SUBMITNEWMODEL,10);
        seleniumUtil.clickElement(PageModelManager.MANAGER_BUTTON_SUBMITNEWMODEL);
    }

    //新建模板的全流程
    public static  void newModel(SeleniumUtil seleniumUtil,String name,String pass,String frame) throws InterruptedException {
        clickManager(seleniumUtil);

        //inputPass(seleniumUtil,pass);

      //  clickSubmit(seleniumUtil);

        seleniumUtil.getHandles();
        clickDiscuz(seleniumUtil);
        seleniumUtil.getIframe(frame);
        clickNew(seleniumUtil);
        inputName(seleniumUtil,name);
        clickSubmitNew(seleniumUtil);

    }
}
