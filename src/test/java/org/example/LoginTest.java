package org.example;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;

public class LoginTest {

    @Test
    void standardUserCanLogin() {
        Configuration.browser = "chrome";
        open("https://www.saucedemo.com/");

        $("#user-name").setValue("standard_user");
        $("#password").setValue("secret_sauce");
        $("#login-button").click();

        $(".inventory_list").shouldBe(visible);
    }
}
