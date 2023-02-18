package StepObject;

import PageObject.SearchPage;
import io.qameta.allure.Step;


public class SearchSteps extends SearchPage {

@Step("click search button")
    public SearchSteps GotoSearchPage() {
        SearchButton.click();
        return this;
    }

    @Step("search form click")
    public SearchSteps Searchform() {
        SearchForm.click();
        return this;
    }

    @Step("search correct item")
    public SearchSteps SearchCorrectProduct(String SearchProduct) {
        SearchInput.setValue(SearchProduct).pressEnter();
        return this;
    }

    @Step("search incorrect item")
    public SearchSteps SearchInCorrectProduct(String SearchIncorrectValue) {
        SearchIncorrectInput.setValue(SearchIncorrectValue).pressEnter();
        return this;
    }
    @Step("add item")
    public SearchSteps SearchModel(String SearchValue3) {
        SearchPen.setValue(SearchValue3).pressEnter();
        return this;

    }

    public SearchSteps SearchIcons() {
        SearchIcon.click();
        return this;
    }

    public SearchSteps SearchCart() {
        SearchCartInfo.click();
        return this;
    }
@Step("search item quantity")
    public SearchSteps SEARCHQuantity(String Quantity) {
        SearchQuantity.setValue(Quantity);
        return this;
    }

    public SearchSteps AddCart() {
        CartAdd.click();
        return this;

    }
}






