package ru.ls.qa.school.addressbook.model;

public record ContactModificationData(String bday, String bmonth, String byear, String aday, String amonth,
                                      String ayear, String firstname, String middlename, String lastname,
                                      String nickname, String company, String title, String address, String home,
                                      String mobile, String work, String fax, String email, String email2,
                                      String email3, String homepage, String address2, String phone2, String notes) {
}