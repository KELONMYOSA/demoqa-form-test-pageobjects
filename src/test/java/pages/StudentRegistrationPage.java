package pages;

import pages.components.*;

import static com.codeborne.selenide.Selenide.*;

public class StudentRegistrationPage {
    // components
    private TextComponent textComponent = new TextComponent();
    private PlaceholderComponent placeholderComponent = new PlaceholderComponent();
    private CalendarComponent calendarComponent = new CalendarComponent();
    private TextContainerComponent textContainerComponent = new TextContainerComponent();
    private UploadFileComponent uploadFileComponent = new UploadFileComponent();

    // locators
    private String
            page = "/automation-practice-form",
            firstNameInput = "#firstName",
            lastNameInput = "#lastName",
            emailInput = "#userEmail",
            mobileNumberInput = "#userNumber",
            calendarInput = "#dateOfBirthInput",
            monthInput = ".react-datepicker__month-select",
            yearInput = ".react-datepicker__year-select",
            dayInput = ".react-datepicker__week ",
            subjectInput = "#subjectsInput",
            fileInput = "#uploadPicture";

    // actions
    public StudentRegistrationPage openPage() {
        open(page);

        return this;
    }

    public StudentRegistrationPage setFirstName(String firstName) {
        textComponent.insertValue(firstNameInput, firstName);

        return this;
    }

    public StudentRegistrationPage setLastName(String lastName) {
        textComponent.insertValue(lastNameInput, lastName);

        return this;
    }

    public StudentRegistrationPage setEmail(String email) {
        textComponent.insertValue(emailInput, email);

        return this;
    }

    public StudentRegistrationPage setGender(String gender) {
        placeholderComponent.clickOn(gender);

        return this;
    }

    public StudentRegistrationPage setMobileNumber(String mobileNumber) {
        textComponent.insertValue(mobileNumberInput, mobileNumber);

        return this;
    }

    public StudentRegistrationPage setDateOfBirth(String day, String month, String year) {
        calendarComponent.setDate(calendarInput, monthInput, yearInput, dayInput, month, year, day);

        return this;
    }

    public StudentRegistrationPage setSubjects(String subject) {
        textContainerComponent.insertValue(subjectInput, subject);

        return this;
    }

    public StudentRegistrationPage setHobbies(String hobby) {
        placeholderComponent.clickOn(hobby);

        return this;
    }

    public StudentRegistrationPage uploadPicture(String fileName) {
        uploadFileComponent.uploadFile(fileInput, fileName);

        return this;
    }
}
