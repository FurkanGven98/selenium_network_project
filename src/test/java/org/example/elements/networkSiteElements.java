package org.example.elements;

import org.openqa.selenium.By;

public class networkSiteElements {
    public static final By anasayfaAramaAlani=By.xpath("//input[@name='searchKey']"); //elementler sabit olduğu için final atandı
    public static final By tumCerezleriKabulEt=By.id("onetrust-accept-btn-handler");
    public static final By dahaFazlaGosterButon=By.xpath("//button[@class='button -secondary -sm relative']");
    public static final By indirimliIlkUrun=By.xpath("(//div[@class='product__discountPercent -dualSmall '])[1]");
    public static final By bulunanIlkBeden=By.xpath("(//label[@class='radio-box__label '])[1]");
    public static final By sepeteGitButonu=By.xpath("//a[@class='button -primary header__basket--checkout header__basketModal -checkout']");
    public static final By sepetimUrunBedeni=By.xpath("(//span[@class='cartItem__attrValue'])[1]");
    public static final By sepetimDevamEtButon=By.xpath("//button[@class='continueButton n-button large block text-center -primary']");
    public static final By emailAlani=By.id("n-input-email");
    public static final By passwordAlani=By.id("n-input-password");
    public static final By loginGirisYapButon=By.xpath("//button[@class='n-button large block text-center -primary ']");
    public static final By networkLogo=By.xpath("//a[@class='headerCheckout__logo']");
    public static final By anasayfasepetimLogo=By.xpath("//button[@class='header__basketTrigger js-basket-trigger -desktop']");
    public static final By sepetimSilButon=By.xpath("//div[@class='header__basketProductBtn header__basketModal -remove']");
    public static final By sepetimdenCikartButon=By.xpath("//button[@class='btn -black o-removeCartModal__button']");
}

