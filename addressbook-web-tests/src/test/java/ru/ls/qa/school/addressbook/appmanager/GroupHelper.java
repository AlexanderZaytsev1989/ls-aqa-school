package ru.ls.qa.school.addressbook.appmanager;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import ru.ls.qa.school.addressbook.model.GroupData;

import static com.codeborne.selenide.Selectors.byName;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class GroupHelper extends HelperBase {

    ElementsCollection listGroupCount = $$("[name*=selected]");
    SelenideElement newGroupBtn = $(byName("new"));
    SelenideElement submitNewGroupBtn = $(byName("submit"));
    SelenideElement editGroupBtn = $(byName("edit"));
    SelenideElement deleteGroupBtn = $(byName("delete"));
    SelenideElement selectGroupFlag = $(byName("selected[]"));
    SelenideElement modificationGroupBtn = $(byName("update"));
    SelenideElement groupName = $(byName("group_name"));
    SelenideElement groupHeader = $(byName("group_header"));
    SelenideElement groupFooter = $(byName("group_footer"));


    public void submitGroupForm() {
        click(submitNewGroupBtn);
    }

    public void fillGroupForm(GroupData groupData) {
        type(groupName, groupData.name());
        type(groupHeader, groupData.header());
        type(groupFooter, groupData.footer());
    }

    public void initGroupCreation() {
        click(newGroupBtn);
    }

    public void initGroupModification() {
        click(editGroupBtn);
    }

    public void deleteSelectedGroups() {
        click(deleteGroupBtn);
    }

    public void selectGroup() {
        click(selectGroupFlag);
    }

    public void submitGroupModification() {
        click(modificationGroupBtn);
    }

    public void createGroup(GroupData group) {
        initGroupCreation();
        fillGroupForm(group);
        submitGroupForm();
    }

    public boolean isThereAGroup() {
        return isElementPresent(selectGroupFlag);
    }

    public int getGroupCount() {
        //*[@id="content"]/form/span/input
        return listGroupCount.size();
        //System.out.println("Размер равен " + list.size());
        //return getWebDriver().findElements(byName("selected[]")).size();
    }
}