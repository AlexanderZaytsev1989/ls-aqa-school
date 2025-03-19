package ru.ls.qa.school.addressbook.appmanager;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;

public class NavigationHelper extends HelperBase {

    SelenideElement headingGroups = $(By.tagName("h1"));
    SelenideElement newGroupBtn = $(byName("new"));
    SelenideElement gruopPageBtn = $(byLinkText("groups"));
    SelenideElement mainId = $(byId("maintable"));
    SelenideElement homePageBtn = $(byLinkText("home"));


    public void goToGroupPage() {

        if (isElementPresent(headingGroups) && $(headingGroups).getText()
                                                               .equals("Groups")
                && isElementPresent(newGroupBtn)) {
            return;
        }
        click(gruopPageBtn);
    }

    public void goToHomePage() {

        if (isElementPresent(mainId)) {
            return;
        }
        click(homePageBtn);
    }

}