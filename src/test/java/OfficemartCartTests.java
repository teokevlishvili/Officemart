import StepObject.CartSteps;
import StepObject.SearchSteps;
import Utils.Runner;
import com.codeborne.selenide.Condition;
import io.qameta.allure.Description;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import static DataObject.SearchData.SearchValue3;
import static com.codeborne.selenide.Selenide.sleep;

@Listeners(Utils.TestLister.class)
public class OfficemartCartTests extends Runner {
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
        sleep(3000);
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
}
