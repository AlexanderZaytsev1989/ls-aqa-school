package ru.ls.qa.school.addressbook.appmanager;

import org.openqa.selenium.support.ui.Select;
import ru.ls.qa.school.addressbook.model.ContactCreationData;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selectors.byName;
import static com.codeborne.selenide.Selenide.*;


public class ContactHelper extends HelperBase {

    public static void initContactCreation() { click(byLinkText("add new")); }
    public static void editContact() { click(byXpath("(//img[@alt=\'Edit\'])[2]")); }
    public static void submitContactForm() { click(byXpath("(//input[@name=\'submit\'])[2]")); }
    public static void submitModificationContactForm() { click(byXpath("(//input[@name=\'update\'])[2]")); }
    public static void goToHomePage() { click(byLinkText("home page"));}
    public static void deleteContact() { click(byXpath("(//input[@name=\'update\'])[3]"));}


    public static void fillContactForm(ContactCreationData contactCreationData) {
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
        if (isElementPresent(byName("new_group"))) {
            $(byName("new_group")).selectOption(contactCreationData.new_group());
        }
        $(byName("address2")).val(contactCreationData.address2());
        $(byName("phone2")).val(contactCreationData.phone2());
        $(byName("notes")).val(contactCreationData.notes());
    }

    public static void fillModificationContactForm(ContactCreationData contactCreationData) {
        $(byName("firstname")).click();
        $(byName("firstname")).val(contactCreationData.firstname());
        $(byName("middlename")).click();
        $(byName("middlename")).val(contactCreationData.middlename());
        $(byName("lastname")).click();
        $(byName("lastname")).val(contactCreationData.lastname());
        $(byName("nickname")).click();
        $(byName("nickname")).val(contactCreationData.nickname());
        $(byName("company")).click();
        $(byName("company")).val(contactCreationData.company());
        $(byName("title")).click();
        $(byName("title")).val(contactCreationData.title());
        $(byName("address")).click();
        $(byName("address")).val(contactCreationData.address());
        $(byName("home")).click();
        $(byName("home")).val(contactCreationData.home());
        $(byName("mobile")).click();
        $(byName("mobile")).val(contactCreationData.mobile());
        $(byName("work")).click();
        $(byName("work")).val(contactCreationData.work());
        $(byName("fax")).click();
        $(byName("fax")).val(contactCreationData.fax());
        $(byName("email")).click();
        $(byName("email")).val(contactCreationData.email());
        $(byName("email2")).click();
        $(byName("email2")).val(contactCreationData.email2());
        $(byName("email3")).click();
        $(byName("email3")).val(contactCreationData.email3());
        $(byName("homepage")).click();
        $(byName("homepage")).val(contactCreationData.homepage());
        $(byName("bday")).click();
        $(byName("bday")).selectOption(contactCreationData.bday());
        $(byName("bmonth")).click();
        $(byName("bmonth")).selectOption(contactCreationData.bmonth());
        $(byName("byear")).click();
        $(byName("byear")).val(contactCreationData.byear());
        $(byName("aday")).click();
        $(byName("aday")).selectOption(contactCreationData.aday());
        $(byName("amonth")).click();
        $(byName("amonth")).selectOption(contactCreationData.amonth());
        $(byName("ayear")).click();
        $(byName("ayear")).val(contactCreationData.ayear());
        $(byName("address2")).click();
        $(byName("address2")).val(contactCreationData.address2());
        $(byName("phone2")).click();
        $(byName("phone2")).val(contactCreationData.phone2());
        $(byName("notes")).click();
        $(byName("notes")).val(contactCreationData.notes());
    }

}


