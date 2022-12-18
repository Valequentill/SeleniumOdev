package com.KemalKarakayatestinium.pages;

import com.KemalKarakayatestinium.Methodlarim.Methods;
import org.junit.Assert;
import org.openqa.selenium.By;

public class LoginPage {
    Methods methods;

    public LoginPage(){
        methods = new Methods();
    }

    public void Login(){
        methods.click(By.cssSelector(".popup-accept-button"));
        methods.waitbySeconds(2);
        methods.click(By.cssSelector(".menu-top-button.login>a"));
        methods.sendKeys(By.id("login-email"),"kemalkarakaya111@gmail.com");
        methods.sendKeys(By.id("login-password"),"1234asdf");
        methods.waitbySeconds(2);
        methods.click(By.cssSelector(".ky-form-buttons>button"));
        methods.waitbySeconds(5);
        Assert.assertTrue(methods.loginKontrolu(By.cssSelector(".welcome.fl>div>ul>li>a")));

    }

}
