package com.KemalKarakayatestinium.test;

import com.KemalKarakayatestinium.driver.AnaTestim;
import com.KemalKarakayatestinium.pages.LoginPage;
import com.KemalKarakayatestinium.pages.LogoutPage;
import com.KemalKarakayatestinium.pages.SatinAlmaIslemleri;
import com.KemalKarakayatestinium.pages.UrunIslemleri;
import org.junit.Test;

public class LogoutPageTest extends AnaTestim {
    @Test
            public void LogoutPageTest(){
        LoginPage loginPage = new LoginPage();
        UrunIslemleri urunIslemleri = new UrunIslemleri();
        SatinAlmaIslemleri satinAlma = new SatinAlmaIslemleri();
        LogoutPage logout = new LogoutPage();
        loginPage.Login();
        urunIslemleri.UrunSecme();
        satinAlma.satinAlma();
        logout.Logout();
}}
