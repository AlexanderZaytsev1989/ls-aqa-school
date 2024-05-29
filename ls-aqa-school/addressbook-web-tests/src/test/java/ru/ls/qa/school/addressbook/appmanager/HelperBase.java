package ru.ls.qa.school.addressbook.appmanager;

import org.openqa.selenium.By;

import java.util.Map;

import static com.codeborne.selenide.Selenide.$;

public class HelperBase {

    protected static void click(By locator) {
        $(locator).click();
    }

    protected static void type(By locator, String text) {
        $(locator).val(text);
    }
}
