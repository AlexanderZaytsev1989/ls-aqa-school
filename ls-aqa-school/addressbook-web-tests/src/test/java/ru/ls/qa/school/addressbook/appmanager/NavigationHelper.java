package ru.ls.qa.school.addressbook.appmanager;

import com.codeborne.selenide.Selenide;
import org.openqa.selenium.By;

import java.util.Map;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;

public class NavigationHelper extends HelperBase {

    public static void goToGroupPage(){

        if(isElementPresent(By.tagName("h1")) && $(By.tagName("h1")).getText().equals("Groups")
                && isElementPresent(byName("new"))) {
            return;
        }
        click(byLinkText("groups"));
    }

    public static void goToHomePage() {

        if(isElementPresent(byId("maintable"))) {
            return;
        }
        click(byLinkText("home"));
    }

}
