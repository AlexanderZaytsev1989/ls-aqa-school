package ru.ls.qa.school.addressbook.pages;

import ru.ls.qa.school.addressbook.appmanager.ApplicationManager;
import ru.ls.qa.school.addressbook.model.ContactCreationData;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class ContactCreationTestsPage extends HeadAbsPages {

    public ContactCreationTestsPage(ApplicationManager app) {

        super(app);
    }

    public ContactCreationTestsPage initContactCreation() {
        app.getContactHelper().initContactCreation();

        return this;
    }

    public ContactCreationTestsPage fillContactForm() {
        app.getContactHelper().fillContactForm(new ContactCreationData(
                "Alex",
                "Zaytsev",
                "Sergeevich",
                "Zayats",
                "АУУ",
                "икуиук",
                "Лига ставок",
                "Лесная 3",
                "АДрес смотри",
                "5453425",
                "26543543",
                "46345",
                "htrg@bghb.ru",
                "brb@brevb.ru",
                "bregvb@brevb.ru",
                "12",
                "March",
                "1999",
                "12",
                "March",
                "1999",
                "test1",
                "Витебский",
                "83244375",
                "62534"));

        return this;
    }

    public ContactCreationTestsPage submitContactForm() {
        app.getContactHelper().submitContactForm();

        return this;
    }

    public ContactCreationTestsPage goToHomePage() {
        app.getContactHelper().goToHomePage();

        return this;
    }
}
