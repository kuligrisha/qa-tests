package com.demo.qa;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;


public class TextBoxTests extends TestBase{

    @Test
    void successfulFillFormTest() {
        open("/automation-practice-form");
        $("#firstName").setValue("Lola");
        $("#lastName").setValue("Lolovna");
        $("#userEmail").setValue("Lola@ya.ru");
        $("#userNumber").setValue("1234567890");
        $(".subjects-auto-complete__value-container subjects-auto-complete__value-container--is-multi css-1hwfws3").setValue("Math");
        $("#currentAddress").setValue("Bodrum");
        $("#userNumber").setValue("1234567890");
        $("#userNumber").setValue("1234567890");
        //$("#submit").click();

        //    $("").shouldHave(text(""));

    }
}
