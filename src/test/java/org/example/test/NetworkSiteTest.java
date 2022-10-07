package org.example.test;

import org.example.base.BaseTest;
import org.apache.log4j.PropertyConfigurator;
import org.example.pages.NetworkSitePages;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class NetworkSiteTest extends BaseTest {
    NetworkSitePages networkSitePages;
    @Before
    public void before(){
        networkSitePages= new NetworkSitePages(getWebDriver());
        PropertyConfigurator.configure("C:\\Users\\Furkan\\IdeaProjects\\selenium_network_project\\log4j.properties");
    }
    @Test
    public void test() throws Exception {
        networkSitePages.checkAnasayfa()
                .clickCerezlerikabulEt()
                .sendKeyAramaAlani()
                .clickEnterKey()
                .scrollToElement()
                .clickDahafazlaGoster()
                .ikinciSayfadaurlKontrol()
                .sendKeyAramaAlani()
                .clickEnterKey()
                .waitSaniye()
                .hoverIlkIndirimsizUrun()
                .listeyeBedenEkle()
                .randomClickBeden()
                .clickSepeteGit()
                .sepetimBedenListeyeEkle()
                .bedenKarsilastirmasi()
                .clickSepetimDevamEt()
                .readCsvSendData()
                .kontrolButon()
                .clickNetworkLogo()
                .clickAnasayfaSepetimLogo()
                .clickSepetimSilButon()
                .clickSepetimdenCikart()
                .clickAnasayfaSepetimLogo()
                .waitSaniye()
                .sepetbosKontrol()
        ;
    }
    @After
    public void after(){
        tearDown();
    }

}
