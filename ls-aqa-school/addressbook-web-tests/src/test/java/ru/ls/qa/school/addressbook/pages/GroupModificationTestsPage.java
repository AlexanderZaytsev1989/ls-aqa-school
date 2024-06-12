package ru.ls.qa.school.addressbook.pages;

import org.junit.jupiter.api.Test;
import ru.ls.qa.school.addressbook.appmanager.GroupHelper;
import ru.ls.qa.school.addressbook.appmanager.NavigationHelper;
import ru.ls.qa.school.addressbook.model.GroupData;
import ru.ls.qa.school.addressbook.tests.TestBase;

public class GroupModificationTestsPage extends TestBase {
    @Test
    public void testGroupModification() {
        NavigationHelper.goToGroupPage();
        GroupHelper.selectGroup();
        GroupHelper.initGroupModification();
        GroupHelper.fillGroupForm(new GroupData("test1", "test2", "test3"));
        GroupHelper.submitGroupModification();
        GroupHelper.returnToGroupPage();
    }
}
