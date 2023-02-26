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
    @Description("Test Case N1,click search button")
    public void Search() {
        SearchSteps steps = new SearchSteps();
        steps.GotoSearchPage();
        sleep(2000);
    }

    @Test(priority = 1)
    @Description("Test Case N2,search correct item")
    public void Test2() {
        SearchSteps steps = new SearchSteps();
        steps
                .GotoSearchPage()
                .Searchform()
                .SearchCorrectProduct(SearchProduct);
    }

    @Test
    @Description("Test Case N3,search incorrect item")
    public void Test3() {
        SearchSteps steps = new SearchSteps();
        steps
                .GotoSearchPage()
                .Searchform()
                .SearchInCorrectProduct(SearchIncorrectValue);
        sleep(2000);

    }

    @Test
    @Description("Test Case N4,The product has been successfully added to the cart")
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
    @Description("Test Case N5,Added product name")
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
    @Description("Test Case N6 Added product color")
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
    @Description("Test Case N7 Added product code")
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
    @Description("Test Case N8 Quantity of product added")
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
    @Description("Test Case N9 Added product price")
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
    @Description("Test Case N10 The sum of the product added")
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
}

