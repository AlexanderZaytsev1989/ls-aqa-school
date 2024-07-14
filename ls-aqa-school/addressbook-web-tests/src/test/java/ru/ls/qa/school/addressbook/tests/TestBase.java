package ru.ls.qa.school.addressbook.tests;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import ru.ls.qa.school.addressbook.appmanager.ApplicationManager;
import ru.ls.qa.school.addressbook.pages.GroupCreationTestsPage;
import ru.ls.qa.school.addressbook.pages.GroupModificationTestsPage;

public class TestBase {

    protected static final ApplicationManager app = new ApplicationManager();

    GroupCreationTestsPage groupCreationTestsPage = new GroupCreationTestsPage(app);

    GroupModificationTestsPage groupModificationTestsPage = new GroupModificationTestsPage(app);

    @BeforeAll
    public static void setUp() { app.init(); }

    @AfterAll
    public static void tearDown() {
    }

    public ApplicationManager getApp() {
        return app;
    }
}
