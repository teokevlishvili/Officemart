import StepObject.CartSteps;
import StepObject.CompanySteps;
import StepObject.SearchSteps;
import Utils.Runner;
import com.codeborne.selenide.Condition;
import io.qameta.allure.Description;
import org.testng.Assert;
import org.testng.annotations.Test;

import static DataObject.CompanyData.*;
import static DataObject.SearchData.SearchValue3;
import static com.codeborne.selenide.Selenide.sleep;
import static java.awt.Color.red;

public class OfficemartCompany extends Runner {

    @Test
    @Description("There should be two forms 'legal entities' and 'natural entities' ")
    public void Test18() {
        SearchSteps steps = new SearchSteps();
        steps
                .GotoSearchPage()
                .Searchform()
                .SearchModel(SearchValue3)
                .SearchIcons()
                .AddCart()
                .SearchCart();
        CartSteps steps1 = new CartSteps();
        steps1
                .Continue();
        sleep(4000);

    }

    @Test
    @Description("company name")
    public void Test19() {
        SearchSteps steps = new SearchSteps();
        steps
                .GotoSearchPage()
                .Searchform()
                .SearchModel(SearchValue3)
                .SearchIcons()
                .AddCart()
                .SearchCart();
        CartSteps steps1 = new CartSteps();
        steps1
                .Continue();
        CompanySteps steps2 = new CompanySteps();
        steps2
                .CompanyButton()
                .CompanyName();
        String.valueOf(red);
        sleep(3000);
    }

    @Test
    @Description("Identification Code")
    public void Test20() {
        SearchSteps steps = new SearchSteps();
        steps
                .GotoSearchPage()
                .Searchform()
                .SearchModel(SearchValue3)
                .SearchIcons()
                .AddCart()
                .SearchCart();
        CartSteps steps1 = new CartSteps();
        steps1
                .Continue();
        CompanySteps steps2 = new CompanySteps();
        steps2
                .CompanyButton()
                .CompanyCode();
        String.valueOf(red);
        sleep(3000);
    }
    @Test
    @Description("Company address")
    public void Test21() {
        SearchSteps steps = new SearchSteps();
        steps
                .GotoSearchPage()
                .Searchform()
                .SearchModel(SearchValue3)
                .SearchIcons()
                .AddCart()
                .SearchCart();
        CartSteps steps1 = new CartSteps();
        steps1
                .Continue();
        CompanySteps steps2 = new CompanySteps();
        steps2
                .CompanyButton()
                .CompanyADDress();
        String.valueOf(red);
        sleep(3000);

    }

    @Test
    @Description("Company phone Number")
    public void Test22() {
        SearchSteps steps = new SearchSteps();
        steps
                .GotoSearchPage()
                .Searchform()
                .SearchModel(SearchValue3)
                .SearchIcons()
                .AddCart()
                .SearchCart();
        CartSteps steps1 = new CartSteps();
        steps1
                .Continue();
        CompanySteps steps2 = new CompanySteps();
        steps2
                .CompanyButton()
                .CompanyMobile();
        String.valueOf(red);
        sleep(3000);
    }

    @Test
    @Description("The box When do you want to receive the order? should turn red.")
    public void Test23() {
        SearchSteps steps = new SearchSteps();
        steps
                .GotoSearchPage()
                .Searchform()
                .SearchModel(SearchValue3)
                .SearchIcons()
                .AddCart()
                .SearchCart();
        CartSteps steps1 = new CartSteps();
        steps1
                .Continue();
        CompanySteps steps2 = new CompanySteps();
        steps2
                .CompanyButton()
                .CompanyDate();
        String.valueOf(red);
        sleep(3000);
    }

    @Test
    @Description("Company Email")
    public void Test24() {
        SearchSteps steps = new SearchSteps();
        steps
                .GotoSearchPage()
                .Searchform()
                .SearchModel(SearchValue3)
                .SearchIcons()
                .AddCart()
                .SearchCart();
        CartSteps steps1 = new CartSteps();
        steps1
                .Continue();
        CompanySteps steps2 = new CompanySteps();
        steps2
                .CompanyButton()
                .CompanyEmail();
        String.valueOf(red);
        sleep(3000);
    }

    @Test
    @Description("Company Name ")
    public void Test25() {
        SearchSteps steps = new SearchSteps();
        steps
                .GotoSearchPage()
                .Searchform()
                .SearchModel(SearchValue3)
                .SearchIcons()
                .AddCart()
                .SearchCart();
        CartSteps steps1 = new CartSteps();
        steps1
                .Continue();
        CompanySteps steps2 = new CompanySteps();
        steps2
                .CompanyButton()
                .CompanyName(CompanyValue)
                .CompanyButton();
        sleep(4000);
    }

    @Test
    @Description("No value should be entered")
    public void Test26() {
        SearchSteps steps = new SearchSteps();
        steps
                .GotoSearchPage()
                .Searchform()
                .SearchModel(SearchValue3)
                .SearchIcons()
                .AddCart()
                .SearchCart();
        CartSteps steps1 = new CartSteps();
        steps1
                .Continue();
        CompanySteps steps2 = new CompanySteps();
        steps2
                .CompanyIncorrect(IncorrectValue)
                .CompanyButton();
        sleep(4000);
    }

    @Test
    @Description("The field 'Identification code' should be red")
    public void Test27() {
        SearchSteps steps = new SearchSteps();
        steps
                .GotoSearchPage()
                .Searchform()
                .SearchModel(SearchValue3)
                .SearchIcons()
                .AddCart()
                .SearchCart();
        CartSteps steps1 = new CartSteps();
        steps1
                .Continue();
        CompanySteps steps2 = new CompanySteps();
        steps2
                .CompanyIncorrectCode(IncorrectCode1)
                .CompanyButton();
        sleep(4000);
    }

    @Test
    @Description("You must enter at least 11 characters in the field")
    public void Test28() {
        SearchSteps steps = new SearchSteps();
        steps
                .GotoSearchPage()
                .Searchform()
                .SearchModel(SearchValue3)
                .SearchIcons()
                .AddCart()
                .SearchCart();
        CartSteps steps1 = new CartSteps();
        steps1
                .Continue();
        CompanySteps steps2 = new CompanySteps();
        steps2
                .CompanyIncorrectCode2(IncorrectCode2)
                .CompanyButton();
        sleep(3000);
    }
    @Test
    @Description("The field should no longer be red")
    public void Test29() {
        SearchSteps steps = new SearchSteps();
        steps
                .GotoSearchPage()
                .Searchform()
                .SearchModel(SearchValue3)
                .SearchIcons()
                .AddCart()
                .SearchCart();
        CartSteps steps1 = new CartSteps();
        steps1
                .Continue();
        CompanySteps steps2 = new CompanySteps();
        steps2
                .CompanyCorrectCode(CorrectCode)
                .CompanyButton();
        sleep(3000);
    }
    @Test
    @Description("The field should no longer be red")
    public void Test30() {
        SearchSteps steps = new SearchSteps();
        steps
                .GotoSearchPage()
                .Searchform()
                .SearchModel(SearchValue3)
                .SearchIcons()
                .AddCart()
                .SearchCart();
        CartSteps steps1 = new CartSteps();
        steps1
                .Continue();
        CompanySteps steps2 = new CompanySteps();
        steps2
                .CompanyAddres(CompanyAdd);
        sleep(2000);
    }
    @Test
    @Description("No value should be entered in the field")
    public void Test31() {
        SearchSteps steps = new SearchSteps();
        steps
                .GotoSearchPage()
                .Searchform()
                .SearchModel(SearchValue3)
                .SearchIcons()
                .AddCart()
                .SearchCart();
        CartSteps steps1 = new CartSteps();
        steps1
                .Continue();
        CompanySteps steps2 = new CompanySteps();
        steps2
                .CompanyInCorrectPhoneNumber1(CompanyIncorrectPhoneValue1);
        sleep(2000);
    }
    @Test
    @Description("The field 'Contact number' should turn red")
    public void Test32() {
        SearchSteps steps = new SearchSteps();
        steps
                .GotoSearchPage()
                .Searchform()
                .SearchModel(SearchValue3)
                .SearchIcons()
                .AddCart()
                .SearchCart();
        CartSteps steps1 = new CartSteps();
        steps1
                .Continue();
        CompanySteps steps2 = new CompanySteps();
        steps2
                .CompanyInCorrectPhoneNumber2(CompanyIncorrectPhoneValue2);
        sleep(2000);
    }
    @Test
    @Description("At least 9 characters must be entered in the field")
    public void Test33() {
        SearchSteps steps = new SearchSteps();
        steps
                .GotoSearchPage()
                .Searchform()
                .SearchModel(SearchValue3)
                .SearchIcons()
                .AddCart()
                .SearchCart();
        CartSteps steps1 = new CartSteps();
        steps1
                .Continue();
        CompanySteps steps2 = new CompanySteps();
        steps2
                .CompanyInCorrectPhoneNumber3(CompanyIncorrectPhoneValue3);
        sleep(2000);
    }
    @Test
    @Description("The field should no longer be red")
    public void Test34() {
        SearchSteps steps = new SearchSteps();
        steps
                .GotoSearchPage()
                .Searchform()
                .SearchModel(SearchValue3)
                .SearchIcons()
                .AddCart()
                .SearchCart();
        CartSteps steps1 = new CartSteps();
        steps1
                .Continue();
        CompanySteps steps2 = new CompanySteps();
        steps2
                .CompanyCorrectPhoneNumber(CompanyCorrectPhoneValue);
        sleep(2000);
    }
    @Test
    @Description("Field When do you want to receive the order? should remain red")
    public void Test35() {
        SearchSteps steps = new SearchSteps();
        steps
                .GotoSearchPage()
                .Searchform()
                .SearchModel(SearchValue3)
                .SearchIcons()
                .AddCart()
                .SearchCart();
        CartSteps steps1 = new CartSteps();
        steps1
                .Continue();
        CompanySteps steps2 = new CompanySteps();
        steps2
                .CompanyIncorrectDate(IncorrectDateValue);
        String.valueOf(red);

    }
    @Test
    @Description("The field should no longer be red")
    public void Test36() {
        SearchSteps steps = new SearchSteps();
        steps
                .GotoSearchPage()
                .Searchform()
                .SearchModel(SearchValue3)
                .SearchIcons()
                .AddCart()
                .SearchCart();
        CartSteps steps1 = new CartSteps();
        steps1
                .Continue();
        CompanySteps steps2 = new CompanySteps();
        steps2
                .CompanyCorrectDate(CorrectDateValue);
        Assert.assertTrue(steps2.CompanyDate.is(Condition.visible));
        sleep(4000);
    }
    @Test
    @Description("The field should no longer be red")
    public void Test37() {
        SearchSteps steps = new SearchSteps();
        steps
                .GotoSearchPage()
                .Searchform()
                .SearchModel(SearchValue3)
                .SearchIcons()
                .AddCart()
                .SearchCart();
        CartSteps steps1 = new CartSteps();
        steps1
                .Continue();
        CompanySteps steps2 = new CompanySteps();
        steps2
                .CompanyCorrectMail(CorrectMailValue);
        Assert.assertTrue(steps2.CompanyDate.is(Condition.visible));
        sleep(4000);
    }
    @Test
    @Description("The 'E-mail' field should remain red")
    public void Test38() {
        SearchSteps steps = new SearchSteps();
        steps
                .GotoSearchPage()
                .Searchform()
                .SearchModel(SearchValue3)
                .SearchIcons()
                .AddCart()
                .SearchCart();
        CartSteps steps1 = new CartSteps();
        steps1
                .Continue();
        CompanySteps steps2 = new CompanySteps();
        steps2
                .CompanyInCorrectMail(InCorrectMailValue1);
        Assert.assertTrue(steps2.CompanyDate.is(Condition.visible));
        sleep(4000);
    }
    @Test
    @Description("The 'E-mail' field should remain red")
    public void Test39() {
        SearchSteps steps = new SearchSteps();
        steps
                .GotoSearchPage()
                .Searchform()
                .SearchModel(SearchValue3)
                .SearchIcons()
                .AddCart()
                .SearchCart();
        CartSteps steps1 = new CartSteps();
        steps1
                .Continue();
        CompanySteps steps2 = new CompanySteps();
        steps2
                .CompanyInCorrectMail1(InCorrectMailValue2);
        Assert.assertTrue(steps2.CompanyDate.is(Condition.visible));
        sleep(4000);
    }
    @Test
    @Description("The 'E-mail' field should remain red")
    public void Test40() {
        SearchSteps steps = new SearchSteps();
        steps
                .GotoSearchPage()
                .Searchform()
                .SearchModel(SearchValue3)
                .SearchIcons()
                .AddCart()
                .SearchCart();
        CartSteps steps1 = new CartSteps();
        steps1
                .Continue();
        CompanySteps steps2 = new CompanySteps();
        steps2
                .CompanyName(CompanyValue)
                .CompanyCorrectCode(CorrectCode)
                .CompanyAddres(CompanyAdd)
                .CompanyCorrectPhoneNumber(CompanyCorrectPhoneValue)
                .CompanyCorrectDate(CorrectDateValue)
                .CompanyInCorrectMail2(InCorrectMailValue3);
        Assert.assertTrue(steps2.CompanyDate.is(Condition.visible));
        sleep(4000);
    }}



