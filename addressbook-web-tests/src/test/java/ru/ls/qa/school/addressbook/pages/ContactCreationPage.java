package ru.ls.qa.school.addressbook.pages;

import ru.ls.qa.school.addressbook.model.ContactCreationData;

import static ru.ls.qa.school.addressbook.tests.TestBase.app;

public class ContactCreationPage extends HeadAbsPages {


    public ContactCreationPage fillContactForm(ContactCreationData contactCreationData) {
        app.getContactHelper().fillContactForm(contactCreationData);

        return this;
    }

    public ContactCreationPage submitContactForm() {
        app.getContactHelper().submitContactForm();

        return this;
    }


}
