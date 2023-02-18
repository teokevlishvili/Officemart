import StepObject.CartSteps;
import StepObject.CompanySteps;
import StepObject.SearchSteps;
import Utils.Retry;
import Utils.Runner;
import com.codeborne.selenide.Condition;
import io.qameta.allure.Description;
import org.testng.Assert;
import org.testng.annotations.*;
import java.time.Duration;
import static DataObject.CompanyData.*;
import static DataObject.SearchData.*;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;
import static java.awt.Color.red;

@Listeners(Utils.TestLister.class)
public class Officemart extends Runner {


    @Test(retryAnalyzer = Retry.class)
    @Description("click search button")
    public void Search() {
        SearchSteps steps = new SearchSteps();
        steps.GotoSearchPage();
        sleep(2000);
    }

    @Test
    @Description("search correct item")
    public void Test2() {
        SearchSteps steps = new SearchSteps();
        steps
                .GotoSearchPage()
                .Searchform()
                .SearchCorrectProduct(SearchProduct);
        sleep(2000);

    }

    @Test
    @Description("search incorrect item")
    public void Test3() {
        SearchSteps steps = new SearchSteps();
        steps
                .GotoSearchPage()
                .Searchform()
                .SearchInCorrectProduct(SearchIncorrectValue);
        sleep(2000);

    }

    @Test
    @Description("The product has been successfully added to the cart")
    public void Test4() {
        SearchSteps steps = new SearchSteps();
        steps
                .GotoSearchPage()
                .Searchform()
                .SearchModel(SearchValue3)
                .SearchIcons();
        sleep(4000);

    }

    @Test
    @Description("Added product name")
    public void Test5() {
        SearchSteps steps = new SearchSteps();
        steps
                .GotoSearchPage()
                .Searchform()
                .SearchModel(SearchValue3)
                .SearchIcons()
                .SearchCart();
        Assert.assertTrue(steps.SearchCartName.isDisplayed());
        sleep(3000);

    }

    @Test
    @Description("Added product color")
    public void Test6() {
        SearchSteps steps = new SearchSteps();
        steps
                .GotoSearchPage()
                .Searchform()
                .SearchModel(SearchValue3)
                .SearchIcons()
                .SearchCart();
        Assert.assertTrue(steps.SearchCartColor.isDisplayed());
        sleep(3000);
    }

    @Test
    @Description("Added product code")
    public void Test7() {
        SearchSteps steps = new SearchSteps();
        steps
                .GotoSearchPage()
                .Searchform()
                .SearchModel(SearchValue3)
                .SearchIcons()
                .SearchCart();
        Assert.assertTrue(steps.SearchCOde.is(Condition.visible));
        sleep(3000);

    }

    @Test
    @Description("Quantity of product added")
    public void Test8() {
        SearchSteps steps = new SearchSteps();
        steps
                .GotoSearchPage()
                .Searchform()
                .SearchModel(SearchValue3)
                .SearchIcons()
                .SearchCart()
                .SEARCHQuantity(Quantity);
        Assert.assertTrue(steps.SearchQuantity.isDisplayed());
        sleep(3000);
    }
    @Test
    @Description("Added product price")
    public void Test9() {
        SearchSteps steps = new SearchSteps();
        steps
                .GotoSearchPage()
                .Searchform()
                .SearchModel(SearchValue3)
                .SearchIcons()
                .SearchCart();
        Assert.assertTrue(steps.SearchProductPrice.is(Condition.visible));
        sleep(3000);
    }

    @Test
    @Description("The sum of the product added")
    public void Test10() {
        SearchSteps steps = new SearchSteps();
        steps
                .GotoSearchPage()
                .Searchform()
                .SearchModel(SearchValue3)
                .SearchIcons()
                .SearchCart();
        Assert.assertTrue(steps.SearchProductFullPrice.is(Condition.visible));
        sleep(3000);

    }

    @Test
    @Description("total value")
    public void Test11() {
        SearchSteps steps = new SearchSteps();
        steps
                .GotoSearchPage()
                .Searchform()
                .SearchModel(SearchValue3)
                .SearchIcons()
                .SearchCart();
        CartSteps steps1 = new CartSteps();
        steps1.GoToAddQuantity();
        Assert.assertTrue(steps.SearchProductFullPrice.is(Condition.visible));
        sleep(3000);

    }

    @Test
    @Description("total value")
    public void Test12() {
        SearchSteps steps = new SearchSteps();
        steps
                .GotoSearchPage()
                .Searchform()
                .SearchModel(SearchValue3)
                .SearchIcons()
                .SearchCart();
        CartSteps steps1 = new CartSteps();
        steps1
                .GoToAddQuantity()
                .CartMin();
        Assert.assertTrue(steps.SearchProductFullPrice.is(Condition.visible));
        sleep(5000);

    }
    @Test
    @Description("The product disappears from the cart")
    public void Test13() {
        SearchSteps steps = new SearchSteps();
        steps
                .GotoSearchPage()
                .Searchform()
                .SearchModel(SearchValue3)
                .SearchIcons()
                .SearchCart();
        CartSteps steps1 = new CartSteps();
        steps1.CartDelete();
        sleep(5000);
    }

    @Test
    @Description("Clear Cart")
    public void Test14() {
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
                .CartClear();
        sleep(5000);
    }

    @Test
    @Description("The cart is empty")
    public void Test15() {
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
                .CartClear();
        Assert.assertTrue(steps1.CartIsClear.is(Condition.visible));
        sleep(5000);
    }

    @Test
    @Description("Continue button disappeared")
    public void Test16() {
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
                .CartClear();
        Assert.assertTrue(steps1.CartContinue.is(Condition.disappear));
        sleep(4000);
    }

    @Test
    @Description("Clear Cart button is gone")
    public void Test17() {
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
                .CartClear();
        Assert.assertTrue(steps1.CartClean.is(Condition.disappear));
        sleep(4000);
    }

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

