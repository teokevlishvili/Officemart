package StepObject;
import PageObject.CartPage;
import io.qameta.allure.Step;


public class CartSteps extends CartPage {
    @Step
    public CartSteps GoToAddQuantity() {
        CartFullPrice.click();
        return this;
    }

    @Step
    public CartSteps CartMin() {
        CartQuantityMin.click();
        return this;

    }

    @Step
    public CartSteps CartDelete() {
        CartClear.click();
        return this;
    }

    public CartSteps AddCart() {
        CartAdd.click();
        return this;
    }

    public CartSteps CartClear() {
        CartFullClear.click();
        return this;

    }

    public CartSteps Continue() {
        CartContinue1.click();
        return this;

    }
}
