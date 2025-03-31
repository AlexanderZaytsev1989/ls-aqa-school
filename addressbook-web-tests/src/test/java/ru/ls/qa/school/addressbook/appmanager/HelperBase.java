package ru.ls.qa.school.addressbook.appmanager;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.NoAlertPresentException;

import static com.codeborne.selenide.Selenide.switchTo;

public class HelperBase {

    protected static void click(SelenideElement element) {
        element.click();
    }


    protected static void type(SelenideElement element, String text) {
        element.val(text);

    }

    protected static boolean isElementPresent(SelenideElement element) {
        if (element.isDisplayed()) {
            return true;
        } else return false;
    }

    public boolean isAlertPresent() {
        try {
            switchTo().alert();
            return true;
        } catch (NoAlertPresentException e) {
            return false;
        }
    }
}
