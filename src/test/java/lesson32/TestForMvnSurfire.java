package lesson32;

import io.qameta.allure.*;
import org.testng.annotations.Test;
import pattern.pageobject.selenide.MainPageLogic;

public class TestForMvnSurfire {
    @Test
    @Owner("Alex")
    @Description("Test check something")
    @Severity(SeverityLevel.NORMAL)
    public void testSureFirePlugin() {
        System.out.println("Message for test");
        SomeClassForAllureStep someClassForAllureStep = new SomeClassForAllureStep();
        someClassForAllureStep.open("dasda");
        someClassForAllureStep.someMethod("dasda");
    }
}
