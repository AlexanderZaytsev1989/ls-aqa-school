package ru.ls.qa.school.addressbook.pages;

import ru.ls.qa.school.addressbook.appmanager.ApplicationManager;

import static ru.ls.qa.school.addressbook.tests.TestBase.app;
import static ru.ls.qa.school.addressbook.tests.TestBase.page;

public abstract class HeadAbsPages {
    public ContactListPage goToHomePage() {
        app.getContactHelper().goToHomePage();

        return page.contactListPage;
    }

    public GroupListPage goToGroupPage() {
        app.getNavigationHelper().goToGroupPage();

        return page.groupListPage;
    }
}
