package ru.ls.qa.school.addressbook.pages;

import ru.ls.qa.school.addressbook.appmanager.ApplicationManager;

public abstract class HeadAbsPages {

    public ApplicationManager app;

    public HeadAbsPages (ApplicationManager app) {
        this.app = app;
    }
}
