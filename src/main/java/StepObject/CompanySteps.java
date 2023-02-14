package StepObject;

import PageObject.CompanyPage;
import io.qameta.allure.Step;

import static java.awt.Color.red;

public class CompanySteps extends CompanyPage {
    @Step
    public CompanySteps CompanyButton() {
        CompanyBtn.click();
        return this;

    }

    public CompanySteps CompanyName() {
        CompanyForm.getCssValue(String.valueOf(red));
        return this;

    }

    public CompanySteps CompanyCode() {
        CompanyIur.getCssValue(String.valueOf(red));
        return this;
    }

    public CompanySteps CompanyADDress() {
        CompanyAdd.getCssValue(String.valueOf(red));
        return this;
    }

    public CompanySteps CompanyMobile() {
        CompanyMob.getCssValue(String.valueOf(red));
        return this;
    }

    public CompanySteps CompanyDate() {
        CompanyIurDate.getCssValue(String.valueOf(red));
        return this;
    }

    public CompanySteps CompanyEmail() {
        CompanyIurEmail.getCssValue(String.valueOf(red));
        return this;
    }

    public CompanySteps CompanyName(String CompanyValue) {
        CompanyN.setValue(CompanyValue);
        return this;

    }

    public CompanySteps CompanyIncorrect(String IncorrectValue) {
        CompanyC.setValue(IncorrectValue);
        return this;
    }

    public CompanySteps CompanyIncorrectCode(String IncorrectCode1) {
        CompanyInC1.setValue(IncorrectCode1);
        return this;
    }
    public CompanySteps CompanyIncorrectCode2(String IncorrectCode2) {
        CompanyInC2.setValue(IncorrectCode2);
        return this;
}
    public CompanySteps CompanyCorrectCode(String CorrectCode) {
        CompanyCorrectC.setValue(CorrectCode);
        return this;
}
    public CompanySteps CompanyAddres(String CompanyAdd) {
        CompanyA.setValue(CompanyAdd).pressEnter();
        return this;
}
    public CompanySteps CompanyInCorrectPhoneNumber1(String CompanyIncorrectPhoneValue1) {
        CompanyIncorrectP1.setValue(CompanyIncorrectPhoneValue1).pressEnter();
        return this;
}
    public CompanySteps CompanyInCorrectPhoneNumber2(String CompanyIncorrectPhoneValue2) {
        CompanyIncorrectP1.setValue(CompanyIncorrectPhoneValue2).pressEnter();
        return this;
    }
    public CompanySteps CompanyInCorrectPhoneNumber3(String CompanyIncorrectPhoneValue3) {
        CompanyIncorrectP1.setValue(CompanyIncorrectPhoneValue3).pressEnter();
        return this;
    }
    public CompanySteps CompanyCorrectPhoneNumber(String  CompanyCorrectPhoneValue) {
        CompanyCorrectP.setValue( CompanyCorrectPhoneValue).pressEnter();
        return this;
    }
}