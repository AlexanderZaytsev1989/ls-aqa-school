package ru.ls.qa.school.addressbook.tests.contacts;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import ru.ls.qa.school.addressbook.model.ContactData;
import ru.ls.qa.school.addressbook.tests.TestBase;

import static org.assertj.core.api.Assertions.assertThat;

public class ContactCreationTests extends TestBase {

    private static int before;

    @BeforeAll
    static void setUp() {
        before = app.getContactHelper()
                    .getContactCount();
    }

    @Test
    void testContactCreation() {

        page.mainPage()
            .initContactCreation()
            .fillContactForm(new ContactData(
                    "Alex",
                    "Zaytsev",
                    "Sergeevich",
                    "Zayats",
                    "АУУ"))
            .submitContactForm()
            .goToHomePage();
        int after = app.getContactHelper()
                       .getContactCount();

        assertThat(after)
                .as("")
                .isEqualTo(before + 1);
    }
}

