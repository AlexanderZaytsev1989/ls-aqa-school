package ru.ls.qa.school.addressbook.appmanager;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.WebElementCondition;
import org.openqa.selenium.support.ui.Select;
import ru.ls.qa.school.addressbook.model.ContactCreationData;
import ru.ls.qa.school.addressbook.model.GroupData;

import static com.codeborne.selenide.Condition.*;
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



    public void fillCreationContactForm(ContactCreationData contactCreationData) {
        fillModificationContactForm(contactCreationData);
        $(newContactBtn).shouldBe(visible).selectOption(contactCreationData.new_group());

    }
    public void fillModificationContactForm(ContactCreationData contactCreationData) {
        $(byName("firstname")).val(contactCreationData.firstname());
        $(byName("middlename")).val(contactCreationData.middlename());
        $(byName("lastname")).val(contactCreationData.lastname());
        $(byName("nickname")).val(contactCreationData.nickname());
        $(byName("title")).val(contactCreationData.title());
        $(byName("company")).val(contactCreationData.company());
        $(byName("address")).val(contactCreationData.address());
        $(byName("home")).val(contactCreationData.home());
        $(byName("mobile")).val(contactCreationData.mobile());
        $(byName("work")).val(contactCreationData.work());
        $(byName("fax")).val(contactCreationData.fax());
        $(byName("email")).val(contactCreationData.email());
        $(byName("email2")).val(contactCreationData.email2());
        $(byName("email3")).val(contactCreationData.email3());
        $(byName("homepage")).val(contactCreationData.homepage());
        $(byName("bday")).selectOption(contactCreationData.bday());
        $(byName("bmonth")).selectOption(contactCreationData.bmonth());
        $(byName("byear")).val(contactCreationData.byear());
        $(byName("aday")).selectOption(contactCreationData.aday());
        $(byName("amonth")).selectOption(contactCreationData.amonth());
        $(byName("ayear")).val(contactCreationData.ayear());
        $(byName("address2")).val(contactCreationData.address2());
        $(byName("phone2")).val(contactCreationData.phone2());
        $(byName("notes")).val(contactCreationData.notes());
    }

    public void createContact(ContactCreationData contact) {
        initContactCreation();
        fillCreationContactForm(contact);
        submitContactForm();
    }

    public boolean isThereAContact() {
        return isElementPresent(selectContactFlag);
    }

    public int getContactCount() {
        return listContactCount.size();
    }

}


