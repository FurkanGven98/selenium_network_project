package org.example.pages;

import org.example.base.BasePage;
import com.opencsv.exceptions.CsvValidationException;
import org.openqa.selenium.WebDriver;


import java.io.IOException;

import static org.example.elements.networkSiteElements.*;

public class NetworkSitePages extends BasePage {
    public NetworkSitePages(WebDriver driver){
        super(driver);
    }
    public NetworkSitePages checkAnasayfa() throws Exception {
        urlAssertions();
        return this;
    }
    public NetworkSitePages clickCerezlerikabulEt(){
        click(tumCerezleriKabulEt);
        return this;
    }
    public NetworkSitePages sendKeyAramaAlani(){
        sendKeys(anasayfaAramaAlani,"ceket");
        return this;
    }
    public NetworkSitePages clickEnterKey(){
        clickEnter();
        return this;
    }
    public NetworkSitePages scrollToElement(){
        scrollToText(dahaFazlaGosterButon);
        return this;
    }
    public NetworkSitePages clickDahafazlaGoster(){
        click(dahaFazlaGosterButon);
        return this;
    }
    public NetworkSitePages ikinciSayfadaurlKontrol() throws Exception {
        ikinciSayfadaUrlAssertions();
        return this;
    }
    public NetworkSitePages hoverIlkIndirimsizUrun(){
        hoverElement(indirimliIlkUrun);

        return this;
    }
    public NetworkSitePages randomClickBeden(){
        randomClick(bulunanIlkBeden);
        return this;
    }
    public NetworkSitePages clickSepeteGit(){
        click(sepeteGitButonu);
        return this;
    }
    public NetworkSitePages waitSaniye(){
        waitSecond();
        return this;
    }
    public NetworkSitePages listeyeBedenEkle(){
        addListElement(bulunanIlkBeden);
        return this;
    }
    public NetworkSitePages sepetimBedenListeyeEkle(){
        addListElement(sepetimUrunBedeni);
        return this;
    }
    public NetworkSitePages bedenKarsilastirmasi(){
        checkBirinciveIkinciEleman();
        return this;
    }
    public NetworkSitePages clickSepetimDevamEt(){
        click(sepetimDevamEtButon);
        return this;
    }
    public NetworkSitePages readCsvSendData() throws CsvValidationException, IOException {
        readCsvAndSendData(emailAlani,passwordAlani);
        return this;
    }
    public NetworkSitePages kontrolButon(){
        butonKontrol(loginGirisYapButon);
        return this;
    }
    public NetworkSitePages clickNetworkLogo(){
        click(networkLogo);
        return this;
    }
    public NetworkSitePages clickAnasayfaSepetimLogo(){
        click(anasayfasepetimLogo);
        return this;
    }
    public NetworkSitePages clickSepetimSilButon(){
        click(sepetimSilButon);
        return this;
    }
    public NetworkSitePages clickSepetimdenCikart(){
        click(sepetimdenCikartButon);
        return this;
    }
    public NetworkSitePages sepetbosKontrol(){
        textKontrol("Sepetiniz Henüz Boş");
        return this;
    }

}
