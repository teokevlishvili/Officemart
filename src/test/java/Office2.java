import Utils.Runner;
import com.codeborne.selenide.Condition;
import org.testng.annotations.*;

import java.time.Duration;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selenide.sleep;

public class Office2 extends Runner {
    @Test
    public void test11() {
        $(".search").click();
        $(".form_group").click();
        $(byXpath("//*[@id=\"searchmodal\"]/div/form/div/input")).setValue("კალამი").pressEnter();
        sleep(2000);
        $(".show_icon").click();
        $(".cart_info").click();
        $(".fa-plus").click();
        $(byText("სულ")).shouldBe(Condition.visible, Duration.ofMillis(3000));
        sleep(4000);
        //Test11

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
        //Test14

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
        //Test17 ???
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
        $(".form_group").shouldBe(Condition.visible,Duration.ofMillis(1000)); // 19
        $(".iur-code").shouldBe(Condition.visible,Duration.ofMillis(1000));   //20
        $(byName("address")).shouldBe(Condition.visible,Duration.ofMillis(1000)); //21
        $(".iur-phone").shouldBe(Condition.visible,Duration.ofMillis(1000)); //22
        $(".iur_date").shouldBe(Condition.visible,Duration.ofMillis(1000)); //23
        $(byName("email")).shouldBe(Condition.visible,Duration.ofMillis(1000)); //24
        sleep(3000);
        //Test19

    }

}