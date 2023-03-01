package StepObject;
import PageObject.CartPage;
import io.qameta.allure.*;


public class CartSteps extends CartPage {
    @Step("add quantity")
    public CartSteps GoToAddQuantity() {
        CartFullPrice.click();
        return this;
    }

    @Step("press min")
    public CartSteps CartMin() {
        CartQuantityMin.click();
        return this;

    }

    @Step("cart clear")
    public CartSteps CartDelete() {
        CartClear.click();
        return this;
    }
    @Step("add cart product")
    public CartSteps AddCart() {
        CartAdd.click();
        return this;
    }
    @Step("clear cart")
    public CartSteps CartClear() {
        CartFullClear.click();
        return this;

    }
    @Step("There should be two forms 'legal entities' and 'natural entities'")
    public CartSteps Continue() {
        CartContinue1.click();
        return this;

    }
}
