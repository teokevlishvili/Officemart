package StepObject;

import PageObject.CompanyPage;
import com.codeborne.selenide.Condition;
import io.qameta.allure.*;

import java.time.Duration;

import static java.awt.Color.red;

public class CompanySteps extends CompanyPage {
    @Step("click continue")
    public CompanySteps CompanyButton() {
        CompanyBtn.click();
        return this;

    }
    @Step("company incorrect name")
    public CompanySteps CompanyName() {
        CompanyForm.getCssValue(String.valueOf(red));
        return this;

    }
    @Step("company incorrect code")
    public CompanySteps CompanyCode() {
        CompanyIur.getCssValue(String.valueOf(red));
        return this;
    }
    @Step("company incorrect address")
    public CompanySteps CompanyADDress() {
        CompanyAdd.getCssValue(String.valueOf(red));
        return this;
    }
    @Step("company incorrect mobile number")
    public CompanySteps CompanyMobile() {
        CompanyMob.getCssValue(String.valueOf(red));
        return this;
    }
    @Step("incorrect date")
    public CompanySteps CompanyDate() {
        CompanyIurDate.getCssValue(String.valueOf(red));
        return this;
    }
    @Step("company incorrect email")
    public CompanySteps CompanyEmail() {
        CompanyIurEmail.getCssValue(String.valueOf(red));
        return this;
    }
    @Step("company correct name ")
    public CompanySteps CompanyName(String CompanyValue) {
        CompanyN.setValue(CompanyValue);
        return this;

    }
    @Step("write company incorrect")

    public CompanySteps CompanyIncorrect(String IncorrectValue) {
        CompanyC.setValue(IncorrectValue);
        return this;
    }
    @Step("write company incorrect code")
    public CompanySteps CompanyIncorrectCode(String IncorrectCode1) {
        CompanyInC1.setValue(IncorrectCode1);
        return this;
    }
    @Step("write company incorrect code step 2")
    public CompanySteps CompanyIncorrectCode2(String IncorrectCode2) {
        CompanyInC2.setValue(IncorrectCode2);
        return this;
}
    @Step("write correct company code")
    public CompanySteps CompanyCorrectCode(String CorrectCode) {
        CompanyCorrectC.setValue(CorrectCode);
        return this;
}
    @Step("write correct company address")
    public CompanySteps CompanyAddress(String CompanyAdd) {
        CompanyA.setValue(CompanyAdd).pressEnter();
        return this;
}
    @Step("write incorrect company phone number")
    public CompanySteps CompanyInCorrectPhoneNumber1(String CompanyIncorrectPhoneValue1) {
        CompanyIncorrectP1.setValue(CompanyIncorrectPhoneValue1).pressEnter();
        return this;
}
    @Step("write incorrect company phone number step 2")
    public CompanySteps CompanyInCorrectPhoneNumber2(String CompanyIncorrectPhoneValue2) {
        CompanyIncorrectP1.setValue(CompanyIncorrectPhoneValue2).pressEnter();
        return this;
    }
    @Step("write incorrect company phone number step 3")
    public CompanySteps CompanyInCorrectPhoneNumber3(String CompanyIncorrectPhoneValue3) {
        CompanyIncorrectP1.setValue(CompanyIncorrectPhoneValue3).pressEnter();
        return this;
    }
    @Step("write correct company phone number ")
    public CompanySteps CompanyCorrectPhoneNumber(String  CompanyCorrectPhoneValue) {
        CompanyCorrectP.setValue( CompanyCorrectPhoneValue).pressEnter();
        return this;
    }
    @Step("write incorrect company date")
    public CompanySteps CompanyIncorrectDate(String IncorrectDateValue){
        CompanyDate.setValue(IncorrectDateValue).pressEnter().getCssValue(String.valueOf(red));
        return this;
    }
    @Step("write correct company date")
    public CompanySteps CompanyCorrectDate(String CorrectDateValue){
        CompanyDate.setValue(CorrectDateValue).shouldBe(Condition.visible, Duration.ofMillis(3000));
        return this;
}
    @Step("write correct company mail")
    public CompanySteps CompanyCorrectMail(String CorrectMailValue){
        CompanyMail.setValue(CorrectMailValue).shouldBe(Condition.visible, Duration.ofMillis(3000));
        return this;
    }
    @Step("write incorrect company mail")
    public CompanySteps CompanyInCorrectMail(String InCorrectMailValue1){
        CompanyMail.setValue(InCorrectMailValue1).pressEnter();
        return this;
}
    @Step("write incorrect company mail step 2")
    public CompanySteps CompanyInCorrectMail1(String InCorrectMailValue2) {
        CompanyMail.setValue(InCorrectMailValue2).pressEnter();
        return this;
    }
    @Step("write incorrect company mail step 3")
    public CompanySteps CompanyInCorrectMail2(String InCorrectMailValue3){
        CompanyMail.setValue(InCorrectMailValue3).pressEnter();
        return this;
}}


