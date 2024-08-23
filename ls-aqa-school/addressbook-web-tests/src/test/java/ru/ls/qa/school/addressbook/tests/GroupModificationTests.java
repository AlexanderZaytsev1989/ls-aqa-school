package ru.ls.qa.school.addressbook.tests;

import org.junit.jupiter.api.Test;
import ru.ls.qa.school.addressbook.model.GroupData;

public class GroupModificationTests extends TestBase {

    @Test
    public void testGroupModification() {

    page.mainPage().goToGroupPage().selectGroup().initGroupModification().fillGroupForm(new GroupData(
            "test 2",
            "test 3",
            "test4"
    )).submitGroupModification().goToHomePage();
//        groupModificationTestsPage
//                .goToGroupPage()
//                .selectGroup()
//                .initGroupModification()
//                .fillGroupForm()
//                .submitGroupModification()
//                .returnToGroupPage();
    }
}
