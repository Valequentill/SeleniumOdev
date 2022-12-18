package com.KemalKarakayatestinium.pages;

import com.KemalKarakayatestinium.Methodlarim.Methods;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;

public class SatinAlmaIslemleri {
    Methods methods;
    Logger logger = LogManager.getLogger(UrunIslemleri.class);
    public SatinAlmaIslemleri(){
        methods = new Methods();
    }

    public void satinAlma(){
        methods.click(By.xpath("(//a[@style='display: inline;'])[2]"));
        methods.waitbySeconds(2);
        methods.sendKeys(By.xpath("//input[@id='address-firstname-companyname']"),"Kemal");
        methods.sendKeys(By.xpath("//input[@id='address-lastname-title']"),"Karakaya");
        methods.selectFromDropdown();
        methods.waitbySeconds(2);
        methods.selectFromDropdown2();
        methods.sendKeys(By.xpath("//input[@id='district']"),"mahallem");
        methods.sendKeys(By.xpath("//textarea[@id='address-address-text']"),"adresim");
        methods.sendKeys(By.xpath("//input[@id='address-postcode']"),"22100");
        methods.sendKeys(By.xpath("//input[@id='address-mobile-telephone']"),"5382433792");
        methods.sendKeys(By.xpath("//input[@id='address-telephone']"),"2126564727");
        methods.waitbySeconds(2);
        methods.click(By.xpath("//button[@id='button-checkout-continue']"));
        methods.waitbySeconds(5);
        methods.click(By.xpath("//button[@id='button-checkout-continue']"));
        methods.waitbySeconds(5);
        methods.sendKeys(By.xpath("//input[@id='credit-card-owner']"),"selam");
        methods.sendKeys(By.xpath("//input[@id='credit_card_number_1']"),"2222333344445555");
        methods.selectFromDropdown3();
        methods.selectFromDropdown4();
        methods.sendKeys(By.xpath("//input[@id='credit-card-security-code']"),"444");
        methods.waitbySeconds(2);
        methods.click(By.xpath("//button[@id='button-checkout-continue']"));
        methods.waitbySeconds(3);
        Assert.assertTrue(methods.isElementVisible(By.xpath("//span[text()='Kart numarası geçersiz. Kontrol ediniz!']")));





    }

}
