package org.example.base;
import com.opencsv.exceptions.CsvValidationException;
import org.apache.log4j.LogManager;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.WebElement;


import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import com.opencsv.CSVReader;
import org.apache.log4j.Logger;

import static org.junit.Assert.assertEquals;


public class BasePage {
    private static Logger logger= LogManager.getLogger(BasePage.class);
    List<String> listOfAllWebElements = new ArrayList<String>();
    private static String baseUrl;
    private static String beklenenUrl;
    String csvFile="C:\\Users\\Furkan\\IdeaProjects\\selenium_network_project\\mailVerileri.csv";
    WebDriver driver=null;
    WebDriverWait wait=null;

    public BasePage(WebDriver driver){
        this.driver=driver;
        this.wait=new WebDriverWait(driver,60); //web driverın maksimum bekleme süresi
    }
    public WebElement findElement(By by){
        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(by));
        return driver.findElement(by);
    } // bu metot driver.find element diye uzatmak yerine findElement(By.id) yazmak yeterli olması için
    public void click(By by){
        wait.until(ExpectedConditions.elementToBeClickable(by));
        findElement(by).click();
    } //element clickable olduğundan sonra verilen elemente click yapılır
    public void sendKeys(By by,String text){
        findElement(by).sendKeys(text);
        logger.info(text + " keyi gönderildi");
    }
    public void urlAssertions() throws Exception{
        String url="https://www.network.com.tr/";
        driver.get(url);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        String strUrl= driver.getCurrentUrl();
        logger.info("current"+ strUrl);
        assertEquals(url,strUrl);
    }
    public void clickEnter(){
        Actions actions=new Actions(driver);
        actions.sendKeys(Keys.ENTER).build().perform();
    }
    public void scrollToText(By by){
        WebElement element =driver.findElement(by);
        Actions actions = new Actions(driver);
        actions.moveToElement(element);
        actions.perform();
    }
    public void ikinciSayfadaUrlAssertions() throws Exception{
        String url="https://www.network.com.tr/search?searchKey=ceket&page=2";
        driver.get(url);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        String strUrl= driver.getCurrentUrl();
        System.out.println("current "+strUrl);
        assertEquals(url,strUrl);
    }
    public void hoverElement(By by){
        Actions actions=new Actions(driver);
        actions.moveToElement(findElement(by)).build().perform();
    }
    public void randomClick(By by){
        List<WebElement> links=driver.findElements(by);
        WebElement random=links.get(new Random().nextInt(links.size()));
        random.click();
    }
    public void waitSecond(){
        driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
    }
    public void addListElement(By by){
        listOfAllWebElements.add(driver.findElement(by).getText());
    }
    public void checkBirinciveIkinciEleman(){
        assertEquals(listOfAllWebElements.get(0),listOfAllWebElements.get(1));
        logger.info(listOfAllWebElements.get(0));
        logger.info(listOfAllWebElements.get(1));
        logger.info(listOfAllWebElements.get(0) + listOfAllWebElements.get(1) + "birbirine eşittir");
    }
    public void readCsvAndSendData(By by,By by2) throws IOException, CsvValidationException {
        CSVReader reader=new CSVReader(new FileReader(csvFile));
        String[] cell;
        while((cell=reader.readNext())!=null){
            for(int i=0;i<1;i++){
                String ePosta=cell[i];
                String password=cell[i+1];
                logger.info("Eposta: "+ePosta);
                logger.info("Password "+password);
                driver.findElement(by).sendKeys(ePosta);
                driver.findElement(by2).sendKeys(password);
            }
        }
    }
    public void butonKontrol(By by){
        if(!driver.findElements(by).isEmpty()){
            logger.info("Element mevcut");
        }else{
            logger.info("Element mevcut değil");
        }
    }
    public void textKontrol(String text){
        String bodyText = driver.findElement(By.tagName("body")).getText();
        Assert.assertTrue("Text not found!", bodyText.contains(text));
        logger.info("Text: " +text);
    }
}
