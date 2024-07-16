package ru.ls.qa.school.addressbook.tests;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import ru.ls.qa.school.addressbook.appmanager.ApplicationManager;
import ru.ls.qa.school.addressbook.pages.*;

public class TestBase {

    protected static final ApplicationManager app = new ApplicationManager();

    GroupCreationTestsPage groupCreationTestsPage = new GroupCreationTestsPage(app);

    GroupModificationTestsPage groupModificationTestsPage = new GroupModificationTestsPage(app);

    ContactCreationTestsPage contactCreationPage = new ContactCreationTestsPage(app);

    ContactModificationTestsPage сontactModificationPage = new ContactModificationTestsPage(app);

    ContactDelitionTestsPage contactDelitionTestsPage = new ContactDelitionTestsPage(app);

    GroupDelitionTestsPage groupDelitionTestsPage = new GroupDelitionTestsPage(app);

    @BeforeAll
    public static void setUp() { app.init(); }

    @AfterAll
    public static void tearDown() {
    }

    public ApplicationManager getApp() {
        return app;
    }
}
