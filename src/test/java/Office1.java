import StepObject.SearchSteps;
import Utils.Runner;
import com.codeborne.selenide.Condition;
import org.testng.Assert;
import org.testng.annotations.*;
import java.time.Duration;

import static DataObject.SearchData.*;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;

public class Office1 extends Runner {

    @Test
    public void Search(){
        SearchSteps steps = new SearchSteps();
        steps.GotoSearchPage();
        sleep(3000);
    }

     @Test
      public void Test2(){
          SearchSteps steps = new SearchSteps();
          steps
                  .GotoSearchPage()
                  .Searchform()
                  .SearchCorrectProduct(SearchProduct);
          sleep(4000);

}

    @Test
    public void Test3(){
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
    public void Test4(){
        SearchSteps steps = new SearchSteps();
        steps
                .GotoSearchPage()
                .Searchform()
                .SearchModel(SearchValue3)
                .SearchIcons();
        sleep(4000);

    }

    @Test
    public void test5() {

        $(".search").click();
        $(".form_group").click();
        $(byXpath("//*[@id=\"searchmodal\"]/div/form/div/input")).setValue("კალამი").pressEnter();
        sleep(2000);
        $(".show_icon").click();
        $(".cart_info").click();
        Assert.assertTrue($(byText("დასახელება")).isDisplayed());
        sleep(5000);
    }
    @Test
    public void Test5(){
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
}}
