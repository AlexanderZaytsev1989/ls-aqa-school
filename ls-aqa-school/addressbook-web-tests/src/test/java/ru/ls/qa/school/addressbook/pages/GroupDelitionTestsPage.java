package ru.ls.qa.school.addressbook.pages;// Generated by Selenium IDE
import ru.ls.qa.school.addressbook.appmanager.ApplicationManager;

public class GroupDelitionTestsPage extends HeadAbsPages {

  public GroupDelitionTestsPage(ApplicationManager app) {

    super(app);
  }

  public GroupDelitionTestsPage goToGroupPage() {
    app.getNavigationHelper().goToGroupPage();

    return this;
  }

  public GroupDelitionTestsPage returnToGroupPage() {
    app.getGroupHelper().returnToGroupPage();

    return this;
  }

  public GroupDelitionTestsPage selectGroup() {
    app.getGroupHelper().selectGroup();

    return this;
  }
  public GroupDelitionTestsPage delitionGroup() {
    app.getGroupHelper().deleteSelectedGroups();

    return this;
  }
}