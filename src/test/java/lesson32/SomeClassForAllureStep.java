package lesson32;

import io.qameta.allure.Step;

public class SomeClassForAllureStep {
    @Step(value = "This method does something with name {name}")
    public void someMethod(String name){
        System.out.println("do something with name" + name);

    }

    @Step(value = "This method opens url {url}")
    public void open(String url){
        System.out.println("open url" + url);
    }
}
