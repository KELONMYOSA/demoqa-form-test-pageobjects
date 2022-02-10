package tests;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import pages.StudentRegistrationPage;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Condition.text;

public class FormTest {

    StudentRegistrationPage registrationPage = new StudentRegistrationPage();

    @BeforeAll
    static void beforeAll() {
        Configuration.baseUrl = "https://demoqa.com";
        Configuration.browserSize = "1920x1080";
    }

    @Test
    void FillFormTest() {
        registrationPage
                .openPage()
                .setFirstName("Name")
                .setLastName("Lastname")
                .setEmail("test@mail.ru")
                .setGender("Male")
                .setMobileNumber("0123456789")
                .setDateOfBirth("1", "January", "2000")
                .setSubjects("Maths")
                .setHobbies("Sports")
                .uploadPicture("test-pic.jpg")
                .setAddress("Ulica, dom 1")
                .setState("NCR")
                .setCity("Delhi")
                .clickSubmit();

        //Checking the correctness of filling out the form
        $(".table-responsive").shouldHave(
                text("Name LastName"),
                text("test@mail.ru"),
                text("Male"),
                text("0123456789"),
                text("01 January,2000"),
                text("Maths"),
                text("Sports"),
                text("test-pic.jpg"),
                text("Ulica, dom 1"),
                text("NCR Delhi")
        );
    }
}
