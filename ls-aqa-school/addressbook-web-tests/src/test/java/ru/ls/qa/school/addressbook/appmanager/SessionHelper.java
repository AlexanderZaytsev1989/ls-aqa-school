package ru.ls.qa.school.addressbook.appmanager;

import java.util.Map;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;

public class SessionHelper extends HelperBase {
    public SessionHelper(Map<String, Object> wd) {
        super(wd);
    }
    public static void Login(String username, String password) {
        type(byName("user"), username);
        type(byName("pass"), password);
        click(byXpath("//input[@value=\'Login\']"));
        //$("input:nth-child(7)").click();
    }
    public static void Logout() {
        $(byLinkText("Logout")).click();
    }
}
