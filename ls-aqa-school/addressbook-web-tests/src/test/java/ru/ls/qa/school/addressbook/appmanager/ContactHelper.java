package ru.ls.qa.school.addressbook.appmanager;

import ru.ls.qa.school.addressbook.model.ContactData;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selectors.byName;
import static com.codeborne.selenide.Selenide.$;
import static org.openqa.selenium.bidi.browsingcontext.Locator.css;


public class ContactHelper extends HelperBase {

    public static void initContactCreation() { click(byLinkText("add new")); }

    public static void addNewContact() { click(byXpath("//div[@id=\'content\']/form/input[21]")); }

    public static void fillContactForm(ContactData contactData) {
        $(byName("firstname")).click();
        $(byName("firstname")).val(contactData.firstname());
        $(byName("middlename")).click();
        $(byName("middlename")).val(contactData.middlename());
        $(byName("lastname")).click();
        $(byName("lastname")).val(contactData.lastname());
        $(byName("nickname")).click();
        $(byName("nickname")).val(contactData.nickname());
        $(byName("title")).click();
        $(byName("title")).val(contactData.title());
        $(byName("company")).click();
        $(byName("company")).val(contactData.company());
        $(byName("address")).click();
        $(byName("address")).val(contactData.address());
        $(byName("theform")).click();
        $(byName("home")).click();
        $(byName("home")).val(contactData.home());
        $(byName("mobile")).click();
        $(byName("mobile")).val(contactData.mobile());
        $(byName("work")).click();
        $(byName("work")).val(contactData.work());
        $(byName("fax")).click();
        $(byName("fax")).val(contactData.fax());
        $(byName("email")).click();
        $(byName("email")).val(contactData.email());
        $(byName("email2")).click();
        $(byName("email2")).val(contactData.email2());
        $(byName("email3")).click();
        $(byName("email3")).val(contactData.email3());
        $(byName("homepage")).click();
        $(byName("homepage")).val(contactData.homepage());
        $(byName("bday")).click();
        $(byName("bday")).selectOption(contactData.bday());
        $(byName("bmonth")).click();
        $(byName("bmonth")).selectOption(contactData.bmonth());
        $(byName("byear")).click();
        $(byName("byear")).val(contactData.byear());
        $(byName("aday")).click();
        $(byName("aday")).selectOption(contactData.aday());
        $(byName("amonth")).click();
        $(byName("amonth")).selectOption(contactData.amonth());
        $(byName("ayear")).click();
        $(byName("ayear")).val(contactData.ayear());
        $(byName("new_group")).click();
        $(byName("new_group")).selectOption(contactData.new_group());
        $(byName("address2")).click();
        $(byName("address2")).val(contactData.address2());
        $(byName("phone2")).click();
        $(byName("phone2")).val(contactData.phone2());
        $(byName("notes")).click();
        $(byName("notes")).val(contactData.notes());
    }
}
