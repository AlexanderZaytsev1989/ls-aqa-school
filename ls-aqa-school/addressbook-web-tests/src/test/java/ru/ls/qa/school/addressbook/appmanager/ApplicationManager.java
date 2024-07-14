package ru.ls.qa.school.addressbook.appmanager;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.WebDriverRunner;
import org.openqa.selenium.Dimension;

import static com.codeborne.selenide.Selenide.open;

public class ApplicationManager {
    private NavigationHelper navigationHelper;
    private GroupHelper groupHelper;
    private SessionHelper sessionHelper;
    private ContactHelper contactHelper;

    public void init() {
        Configuration.browser = "chrome";
        open("http://localhost/addressbook/");
        WebDriverRunner.getWebDriver().manage().window().setSize(new Dimension(1936, 1056));
        SessionHelper.login("admin", "secret");
    }

    public GroupHelper getGroupHelper() { return groupHelper; }

    public NavigationHelper getNavigationHelper() {
        return navigationHelper;
    }

    public SessionHelper getSessionHelper() { return sessionHelper; }

    public ContactHelper getContactHelper() { return contactHelper; }
}
