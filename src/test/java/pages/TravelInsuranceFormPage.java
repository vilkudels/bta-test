package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class TravelInsuranceFormPage {
    public static final SelenideElement regionSelector = $("#regionalSelectorRegion-open");
    public static final SelenideElement countryList = $("#regionalSelectorCountry-showListSearch");
    public static final SelenideElement addCountryButton = $("#regionalSelectorCountry-addCountry");
    public static final SelenideElement typedValueInput = $("#regionalSelectorCountry-typedValue");
    public static final SelenideElement countryOptionIndia = $("button[data-value='Indija']");
    public static final SelenideElement removeCountryButton = $("#regionalSelectorCountry-removeCountry-0");
    public static final SelenideElement applyButton = $("#regionalSelectorCountry-applyButton");
    public static final SelenideElement travelActivitiesOpen = $("#travelActivities-open");
    public static final SelenideElement travelActivitiesOption1 = $("#travelActivities-popup-select-option-1");
    public static final SelenideElement offerButton = $(byText("Saņemt piedāvājumu"));
}
