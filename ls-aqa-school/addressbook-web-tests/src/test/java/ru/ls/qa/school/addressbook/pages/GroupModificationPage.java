package ru.ls.qa.school.addressbook.pages;

import ru.ls.qa.school.addressbook.model.GroupData;

import static ru.ls.qa.school.addressbook.tests.TestBase.app;

public class GroupModificationPage extends HeadAbsPages {

    public GroupModificationPage fillGroupForm(GroupData groupData) {
        app.group().fillGroupForm(groupData);

        return this;
    }

    public GroupModificationPage submitGroupModification() {
        app.group().submitGroupModification();

        return this;
    }

}
