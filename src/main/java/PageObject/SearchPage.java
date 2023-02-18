package PageObject;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;

public class SearchPage {
    public SelenideElement
    SearchButton = $(".fa-search"),
    SearchForm = $(".form_group"),
    SearchInput = $(byXpath("//*[@id=\"searchmodal\"]/div/form/div/input")),
    SearchIncorrectInput = $(byXpath("//*[@id=\"searchmodal\"]/div/form/div/input")),
    SearchPen = $(byXpath("//*[@id=\"searchmodal\"]/div/form/div/input")),
    SearchIcon = $(".show_icon"),
    SearchCartInfo = $(".cart_info"),
    SearchCartName = $(byText("დასახელება")),
    SearchCartColor = ($(byText("ფერი"))),
    SearchCOde = $(byText("#2/505B")),
    SearchQuantity = $(byName("quantity")),
    SearchProductPrice = $(".prod_price"),

    SearchProductFullPrice = $(".fullPriceFor"),
    CartAdd = $(byXpath("/html/body/div[5]/div[2]/div/div[4]/div[3]/div[2]/div[2]/a/img[1]"));




    }
