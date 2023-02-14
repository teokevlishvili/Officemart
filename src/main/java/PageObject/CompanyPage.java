package PageObject;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byName;
import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;

public class CompanyPage {
    public SelenideElement
    CompanyBtn = $("#btn2"),
    CompanyForm= $(".form_group"),
    CompanyIur = $(".iur-code"),
    CompanyAdd = $(byName("address")),
    CompanyMob = $(".iur-phone"),
    CompanyIurDate = $(".iur_date"),
    CompanyIurEmail = $(byName("email")),
    CompanyN = $(byXpath("//*[@id=\"form2\"]/div[1]/input")),
    CompanyC = $(".iur-code"),
    CompanyInC1 = $(".iur-code"),
    CompanyInC2 = $(".iur-code"),
    CompanyCorrectC = $(".iur-code"),
    CompanyA = $(byName("address")),
    CompanyIncorrectP1=$(".iur-phone"),
    CompanyIncorrectP2=$(".iur-phone"),
    CompanyIncorrectP3=$(".iur-phone"),
    CompanyCorrectP=$(".iur-phone");

}
