package ru.ls.qa.school.addressbook.appmanager;

import com.codeborne.selenide.Selenide;
import org.openqa.selenium.By;

import java.util.Map;

import static com.codeborne.selenide.Selectors.byLinkText;
import static com.codeborne.selenide.Selenide.$;

public class NavigationHelper extends HelperBase {

    public static void goToGroupPage() {
//        if(isElementPresent(By.tagName("h1") && Selenide.element()))

        click(byLinkText("groups"));
    }

    public static void goToHomePage() {
        click(byLinkText("home"));
    }

}
