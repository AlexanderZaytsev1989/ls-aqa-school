package ru.ls.qa.school.addressbook.pages;

import static ru.ls.qa.school.addressbook.tests.TestBase.app;
import static ru.ls.qa.school.addressbook.tests.TestBase.page;

public class GroupListPage extends HeadAbsPages {

    public GroupCreationPage initGroupCreation() {
        app.getGroupHelper().initGroupCreation();

        return page.groupCreationPage;

    }

    public GroupListPage selectGroup() {
        app.getGroupHelper().selectGroup();

        return this;
    }
    public GroupListPage delitionGroup() {
        app.getGroupHelper().deleteSelectedGroups();

        return this;
    }

    public GroupModificationPage initGroupModification() {
        app.group().initGroupModification();

        return page.groupModificationPage;
    }
}
