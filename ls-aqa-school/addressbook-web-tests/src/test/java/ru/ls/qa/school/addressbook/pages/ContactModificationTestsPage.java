package ru.ls.qa.school.addressbook.pages;

import ru.ls.qa.school.addressbook.appmanager.ApplicationManager;
import ru.ls.qa.school.addressbook.model.ContactModificationData;

public class ContactModificationTestsPage extends HeadAbsPages {

    public ContactModificationTestsPage(ApplicationManager app) {

        super(app);
    }

    public ContactModificationTestsPage fillModificationContactForm() {
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

    public ContactModificationTestsPage submitModificationContactForm() {
        app.getContactHelper().submitModificationContactForm();

        return this;
    }

    public ContactModificationTestsPage goToHomePage() {
        app.getContactHelper().goToHomePage();

        return this;
    }

    public ContactModificationTestsPage editContact() {
        app.getContactHelper().editContact();

        return this;
    }
}
