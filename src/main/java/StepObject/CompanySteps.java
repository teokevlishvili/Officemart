package StepObject;

import PageObject.CompanyPage;
import com.codeborne.selenide.Condition;
import io.qameta.allure.Step;

import java.time.Duration;

import static DataObject.CompanyData.InCorrectMailValue3;
import static java.awt.Color.red;

public class CompanySteps extends CompanyPage {
    @Step
    public CompanySteps CompanyButton() {
        CompanyBtn.click();
        return this;

    }

    public void CompanyName() {
        CompanyForm.getCssValue(String.valueOf(red));

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
    public CompanySteps CompanyIncorrectDate(String IncorrectDateValue){
        CompanyDate.setValue(IncorrectDateValue).pressEnter().getCssValue(String.valueOf(red));
        return this;
    }
    public CompanySteps CompanyCorrectDate(String CorrectDateValue){
        CompanyDate.setValue(CorrectDateValue).shouldBe(Condition.visible, Duration.ofMillis(3000));
        return this;
}
    public CompanySteps CompanyCorrectMail(String CorrectMailValue){
        CompanyMail.setValue(CorrectMailValue).shouldBe(Condition.visible, Duration.ofMillis(3000));
        return this;
    }
    public CompanySteps CompanyInCorrectMail(String InCorrectMailValue1){
        CompanyMail.setValue(InCorrectMailValue1).pressEnter();
        return this;
}
    public CompanySteps CompanyInCorrectMail1(String InCorrectMailValue2) {
        CompanyMail.setValue(InCorrectMailValue2).pressEnter();
        return this;
    }
    public CompanySteps CompanyInCorrectMail2(String InCorrectMailValue3){
        CompanyMail.setValue(InCorrectMailValue3).pressEnter();
        return this;
}}


