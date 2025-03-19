package ru.ls.qa.school.addressbook.tests;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.ls.qa.school.addressbook.model.GroupData;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GroupModificationTests extends TestBase {

    private static int before;

    @BeforeAll
    static void setUp() {
        page.groupListPage
                .goToGroupPage();
        before = app.getGroupHelper().getGroupCount();
    }

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
            int after = app.getGroupHelper().getGroupCount();
            assertEquals(before, after);
    }
}
