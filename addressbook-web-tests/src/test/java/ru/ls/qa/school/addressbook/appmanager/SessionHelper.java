package ru.ls.qa.school.addressbook.appmanager;

import java.util.Map;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;

public class SessionHelper extends HelperBase {
    public static void login(String username, String password) {
        type(byName("user"), username);
        type(byName("pass"), password);
        click(byXpath("//input[@value=\'Login\']"));
    }
    public static void logout() {
        $(byLinkText("Logout")).click();
    }
}
