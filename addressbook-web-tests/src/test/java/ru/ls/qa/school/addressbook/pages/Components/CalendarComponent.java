package ru.ls.qa.school.addressbook.pages.Components;

import static com.codeborne.selenide.Selectors.byName;
import static com.codeborne.selenide.Selenide.$;

public class CalendarComponent {
    public void setDate(String day, String month, String year) {
        $(byName("bday")).click();
        $(byName("bday")).selectOption(day);
        $(byName("bmonth")).click();
        $(byName("bmonth")).selectOption(month);
        $(byName("byear")).click();
        $(byName("byear")).val(year);
    }

    public void setAnniversary(String day, String month, String year) {
        $(byName("aday")).click();
        $(byName("aday")).selectOption(day);
        $(byName("amonth")).click();
        $(byName("amonth")).selectOption(month);
        $(byName("ayear")).click();
        $(byName("ayear")).val(year);
    }
}
