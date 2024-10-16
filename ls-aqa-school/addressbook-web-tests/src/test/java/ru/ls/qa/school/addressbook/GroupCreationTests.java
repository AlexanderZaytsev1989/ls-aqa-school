package ru.ls.qa.school.addressbook;// Generated by Selenium IDE
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterEach;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.WebDriverRunner;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;

import org.openqa.selenium.Dimension;

import java.util.*;
public class GroupCreationTests {
  private Map<String, Object> vars;
  @BeforeEach
  public void setUp() {
    Configuration.browser = "chrome";
    vars = new HashMap<>();
  }
  @AfterEach
  public void tearDown() {
  }
  @Test
  public void testGroupCreation() {
    open("http://localhost/addressbook/");
    WebDriverRunner.getWebDriver().manage().window().setSize(new Dimension(1936, 1056));
    $(byName("user")).click();
    $(byName("user")).click();
    $(byName("user")).doubleClick();
    $(byName("user")).val("admin");
    $(byName("pass")).click();
    $(byName("pass")).click();
    $(byName("pass")).doubleClick();
    $(byName("pass")).val("secret");
    $("input:nth-child(7)").click();
    $(byLinkText("groups")).click();
    $(byName("new")).click();
    $(byName("group_name")).click();
    $(byName("group_name")).val("test1");
    $(byName("group_header")).click();
    $(byName("group_header")).val("test2");
    $(byName("group_footer")).click();
    $(byName("group_footer")).val("test3");
    $(byName("submit")).click();
    $(byLinkText("groups")).click();
    $(byLinkText("Logout")).click();
  }
}
