package ru.ls.qa.school.addressbook.pages;

import ru.ls.qa.school.addressbook.appmanager.ApplicationManager;
import ru.ls.qa.school.addressbook.model.GroupData;

public class GroupModificationTestsPage extends HeadAbsPages {
    public GroupModificationTestsPage(ApplicationManager app) {

        super(app);
    }

    public GroupModificationTestsPage goToGroupPage() {
        app.getNavigationHelper().goToGroupPage();

        return this;
    }

    public GroupModificationTestsPage selectGroup() {
        app.getGroupHelper().selectGroup();

        return this;
    }

    public GroupModificationTestsPage initGroupModification() {
        app.getGroupHelper().initGroupModification();

        return this;
    }

    public GroupModificationTestsPage fillGroupForm() {
        app.getGroupHelper().fillGroupForm(new GroupData("test1", "test1", "test1"));

        return this;
    }

    public GroupModificationTestsPage submitGroupModification() {
        app.getGroupHelper().submitGroupModification();

        return this;
    }

    public GroupModificationTestsPage returnToGroupPage() {
        app.getGroupHelper().returnToGroupPage();

        return this;
    }

}
