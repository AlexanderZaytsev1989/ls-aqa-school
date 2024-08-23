package ru.ls.qa.school.addressbook.pages;

import ru.ls.qa.school.addressbook.appmanager.ApplicationManager;

import static ru.ls.qa.school.addressbook.tests.TestBase.app;

public class ContactDelitionPage extends HeadAbsPages {

    public ContactDelitionPage editContact() {
        app.getContactHelper().editContact();

        return this;
    }

    public ContactDelitionPage deleteContact() {
        app.getContactHelper().deleteContact();

        return this;
    }
}