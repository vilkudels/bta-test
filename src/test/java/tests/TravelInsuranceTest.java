package tests;

import org.junit.jupiter.api.Test;
import pages.*;

import java.time.Duration;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.$$;
import static com.codeborne.selenide.Selenide.open;

public class TravelInsuranceTest {

    @Test
    public void travelInsurancePolicyTest() {

        // go to www.bta.lv
        open("https://www.bta.lv");

        // close cookies dialog if it pops up
        if ($$("button").filterBy(text("Piekrītu")).first().exists()) {
            $$("button").filterBy(text("Piekrītu")).first().click();
        }

        // go to "Ceļojumi" page
        HomePage.travelMenuItem.click();

        // set destination to Indija
        TravelInsuranceFormPage.regionSelector.click();
        TravelInsuranceFormPage.countryList.click();
        TravelInsuranceFormPage.addCountryButton.click();
        TravelInsuranceFormPage.typedValueInput.sendKeys("Indija");
        TravelInsuranceFormPage.countryOptionIndia.click();
        TravelInsuranceFormPage.addCountryButton.click();
        TravelInsuranceFormPage.removeCountryButton.shouldHave(text("Indija"));
        TravelInsuranceFormPage.applyButton.click();

        // select activities
        TravelInsuranceFormPage.travelActivitiesOpen.scrollIntoView("{behavior: \"instant\", block: \"center\", inline: \"center\"}").click();
        TravelInsuranceFormPage.travelActivitiesOption1.click();
        TravelInsuranceFormPage.travelActivitiesOpen.shouldHave(text("Ar paaugstināta riska aktivitātēm"));
        TravelInsuranceFormPage.offerButton.scrollIntoView("{behavior: \"instant\", block: \"center\", inline: \"center\"}").click();

        // choose policy type
        PolicyChoicePage.policyChoices.shouldBe(visible, Duration.ofSeconds(10));
        PolicyChoicePage.goldPolicyShowButton.scrollIntoView("{behavior: \"instant\", block: \"center\", inline: \"center\"}").click();
        assert (PolicyChoicePage.policyInfoDialog.isDisplayed());
        PolicyChoicePage.closePopupButton.click();
        PolicyChoicePage.goldPolicySelectButton.click();

        // continue to the travelers page
        AdditionalOptionsPage.continueButton.click();

        // check that travelers fields are visible and empty
        TravelersPage.firstNameInput.shouldBe(visible).shouldHave(value(""));
        TravelersPage.lastNameInput.shouldBe(visible).shouldHave(value(""));
        TravelersPage.identityNumberInput.shouldBe(visible).shouldHave(value(""));
    }
}
