package ru.ls.qa.school.addressbook.appmanager;

import com.codeborne.selenide.Driver;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.WebDriverRunner;
import com.codeborne.selenide.ex.ElementShould;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;

import java.util.Map;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;

public class HelperBase {

    protected static void click(By locator) { $(locator).click(); }

    protected static void type(By locator, String text) {
            $(locator).val(text);

    }

    protected static boolean isElementPresent (By locator) {
        try {
            $(locator).shouldBe(visible);
            return true;
        }
        catch (NoSuchElementException ex) {
            return false;
        }
    }

    public boolean isAlertPresent () {
        try {
            switchTo().alert();
            return true;
        }
        catch (NoAlertPresentException e) {
            return false;
        }
    }
}
