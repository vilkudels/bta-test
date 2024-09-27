package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class AdditionalOptionsPage {
    public static final SelenideElement continueButton = $(byText("Turpināt"));
}
