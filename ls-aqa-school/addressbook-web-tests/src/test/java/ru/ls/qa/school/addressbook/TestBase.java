package ru.ls.qa.school.addressbook;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.WebDriverRunner;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.Dimension;

import java.util.HashMap;
import java.util.Map;

import static com.codeborne.selenide.Selectors.byLinkText;
import static com.codeborne.selenide.Selectors.byName;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class TestBase {
    private Map<String, Object> wd;

    private static void Login(String username, String password) {
      $(byName("user")).click();
      $(byName("user")).click();
      $(byName("user")).doubleClick();
      $(byName("user")).val(username);
      $(byName("pass")).click();
      $(byName("pass")).click();
      $(byName("pass")).doubleClick();
      $(byName("pass")).val(password);
      $("input:nth-child(7)").click();
    }

    protected static void Logout() {
      $(byLinkText("Logout")).click();
    }

    protected static void submitGroupForm() {
      $(byName("submit")).click();
    }

    protected static void fillGroupForm(GroupData groupData) {
      $(byName("group_name")).click();
      $(byName("group_name")).val(groupData.name());
      $(byName("group_header")).click();
      $(byName("group_header")).val(groupData.header());
      $(byName("group_footer")).click();
      $(byName("group_footer")).val(groupData.footer());
    }

    protected static void initGroupCreation() {
      $(byName("new")).click();
    }

    protected static void goTogroupPage() {
      $(byLinkText("groups")).click();
    }

    protected static void deleteSelectedGroups() {
      $(byName("delete")).click();
    }

    protected static void selectGroup() {
      $(byName("selected[]")).click();
    }

    @BeforeEach
    public void setUp() {
      Configuration.browser = "chrome";
      wd = new HashMap<>();
      open("http://localhost/addressbook/");
      WebDriverRunner.getWebDriver().manage().window().setSize(new Dimension(1936, 1056));
      TestBase.Login("admin", "secret");
    }

    @AfterEach
    public void tearDown() {
    }
}
