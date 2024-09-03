package ru.ls.qa.school.addressbook.appmanager;

import ru.ls.qa.school.addressbook.model.GroupData;

import java.util.Map;

import static com.codeborne.selenide.Selectors.byLinkText;
import static com.codeborne.selenide.Selectors.byName;
public class GroupHelper extends HelperBase {

    public static void submitGroupForm() {
        click(byName("submit"));
    }

    public static void fillGroupForm(GroupData groupData) {
        type(byName("group_name"), groupData.name());
        type(byName("group_header"), groupData.header());
        type(byName("group_footer"), groupData.footer());
    }

    public static void initGroupCreation() {
        click(byName("new"));
    }

    public static void initGroupModification() { click(byName("edit")); }

    public static void deleteSelectedGroups() {
        click(byName("delete"));
    }

    public static void selectGroup() {
        click(byName("selected[]"));
    }

    public static void submitGroupModification() { click(byName("update")); }
}