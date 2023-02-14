package PageObject;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;

public class CartPage {
    public SelenideElement
    CartFullPrice = $(".fa-plus"),
    CartQuantityMin = $(".fa-minus"),
    CartClear  =$(".fa-times"),
    CartAdd = $(byXpath("/html/body/div[5]/div[2]/div/div[4]/div[3]/div[2]/div[2]/a/img[1]")),
    CartFullClear = $(byText("კალათის გასუფთავება")),
    CartIsClear = $(byText("კალათა ცარიელია")),
    CartContinue = $(byText("გაგრძელება")),
    CartClean = $(byText("კალათის გასუფთავება")),
    CartContinue1 = $(".continue");




    }
