package ru.ls.qa.school.addressbook.tests;

import org.junit.jupiter.api.Test;
import ru.ls.qa.school.addressbook.appmanager.GroupHelper;
import ru.ls.qa.school.addressbook.appmanager.NavigationHelper;
import ru.ls.qa.school.addressbook.model.GroupData;
import ru.ls.qa.school.addressbook.pages.GroupCreationTestsPage;

public class GroupModificationTests extends TestBase {

    @Test
    public void testGroupModification() {

        groupModificationTestsPage
                .goToGroupPage()
                .selectGroup()
                .initGroupModification()
                .fillGroupForm()
                .submitGroupModification()
                .returnToGroupPage();
    }
}
