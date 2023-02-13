import Utils.Runner;
import com.codeborne.selenide.Condition;
import org.testng.annotations.Test;

import java.time.Duration;

import static com.codeborne.selenide.Selectors.byName;
import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.sleep;

public class Office3 extends Runner {
    @Test
    public void test25() {
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
        $(byXpath("//*[@id=\"form2\"]/div[1]/input")).setValue("Office").pressEnter();
        sleep(2000);
        $("#btn2").click();
        sleep(3000);
        //Test25
    }

    @Test
    public void test26() {
        $(".search").click();
        $(".form_group").click();
        $(byXpath("//*[@id=\"searchmodal\"]/div/form/div/input")).setValue("ფლომასტერი").pressEnter();
        sleep(2000);
        $(".show_icon").click();
        sleep(2000);
        $(".cart_info").click();
        sleep(2000);
        $(".continue").click();
        sleep(3000);
        $("#btn2").click();
        sleep(2000);
        $(".iur-code").setValue("Office").pressEnter();
        $(".iur-code").shouldBe(Condition.empty);
        sleep(4000);
        //Test26
    }

    @Test
    public void test27() {
        $(".search").click();
        $(".form_group").click();
        $(byXpath("//*[@id=\"searchmodal\"]/div/form/div/input")).setValue("ფლომასტერი").pressEnter();
        sleep(2000);
        $(".show_icon").click();
        sleep(2000);
        $(".cart_info").click();
        sleep(2000);
        $(".continue").click();
        sleep(2000);
        $(".iur-code").setValue("12345678").pressEnter();
        sleep(4000);
        //Test27

    }

    @Test
    public void test28() {
        $(".search").click();
        $(".form_group").click();
        $(byXpath("//*[@id=\"searchmodal\"]/div/form/div/input")).setValue("ფლომასტერი").pressEnter();
        sleep(2000);
        $(".show_icon").click();
        sleep(2000);
        $(".cart_info").click();
        sleep(2000);
        $(".continue").click();
        sleep(2000);
        $(".iur-code").setValue("123456789111").pressEnter();
        sleep(4000);
        //Test28 პროგრამა არ მაწერინებს 9 სიმბოლოზე მეტს

    }

    @Test
    public void test29() {
        $(".search").click();
        $(".form_group").click();
        $(byXpath("//*[@id=\"searchmodal\"]/div/form/div/input")).setValue("ფლომასტერი").pressEnter();
        sleep(2000);
        $(".show_icon").click();
        sleep(2000);
        $(".cart_info").click();
        sleep(2000);
        $(".continue").click();
        sleep(2000);
        $(".iur-code").setValue("123456789").pressEnter();
        sleep(4000);
        //Test29
    }

    @Test
    public void test30() {
        $(".search").click();
        $(".form_group").click();
        $(byXpath("//*[@id=\"searchmodal\"]/div/form/div/input")).setValue("ფლომასტერი").pressEnter();
        sleep(2000);
        $(".show_icon").click();
        sleep(2000);
        $(".cart_info").click();
        sleep(2000);
        $(".continue").click();
        sleep(2000);
        $(byName("address")).setValue("ბარამიძის 5ა").pressEnter();
        sleep(4000);
        //Test30
    }

    @Test
    public void test31() {
        $(".search").click();
        $(".form_group").click();
        $(byXpath("//*[@id=\"searchmodal\"]/div/form/div/input")).setValue("ფლომასტერი").pressEnter();
        sleep(2000);
        $(".show_icon").click();
        sleep(2000);
        $(".cart_info").click();
        sleep(2000);
        $(".continue").click();
        sleep(2000);
        $(".iur-phone").setValue("nomeri").pressEnter();
        sleep(4000);
        //Test31
    }

    @Test
    public void test32() {
        $(".search").click();
        $(".form_group").click();
        $(byXpath("//*[@id=\"searchmodal\"]/div/form/div/input")).setValue("ფლომასტერი").pressEnter();
        sleep(2000);
        $(".show_icon").click();
        sleep(2000);
        $(".cart_info").click();
        sleep(2000);
        $(".continue").click();
        sleep(2000);
        $(".iur-phone").setValue("12345678").pressEnter();
        sleep(4000);
        //Test32
    }

    @Test
    public void test33() {
        $(".search").click();
        $(".form_group").click();
        $(byXpath("//*[@id=\"searchmodal\"]/div/form/div/input")).setValue("ფლომასტერი").pressEnter();
        sleep(2000);
        $(".show_icon").click();
        sleep(2000);
        $(".cart_info").click();
        sleep(2000);
        $(".continue").click();
        sleep(2000);
        $(".iur-phone").setValue("123456789012").pressEnter();
        sleep(4000);
        //Test33


    }

    @Test
    public void test34() {
        $(".search").click();
        $(".form_group").click();
        $(byXpath("//*[@id=\"searchmodal\"]/div/form/div/input")).setValue("ფლომასტერი").pressEnter();
        sleep(2000);
        $(".show_icon").click();
        sleep(2000);
        $(".cart_info").click();
        sleep(2000);
        $(".continue").click();
        sleep(2000);
        $(".iur-phone").setValue("555123456").pressEnter();
        sleep(4000);
    }

    @Test
    public void test35() {
        $(".search").click();
        $(".form_group").click();
        $(byXpath("//*[@id=\"searchmodal\"]/div/form/div/input")).setValue("ფლომასტერი").pressEnter();
        sleep(2000);
        $(".show_icon").click();
        sleep(2000);
        $(".cart_info").click();
        sleep(2000);
        $(".continue").click();
        sleep(2000);
        $(".iur_date").setValue("simb").pressEnter();
        sleep(4000);
        //Test35
    }

    @Test
    public void test36() {
        $(".search").click();
        $(".form_group").click();
        $(byXpath("//*[@id=\"searchmodal\"]/div/form/div/input")).setValue("ფლომასტერი").pressEnter();
        sleep(2000);
        $(".show_icon").click();
        sleep(2000);
        $(".cart_info").click();
        sleep(2000);
        $(".continue").click();
        sleep(2000);
        $(".iur_date").setValue("1 მარტი").pressEnter();
        sleep(4000);
        //Test36
    }

    @Test
    public void test37() {
        $(".search").click();
        $(".form_group").click();
        $(byXpath("//*[@id=\"searchmodal\"]/div/form/div/input")).setValue("ფლომასტერი").pressEnter();
        sleep(2000);
        $(".show_icon").click();
        sleep(2000);
        $(".cart_info").click();
        sleep(2000);
        $(".continue").click();
        sleep(2000);
        $(".iur-code").setValue("123456789").pressEnter();
        $(byName("email")).setValue("test@gmail.com").pressEnter();
        sleep(4000);
        //TEST37
    }
    @Test
    public void test38() {
        $(".search").click();
        $(".form_group").click();
        $(byXpath("//*[@id=\"searchmodal\"]/div/form/div/input")).setValue("ფლომასტერი").pressEnter();
        sleep(2000);
        $(".show_icon").click();
        sleep(2000);
        $(".cart_info").click();
        sleep(2000);
        $(".continue").click();
        sleep(2000);
        $(byName("email")).setValue("test.gmail.com").pressEnter();
        sleep(4000);
        //TEST38
    }
    @Test
    public void test39() {
        $(".search").click();
        $(".form_group").click();
        $(byXpath("//*[@id=\"searchmodal\"]/div/form/div/input")).setValue("ფლომასტერი").pressEnter();
        sleep(2000);
        $(".show_icon").click();
        sleep(2000);
        $(".cart_info").click();
        sleep(2000);
        $(".continue").click();
        sleep(2000);
        $(byName("email")).setValue("test@gmail").pressEnter();
        sleep(4000);
        //TEST39
}
    @Test
    public void test40() {
        $(".search").click();
        $(".form_group").click();
        $(byXpath("//*[@id=\"searchmodal\"]/div/form/div/input")).setValue("ფლომასტერი").pressEnter();
        sleep(2000);
        $(".show_icon").click();
        sleep(2000);
        $(".cart_info").click();
        sleep(2000);
        $(".continue").click();
        sleep(2000);
        $(byXpath("//*[@id=\"form2\"]/div[1]/input")).setValue("Office").pressEnter();
        $(".iur-code").setValue("123456789").pressEnter();
        $(byName("address")).setValue("ბარამიძის 5ა").pressEnter();
        $(".iur-phone").setValue("555123456").pressEnter();
        $(".iur_date").setValue("1 მარტი").pressEnter();
        $(byName("email")).setValue("test.gmail@").pressEnter();

        sleep(4000);
        //TEST40 თუ არ შეივსო მეილამდე ინფორმაცია არ წითლდება ველი
    }
}