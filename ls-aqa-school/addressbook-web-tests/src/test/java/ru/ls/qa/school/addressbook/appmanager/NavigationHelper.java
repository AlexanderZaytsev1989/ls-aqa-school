package ru.ls.qa.school.addressbook.appmanager;

import java.util.Map;

import static com.codeborne.selenide.Selectors.byLinkText;
import static com.codeborne.selenide.Selenide.$;

public class NavigationHelper extends HelperBase {

    public void goToGroupPage() {
        click(byLinkText("groups"));
    }

}
