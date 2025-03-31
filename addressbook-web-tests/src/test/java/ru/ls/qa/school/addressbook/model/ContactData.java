package ru.ls.qa.school.addressbook.model;

public class ContactData {

    private String firstname;
    private String middleName;
    private String lastname;
    private String nickname;
    private String title;

    public ContactData(String firstname, String middleName, String lastname, String nickname, String title) {

        this.firstname = firstname;
        this.middleName = middleName;
        this.lastname = lastname;
        this.nickname = nickname;
        this.title = title;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }


}