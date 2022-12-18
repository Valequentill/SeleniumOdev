package com.KemalKarakayatestinium.test;

import com.KemalKarakayatestinium.driver.AnaTestim;
import com.KemalKarakayatestinium.pages.LoginPage;
import com.KemalKarakayatestinium.pages.SatinAlmaIslemleri;
import com.KemalKarakayatestinium.pages.UrunIslemleri;
import org.junit.Test;

public class SatinAlmaIslemleriTest extends AnaTestim {
    @Test
    public void satinAlmaTest(){
        LoginPage loginPage = new LoginPage();
        UrunIslemleri urunIslemleri = new UrunIslemleri();
        SatinAlmaIslemleri satinAlma = new SatinAlmaIslemleri();
        loginPage.Login();
        urunIslemleri.UrunSecme();
        satinAlma.satinAlma();

    }
}
