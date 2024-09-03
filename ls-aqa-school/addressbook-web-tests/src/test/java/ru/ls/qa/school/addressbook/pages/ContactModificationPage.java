package ru.ls.qa.school.addressbook.pages;

import ru.ls.qa.school.addressbook.model.ContactModificationData;

import static ru.ls.qa.school.addressbook.tests.TestBase.app;

public class ContactModificationPage extends HeadAbsPages {

    public ContactModificationPage fillModificationContactForm(ContactModificationData contactModificationData) {
        app.getContactHelper().fillModificationContactForm(contactModificationData);

        return this;
        }

    public ContactModificationPage submitModificationContactForm() {
        app.getContactHelper().submitModificationContactForm();

        return this;
    }

//    public ContactModificationPage goToHomePage() {
//        app.getContactHelper().goToHomePage();
//
//        return this;
//    }

    public ContactModificationPage editContact() {
        app.getContactHelper().editContact();

        return this;
    }

    public ContactModificationPage deleteContact() {
        app.getContactHelper().deleteContact();

        return this;
    }
}
