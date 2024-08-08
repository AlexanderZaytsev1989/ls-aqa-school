package ru.ls.qa.school.addressbook.pages;

import ru.ls.qa.school.addressbook.appmanager.ApplicationManager;

public class ContactDelitionTestsPage extends HeadAbsPages {

    public ContactDelitionTestsPage(ApplicationManager app) {

        super(app);
    }

    public ContactDelitionTestsPage editContact() {
        app.getContactHelper().editContact();

        return this;
    }

    public ContactDelitionTestsPage deleteContact() {
        app.getContactHelper().deleteContact();

        return this;
    }
}