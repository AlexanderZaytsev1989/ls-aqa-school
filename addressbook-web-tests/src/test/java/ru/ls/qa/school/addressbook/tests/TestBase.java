package ru.ls.qa.school.addressbook.tests;

import com.codeborne.selenide.Configuration;
import dev.pivozavr.jnotunit.core.GlobalBeforeAndAfterCallBack;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.extension.ExtendWith;
import ru.ls.qa.school.addressbook.appmanager.ApplicationManager;
import ru.ls.qa.school.addressbook.pages.*;
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
