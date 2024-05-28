package ru.ls.qa.school.addressbook.appmanager;

import org.openqa.selenium.By;

import java.util.Map;

import static com.codeborne.selenide.Selenide.$;

public class HelperBase {
    protected Map<String, Object> wd;

    public HelperBase(Map<String, Object> wd) {
        this.wd = wd;
    }

    protected static void click(By locator) {
        $(locator).click();
    }

    protected static void type(By locator, String text) {
        HelperBase.click(locator);
        $(locator).val(text);
    }
}
