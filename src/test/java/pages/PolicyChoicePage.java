package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class PolicyChoicePage {
    public static final SelenideElement goldPolicyShowButton = $("button[data-param*='GOLD'][data-broadcast-one-wrapper='showPolicyPlanCovered']");
    public static final SelenideElement policyInfoDialog = $(".single-popup-focus");
    public static final SelenideElement closePopupButton = $(".popup-close");
    public static final SelenideElement goldPolicySelectButton = $("button[data-param*='GOLD'][data-broadcast-one-wrapper='selectAndSubmit']");
    public static final SelenideElement policyChoices = $(".policy-items");
}

