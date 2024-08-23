package ru.ls.qa.school.addressbook.pages;

public class PageManager {

    public GroupCreationPage groupCreationPage = new GroupCreationPage();

    public GroupModificationPage groupModificationPage = new GroupModificationPage();

    public ContactCreationPage contactCreationPage = new ContactCreationPage();

    public ContactModificationPage сontactModificationPage = new ContactModificationPage();

    public ContactDelitionPage contactDelitionPage = new ContactDelitionPage();

    public GroupDelitionPage groupDelitionPage = new GroupDelitionPage();

    public ContactListPage contactListPage = new ContactListPage();

    public GroupListPage groupListPage = new GroupListPage();

    public GroupListPage groupPage() {
        return groupListPage;
    }

    public ContactListPage mainPage() {
        return contactListPage;
    }
}
