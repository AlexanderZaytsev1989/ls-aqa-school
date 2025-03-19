package ru.ls.qa.school.addressbook.pages;

import static ru.ls.qa.school.addressbook.tests.TestBase.app;
import static ru.ls.qa.school.addressbook.tests.TestBase.page;

public class ContactListPage extends HeadAbsPages {

    public ContactCreationPage initContactCreation() {
        app.getContactHelper().initContactCreation();

        return page.contactCreationPage;

    }
    public ContactModificationPage editContact() {
        app.getContactHelper().editContact();

        return page.сontactModificationPage;
    }

}
