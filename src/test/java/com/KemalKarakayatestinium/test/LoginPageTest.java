package com.KemalKarakayatestinium.test;

import com.KemalKarakayatestinium.driver.AnaTestim;
import com.KemalKarakayatestinium.pages.LoginPage;
import org.junit.Test;

public class LoginPageTest extends AnaTestim {
    @Test
    public void loginTest(){
        LoginPage loginPage = new LoginPage();
        loginPage.Login();
    }
}
