package Utils;

import com.codeborne.selenide.Configuration;
import org.testng.annotations.BeforeTest;

import static com.codeborne.selenide.Selenide.open;

public class Runner {
    @BeforeTest
    public static void setup(){
        Configuration.browserSize = "1920x1080";
       open("https://officemart.ge/ge");

    }
}
