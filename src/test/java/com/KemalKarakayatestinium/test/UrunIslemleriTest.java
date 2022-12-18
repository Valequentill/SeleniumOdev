package com.KemalKarakayatestinium.test;

import com.KemalKarakayatestinium.driver.AnaTestim;
import com.KemalKarakayatestinium.pages.LoginPage;
import com.KemalKarakayatestinium.pages.UrunIslemleri;
import org.junit.Test;

public class UrunIslemleriTest extends AnaTestim {
    @Test
    public void productTest(){
        LoginPage loginPage = new LoginPage();
        UrunIslemleri urunIslemleri = new UrunIslemleri();
        loginPage.Login();
        urunIslemleri.UrunSecme();
    }


}
