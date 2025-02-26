package ru.ls.qa.school.addressbook.appmanager;

import java.util.Map;

import static com.codeborne.selenide.Selectors.byLinkText;

public class NavigationHelper extends HelperBase {

    public static void goToGroupPage() {
        click(byLinkText("groups"));
    }
}
