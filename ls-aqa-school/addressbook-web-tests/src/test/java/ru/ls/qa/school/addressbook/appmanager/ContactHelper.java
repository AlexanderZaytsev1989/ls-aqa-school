package ru.ls.qa.school.addressbook.appmanager;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import ru.ls.qa.school.addressbook.model.ContactCreationData;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selectors.byName;
import static com.codeborne.selenide.Selenide.*;


public class ContactHelper extends HelperBase {

    SelenideElement newContactBtn = $(byLinkText("add new"));
    SelenideElement editContactBtn = $(byXpath("(//img[@alt='Edit'])[2]"));
    SelenideElement submitContactBtn = $(byXpath("(//input[@name='submit'])[2]"));
    SelenideElement submitModificationContactBtn = $(byXpath("(//input[@name='update'])[2]"));
    SelenideElement honePageBtn = $(byLinkText("home page"));
    SelenideElement deleteContactBtn = $(byXpath("(//input[@name='update'])[3]"));
    SelenideElement selectContactFlag = $(byName("selected[]"));

    ElementsCollection listContactCount = $$("[name*=selected]");







    public void initContactCreation() { click(newContactBtn); }
    public void editContact() { click(editContactBtn); }
    public void submitContactForm() { click(submitContactBtn); }
    public void submitModificationContactForm() { click(submitModificationContactBtn); }
    public void goToHomePage() { click(honePageBtn);}
    public void deleteContact() { click(deleteContactBtn);}


    public void fillContactForm(ContactCreationData contactCreationData) {
        $(byName("firstname")).val(contactCreationData.getFirstname());
        $(byName("middlename")).val(contactCreationData.getMiddleName());
        $(byName("lastname")).val(contactCreationData.getLastname());
        $(byName("nickname")).val(contactCreationData.getNickname());
        $(byName("title")).val(contactCreationData.getTitle());
    }

    public void createContact(ContactCreationData contact) {
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


