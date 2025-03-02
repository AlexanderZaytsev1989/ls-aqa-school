package ru.ls.qa.school.addressbook.tests;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.ls.qa.school.addressbook.model.GroupData;

public class GroupModificationTests extends TestBase {

    @BeforeEach
    public void precondition() {
        page.groupPage()
                .goToGroupPage();
        if(! app.getGroupHelper().isThereAGroup()){
            app.getGroupHelper().createGroup(new GroupData(
                    "test1",
                    null,
                    null));
        }
    }
    @Test
    public void testGroupModification() {

    page.mainPage()
            .goToGroupPage()
            .selectGroup()
            .initGroupModification()
            .fillGroupForm(new GroupData(
            "test 1",
            "test 3",
            "test4"))
            .submitGroupModification().goToGroupPage();
    }
}
