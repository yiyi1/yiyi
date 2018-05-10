package pageHelper;

import Seleniumutil.SeleniumUtil;
import page.PageSeacherArticle;

/**
 * Created by admin on 2018/5/8.
 */
public class HelperSearchTest {
    //输入查询的内容
    public static void inputContent(SeleniumUtil seleniumUtil,String text){
        seleniumUtil.waitForElementLoad(PageSeacherArticle.SEACHER_INPUT_TITLE,10);
        seleniumUtil.sendKeys(PageSeacherArticle.SEACHER_INPUT_TITLE,text);
    }

    //点击查询
    public static void  clickSearch(SeleniumUtil seleniumUtil){
        seleniumUtil.waitForElementLoad(PageSeacherArticle.SEARCHER_BUTTON_SUBMIT,10);
        seleniumUtil.clickElement(PageSeacherArticle.SEARCHER_BUTTON_SUBMIT);
    }

    //查看详情
    public static  void lookUpArticle(SeleniumUtil seleniumUtil){
        seleniumUtil.waitForElementLoad(PageSeacherArticle.SEARCHER_LINKTEXT_TITLE,10);
        seleniumUtil.clickElement(PageSeacherArticle.SEARCHER_LINKTEXT_TITLE);
    }
    //获得帖子的标题
    public static  void getTitle(SeleniumUtil seleniumUtil,String text){
        seleniumUtil.waitForElementLoad(PageSeacherArticle.SEARCHER_TITLE_ARTICEL,10);
        seleniumUtil.isSameText(PageSeacherArticle.SEARCHER_TITLE_ARTICEL,text);
    }

    //查询全过程
    public static void searchArticle(SeleniumUtil seleniumUtil,String text){

        inputContent(seleniumUtil,text);
        clickSearch(seleniumUtil);
    }
}

