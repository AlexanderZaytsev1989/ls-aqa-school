package ru.ls.qa.school.addressbook.pages;

import ru.ls.qa.school.addressbook.model.ContactModificationData;

import static ru.ls.qa.school.addressbook.tests.TestBase.app;

public class ContactModificationPage extends HeadAbsPages {

    public ContactModificationPage fillModificationContactForm() {
        app.getContactHelper().fillModificationContactForm(new ContactModificationData(
                "2",
                "January",
                "2004",
                "1",
                "May",
                "1998",
                "Sasha",
                "Sergeevich",
                "Zaytsev",
                "Zayats",
                "Liga",
                "Wbrvew",
                "Lesnaya 34",
                "Saratov",
                "89033333333",
                "343232",
                "5434322",
                "vewwv@vev.ru",
                "grgvre@rfber.ru",
                "grgrgr@vree.ru",
                "veervrev.ru",
                "Moskovskaya 34",
                "89222222222",
                "brbrve"));

        return this;
    }

    public ContactModificationPage submitModificationContactForm() {
        app.getContactHelper().submitModificationContactForm();

        return this;
    }

    public ContactModificationPage goToHomePage() {
        app.getContactHelper().goToHomePage();

        return this;
    }

    public ContactModificationPage editContact() {
        app.getContactHelper().editContact();

        return this;
    }
}
