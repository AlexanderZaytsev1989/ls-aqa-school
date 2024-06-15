package ru.ls.qa.school.addressbook.pages;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.WebDriverRunner;
import org.openqa.selenium.Dimension;
import ru.ls.qa.school.addressbook.appmanager.SessionHelper;
import ru.ls.qa.school.addressbook.pages.Components.CalendarComponent;

import static com.codeborne.selenide.Selectors.byLinkText;
import static com.codeborne.selenide.Selectors.byName;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class ContactCreationPage {

    CalendarComponent calendarComponent = new CalendarComponent();
    private final String TITLE_TEXT = "http://localhost/addressbook/";
    private SelenideElement
            firstNameInput = $(byName("firstname")),
            middleNameInput = $(byName("middlename")),
            lastNameInput = $(byName("lastname")),
            nickNameInput = $(byName("nickname")),
            titleInput = $(byName("title")),
            companyInput = $(byName("company")),
            addressInput = $(byName("address")),
            homeInput = $(byName("home")),
            mobileInput = $(byName("mobile")),
            workInput = $(byName("work")),
            faxInput = $(byName("fax")),
            emailInput = $(byName("email")),
            email2Input = $(byName("email2")),
            email3Input = $(byName("email3")),
            homepageInput = $(byName("homepage")),
//            bdayInput = $(byName("bday")),
//            bmonthInput = $(byName("bmonth")),
//            byearInput = $(byName("byear")),
//            adayInput = $(byName("aday")),
//            amonthInput = $(byName("amonth")),
//            ayearInput = $(byName("ayear")),
            newgroupInput = $(byName("new_group")),
            address2Input = $(byName("address2")),
            phone2Input = $(byName("phone2")),
            notesInput = $(byName("notes")),
            newContactBtn = $(byLinkText("add new"));
            //logoutBtn = $(byLinkText("Logout"));

    public ContactCreationPage openPage() {
        Configuration.browser = "chrome";
        open(TITLE_TEXT);
        WebDriverRunner.getWebDriver().manage().window().setSize(new Dimension(1936, 1056));
        SessionHelper.login("admin", "secret");

        return this;
    }

    public ContactCreationPage setAddNewContact() {
        newContactBtn.click();

        return this;
    }
    public ContactCreationPage setFirstName(String value) {
        firstNameInput.setValue(value);

        return this;
    }

    public ContactCreationPage setMiddleName(String value) {
        middleNameInput.setValue(value);

        return this;
    }

    public ContactCreationPage setLastName(String value) {
        lastNameInput.setValue(value);

        return this;
    }

    public ContactCreationPage setNickName(String value) {
        nickNameInput.setValue(value);

        return this;
    }

    public ContactCreationPage setTitle(String value) {
        titleInput.setValue(value);

        return this;
    }

    public ContactCreationPage setCompany(String value) {
        companyInput.setValue(value);

        return this;
    }

    public ContactCreationPage setAddress(String value) {
        addressInput.setValue(value);

        return this;
    }

    public ContactCreationPage setHome(String value) {
        homeInput.setValue(value);

        return this;
    }

    public ContactCreationPage setMobile(String value) {
        mobileInput.setValue(value);

        return this;
    }

    public ContactCreationPage setWork(String value) {
        workInput.setValue(value);

        return this;
    }

    public ContactCreationPage setFax(String value) {
        faxInput.setValue(value);

        return this;
    }

    public ContactCreationPage setEmail(String value) {
        emailInput.setValue(value);

        return this;
    }

    public ContactCreationPage setEmail2(String value) {
        email2Input.setValue(value);

        return this;
    }

    public ContactCreationPage setEmail3(String value) {
        email3Input.setValue(value);

        return this;
    }

    public ContactCreationPage setHomepage(String value) {
        homepageInput.setValue(value);

        return this;
    }

    public ContactCreationPage setBirthDate(String day, String month, String year) {
        calendarComponent.setDate(day, month, year);

        return this;
    }

    public ContactCreationPage setAnniversaryDate(String day, String month, String year) {
        calendarComponent.setAnniversary(day, month, year);

        return this;
    }

//    public ContactCreationPage setBday(String value) {
//        bdayInput.click();
//        bdayInput.setValue(value);
//
//        return this;
//    }
//
//    public ContactCreationPage setBmonth(String value) {
//        bmonthInput.click();
//        bmonthInput.setValue(value);
//
//        return this;
//    }
//
//    public ContactCreationPage setByear(String value) {
//        byearInput.click();
//        byearInput.setValue(value);
//
//        return this;
//    }
//
//    public ContactCreationPage setAday(String value) {
//        adayInput.click();
//        adayInput.setValue(value);
//
//        return this;
//    }
//
//    public ContactCreationPage setAmonth(String value) {
//        amonthInput.click();
//        amonthInput.setValue(value);
//
//        return this;
//    }
//
//    public ContactCreationPage setAyear(String value) {
//        ayearInput.click();
//        ayearInput.setValue(value);
//
//        return this;
//    }

    public ContactCreationPage setNewgroup(String value) {
        newgroupInput.selectOption(value);

        return this;
    }

    public ContactCreationPage setAddress2(String value) {
        address2Input.setValue(value);

        return this;
    }

    public ContactCreationPage setPhone2(String value) {
        phone2Input.setValue(value);

        return this;
    }

    public ContactCreationPage setNotes(String value) {
        notesInput.setValue(value);

        return this;
    }
}
