package ru.ls.qa.school.addressbook.tests;

import dev.pivozavr.jnotunit.core.GlobalBeforeAndAfterCallBack;
import org.junit.jupiter.api.extension.ExtendWith;
import ru.ls.qa.school.addressbook.appmanager.ApplicationManager;
import ru.ls.qa.school.addressbook.pages.PageManager;

@ExtendWith(TestBase.class)
public class TestBase implements GlobalBeforeAndAfterCallBack {

    public static final ApplicationManager app = new ApplicationManager("firefox");

    public static PageManager page;


    @Override
    public void beforeAllTests() {
        app.init();
        page = new PageManager();
    }

    @Override
    public void afterAllTests() {

    }
}
