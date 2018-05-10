package page;

import org.openqa.selenium.By;

/**
 * Created by admin on 2018/5/8.
 */
public class PageSeacherArticle {

    //搜索框
    public static final By SEACHER_INPUT_TITLE=By.id("scbar_txt");

    //搜索按钮
    public static final By SEARCHER_BUTTON_SUBMIT=By.id("scbar_btn");

    //查看帖子详情
    public static final By SEARCHER_LINKTEXT_TITLE=By.xpath("//*[@id=\"19\"]/h3/a/strong/font");

    //帖子标题
    public static final By SEARCHER_TITLE_ARTICEL=By.id("thread_subject");
}
