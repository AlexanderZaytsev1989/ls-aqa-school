package ru.ls.qa.school.addressbook.pages;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.WebDriverRunner;
import org.openqa.selenium.Dimension;
import ru.ls.qa.school.addressbook.appmanager.ApplicationManager;
import ru.ls.qa.school.addressbook.appmanager.HelperBase;
import ru.ls.qa.school.addressbook.appmanager.SessionHelper;
import ru.ls.qa.school.addressbook.model.ContactData;
import ru.ls.qa.school.addressbook.pages.Components.CalendarComponent;

import static com.codeborne.selenide.Selectors.byLinkText;
import static com.codeborne.selenide.Selectors.byName;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class ContactCreationPage extends HeadAbsPages {

    public ContactCreationPage(ApplicationManager app) {

        super(app);
    }

    public ContactCreationPage initContactCreation() {
        app.getContactHelper().initContactCreation();

        return this;
    }

    public ContactCreationPage fillContactForm() {
        app.getContactHelper().fillContactForm(new ContactData(
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

    public ContactCreationPage submitContactForm() {
        app.getContactHelper().submitContactForm();

        return this;
    }

    public ContactCreationPage goToHomePage() {
        app.getContactHelper().goToHomePage();

        return this;
    }
}
