package ru.ls.qa.school.addressbook.appmanager;

import java.util.Map;

public class NavigationHelper {


    private Map<String, Object> wd;

    public NavigationHelper(Map<String, Object> wd) {
        this.wd = wd;
    }

    public static void goToGroupPage() {
        GroupHelper.returnToGroupPage();
    }
}
