import StepObject.CartSteps;
import StepObject.CompanySteps;
import StepObject.SearchSteps;
import Utils.Runner;
import com.codeborne.selenide.Condition;
import org.testng.Assert;
import org.testng.annotations.*;
import java.time.Duration;

import static DataObject.CompanyData.*;
import static DataObject.SearchData.*;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;
import static java.awt.Color.red;


public class Office1 extends Runner {


    @Test
    public void Search() {
        SearchSteps steps = new SearchSteps();
        steps.GotoSearchPage();
        sleep(3000);
    }

    @Test
    public void Test2() {
        SearchSteps steps = new SearchSteps();
        steps
                .GotoSearchPage()
                .Searchform()
                .SearchCorrectProduct(SearchProduct);
        sleep(4000);

    }

    @Test
    public void Test3() {
        SearchSteps steps = new SearchSteps();
        steps
                .GotoSearchPage()
                .Searchform()
                .SearchInCorrectProduct(SearchIncorrectValue);
        sleep(4000);

    }

    @Test
    public void test4() {

        $(".search").click();
        $(".form_group").click();
        $(byXpath("//*[@id=\"searchmodal\"]/div/form/div/input")).setValue("კალამი").pressEnter();
        sleep(2000);
        $(".show_icon").click();
        sleep(5000);
        //4test
    }

    @Test
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
    public void Test5() {
        SearchSteps steps = new SearchSteps();
        steps
                .GotoSearchPage()
                .Searchform()
                .SearchModel(SearchValue3)
                .SearchIcons()
                .SearchCart();
        Assert.assertTrue(steps.SearchCartName.isDisplayed());
        sleep(5000);

    }

    @Test
    public void test6() {

        $(".search").click();
        $(".form_group").click();
        $(byXpath("//*[@id=\"searchmodal\"]/div/form/div/input")).setValue("კალამი").pressEnter();
        sleep(2000);
        $(".show_icon").click();
        $(".cart_info").click();
        Assert.assertTrue($(byText("ფერი")).isDisplayed());
        sleep(5000);
    }

    @Test
    public void Test6() {
        SearchSteps steps = new SearchSteps();
        steps
                .GotoSearchPage()
                .Searchform()
                .SearchModel(SearchValue3)
                .SearchIcons()
                .SearchCart();
        Assert.assertTrue(steps.SearchCartColor.isDisplayed());
        sleep(4000);
    }

    @Test
    public void test7() {

        $(".search").click();
        $(".form_group").click();
        $(byXpath("//*[@id=\"searchmodal\"]/div/form/div/input")).setValue("კალამი").pressEnter();
        sleep(2000);
        $(".show_icon").click();
        $(".cart_info").click();
        $(byText("#2/505B")).shouldBe(Condition.visible, Duration.ofMillis(3000));
        sleep(5000);
    }

    @Test
    public void Test7() {
        SearchSteps steps = new SearchSteps();
        steps
                .GotoSearchPage()
                .Searchform()
                .SearchModel(SearchValue3)
                .SearchIcons()
                .SearchCart();
        Assert.assertTrue(steps.SearchCOde.is(Condition.visible));
        sleep(4000);

    }

    @Test
    public void test8() {

        $(".search").click();
        $(".form_group").click();
        $(byXpath("//*[@id=\"searchmodal\"]/div/form/div/input")).setValue("კალამი").pressEnter();
        sleep(2000);
        $(".show_icon").click();
        $(".cart_info").click();
        //$(byName("quantity")).setValue("1").shouldBe(Condition.visible, Duration.ofMillis(3000));
        Assert.assertTrue($(byName("quantity")).setValue("1").isDisplayed());
        sleep(5000);
    }

    @Test
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
        sleep(5000);
    }

    @Test
    public void test9() {

        $(".search").click();
        $(".form_group").click();
        $(byXpath("//*[@id=\"searchmodal\"]/div/form/div/input")).setValue("კალამი").pressEnter();
        sleep(2000);
        $(".show_icon").click();
        $(".cart_info").click();
        $(".prod_price").shouldBe(Condition.visible, Duration.ofMillis(3000));
        sleep(5000);
    }

    @Test
    public void Test9() {
        SearchSteps steps = new SearchSteps();
        steps
                .GotoSearchPage()
                .Searchform()
                .SearchModel(SearchValue3)
                .SearchIcons()
                .SearchCart();
        Assert.assertTrue(steps.SearchProductPrice.is(Condition.visible));
        sleep(5000);
    }

    @Test
    public void test10() {

        $(".search").click();
        $(".form_group").click();
        $(byXpath("//*[@id=\"searchmodal\"]/div/form/div/input")).setValue("კალამი").pressEnter();
        sleep(2000);
        $(".show_icon").click();
        $(".cart_info").click();
        $(".fullPriceFor").shouldBe(Condition.visible, Duration.ofMillis(3000));
        sleep(5000);
    }

    @Test
    public void Test10() {
        SearchSteps steps = new SearchSteps();
        steps
                .GotoSearchPage()
                .Searchform()
                .SearchModel(SearchValue3)
                .SearchIcons()
                .SearchCart();
        Assert.assertTrue(steps.SearchProductFullPrice.is(Condition.visible));
        sleep(4000);

    }

    @Test
    public void test11() {
        $(".search").click();
        $(".form_group").click();
        $(byXpath("//*[@id=\"searchmodal\"]/div/form/div/input")).setValue("კალამი").pressEnter();
        sleep(2000);
        $(".show_icon").click();
        $(".cart_info").click();
        $(".fa-plus").click();
        $(".fullPriceFor").shouldBe(Condition.visible, Duration.ofMillis(3000));
        sleep(4000);


    }

    @Test
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
        sleep(5000);

    }

    @Test
    public void test12() {
        $(".search").click();
        $(".form_group").click();
        $(byXpath("//*[@id=\"searchmodal\"]/div/form/div/input")).setValue("კალამი").pressEnter();
        sleep(2000);
        $(".show_icon").click();
        $(".cart_info").click();
        $(".fa-plus").click();
        sleep(3000);
        $(".fa-minus").click();
        $(byText("სულ")).shouldBe(Condition.visible, Duration.ofMillis(3000));
        sleep(4000);
        //Test12
    }

    @Test
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
                .GoToAddQuantity()
                .CartMin();
        Assert.assertTrue(steps.SearchProductFullPrice.is(Condition.visible));
        sleep(5000);

    }

    @Test
    public void test13() {
        $(".search").click();
        $(".form_group").click();
        $(byXpath("//*[@id=\"searchmodal\"]/div/form/div/input")).setValue("კალამი").pressEnter();
        sleep(2000);
        $(".show_icon").click();
        $(".cart_info").click();
        $(".fa-times").click();
        sleep(4000);
        //Test13
    }

    @Test
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
    public void test14() {
        $(".search").click();
        $(".form_group").click();
        $(byXpath("//*[@id=\"searchmodal\"]/div/form/div/input")).setValue("კალამი").pressEnter();
        sleep(2000);
        $(".show_icon").click();
        sleep(2000);
        $(byXpath("/html/body/div[5]/div[2]/div/div[4]/div[3]/div[2]/div[2]/a/img[1]")).click();
        sleep(2000);
        $(".cart_info").click();
        sleep(2000);
        $(byText("კალათის გასუფთავება")).click();
        sleep(3000);
        //Test14}
    }

    @Test
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
    public void test15() {
        $(".search").click();
        $(".form_group").click();
        $(byXpath("//*[@id=\"searchmodal\"]/div/form/div/input")).setValue("კალამი").pressEnter();
        sleep(2000);
        $(".show_icon").click();
        sleep(2000);
        $(byXpath("/html/body/div[5]/div[2]/div/div[4]/div[3]/div[2]/div[2]/a/img[1]")).click();
        sleep(2000);
        $(".cart_info").click();
        sleep(2000);
        $(byText("კალათის გასუფთავება")).click();
        sleep(3000);
        $(byText("კალათა ცარიელია")).shouldBe(Condition.visible, Duration.ofMillis(3000));
        sleep(3000);
        //Test15

    }

    @Test
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
    public void test16() {
        $(".search").click();
        $(".form_group").click();
        $(byXpath("//*[@id=\"searchmodal\"]/div/form/div/input")).setValue("კალამი").pressEnter();
        sleep(2000);
        $(".show_icon").click();
        sleep(2000);
        $(byXpath("/html/body/div[5]/div[2]/div/div[4]/div[3]/div[2]/div[2]/a/img[1]")).click();
        sleep(2000);
        $(".cart_info").click();
        sleep(2000);
        $(byText("კალათის გასუფთავება")).click();
        sleep(3000);
        $(byText("გაგრძელება")).shouldBe(Condition.disappear, Duration.ofMillis(3000));
        sleep(3000);
        //Test16???
    }

    @Test
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
    public void test17() {
        $(".search").click();
        $(".form_group").click();
        $(byXpath("//*[@id=\"searchmodal\"]/div/form/div/input")).setValue("კალამი").pressEnter();
        sleep(2000);
        $(".show_icon").click();
        sleep(2000);
        $(byXpath("/html/body/div[5]/div[2]/div/div[4]/div[3]/div[2]/div[2]/a/img[1]")).click();
        sleep(2000);
        $(".cart_info").click();
        sleep(2000);
        $(byText("კალათის გასუფთავება")).click();
        sleep(3000);
        $(byText("კალათის გასუფთავება")).shouldBe(Condition.disappear, Duration.ofMillis(3000));
        sleep(3000);
    }

    @Test
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
    public void test18() {
        $(".search").click();
        $(".form_group").click();
        $(byXpath("//*[@id=\"searchmodal\"]/div/form/div/input")).setValue("კალამი").pressEnter();
        sleep(2000);
        $(".show_icon").click();
        sleep(2000);
        $(byXpath("/html/body/div[5]/div[2]/div/div[4]/div[3]/div[2]/div[2]/a/img[1]")).click();
        sleep(2000);
        $(".cart_info").click();
        sleep(2000);
        $(".continue").click();

        sleep(5000);
    }

    @Test
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

    public void test19() {
        $(".search").click();
        $(".form_group").click();
        $(byXpath("//*[@id=\"searchmodal\"]/div/form/div/input")).setValue("კალამი").pressEnter();
        sleep(2000);
        $(".show_icon").click();
        sleep(2000);
        $(".cart_info").click();
        sleep(2000);
        $(".continue").click();
        sleep(3000);
        $("#btn2").click();
        sleep(2000);
        $(".form_group").getCssValue(String.valueOf(red));//19

    }

    @Test
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

    public void test20() {
        $(".search").click();
        $(".form_group").click();
        $(byXpath("//*[@id=\"searchmodal\"]/div/form/div/input")).setValue("კალამი").pressEnter();
        sleep(2000);
        $(".show_icon").click();
        sleep(2000);
        $(".cart_info").click();
        sleep(2000);
        $(".continue").click();
        sleep(3000);
        $("#btn2").click();
        sleep(2000);

    }

    @Test
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

    public void test21() {
        $(".search").click();
        $(".form_group").click();
        $(byXpath("//*[@id=\"searchmodal\"]/div/form/div/input")).setValue("კალამი").pressEnter();
        sleep(2000);
        $(".show_icon").click();
        sleep(2000);
        $(".cart_info").click();
        sleep(2000);
        $(".continue").click();
        sleep(3000);
        $("#btn2").click();
        $(byName("address")).getCssValue(String.valueOf(red));
    }

    @Test
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

