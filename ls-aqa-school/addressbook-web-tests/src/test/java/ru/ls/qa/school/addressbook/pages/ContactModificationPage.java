package ru.ls.qa.school.addressbook.pages;

import ru.ls.qa.school.addressbook.model.ContactCreationData;
import ru.ls.qa.school.addressbook.model.ContactModificationData;

import static ru.ls.qa.school.addressbook.tests.TestBase.app;

public class ContactModificationPage extends HeadAbsPages {

    public ContactModificationPage fillContactForm(ContactCreationData contactCreationData) {
        app.getContactHelper().fillContactForm(contactCreationData);

        return this;
        }

    public ContactModificationPage submitModificationContactForm() {
        app.getContactHelper().submitModificationContactForm();

        return this;
    }

    public ContactModificationPage editContact() {
        app.getContactHelper().editContact();

        return this;
    }

    public ContactModificationPage deleteContact() {
        app.getContactHelper().deleteContact();

        return this;
    }
}
