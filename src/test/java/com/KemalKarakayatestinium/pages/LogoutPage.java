package com.KemalKarakayatestinium.pages;

import com.KemalKarakayatestinium.Methodlarim.Methods;
import org.openqa.selenium.By;

public class LogoutPage {
    Methods methods;
    public LogoutPage(){methods = new Methods();}

    public void Logout(){
        methods.click(By.cssSelector(".checkout-logo"));
        methods.cikis();
        methods.logoutKontrolu(By.xpath("//a[text()='Giriş Yap']"));
    }


}
