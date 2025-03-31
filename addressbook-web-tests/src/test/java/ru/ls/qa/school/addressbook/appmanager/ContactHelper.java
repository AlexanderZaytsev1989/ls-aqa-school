package ru.ls.qa.school.addressbook.appmanager;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import ru.ls.qa.school.addressbook.model.ContactData;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;


public class ContactHelper extends HelperBase {

    SelenideElement newContactBtn = $(byLinkText("add new"));
    SelenideElement editContactBtn = $(byXpath("(//img[@alt='Edit'])[2]"));
    SelenideElement submitContactBtn = $(byXpath("(//input[@name='submit'])[2]"));
    SelenideElement submitModificationContactBtn = $(byXpath("(//input[@name='update'])[2]"));
    SelenideElement honePageBtn = $(byLinkText("home"));
    SelenideElement deleteContactBtn = $(byXpath("(//input[@name='update'])[3]"));
    SelenideElement selectContactFlag = $(byName("selected[]"));

    ElementsCollection listContactCount = $$("[name*=selected]");


    public void initContactCreation() {
        click(newContactBtn);
    }

    public void editContact() {
        click(editContactBtn);
    }

    public void submitContactForm() {
        click(submitContactBtn);
    }

    public void submitModificationContactForm() {
        click(submitModificationContactBtn);
    }

    public void goToHomePage() {
        click(honePageBtn);
    }

    public void deleteContact() {
        click(deleteContactBtn);
    }


    public void fillContactForm(ContactData contactData) {
        $(byName("firstname")).val(contactData.getFirstname());
        $(byName("middlename")).val(contactData.getMiddleName());
        $(byName("lastname")).val(contactData.getLastname());
        $(byName("nickname")).val(contactData.getNickname());
        $(byName("title")).val(contactData.getTitle());
    }

    public void createContact(ContactData contact) {
        initContactCreation();
        fillContactForm(contact);
        submitContactForm();
    }

    public boolean isThereAContact() {
        return isElementPresent(selectContactFlag);
    }

    public int getContactCount() {
        return listContactCount.size();
    }

}


