package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class TravelersPage {
    public static final SelenideElement firstNameInput = $("#travelerFirstName0-text");
    public static final SelenideElement lastNameInput = $("#travelerLastName0-text");
    public static final SelenideElement identityNumberInput = $("#travelerIdentityNumber0-text");
}
