package org.example.base;
import org.junit.Before;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.WebDriver;

public class BaseTest {
    static WebDriver webDriver=null;
    @Before
    public void setUp(){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Furkan\\IdeaProjects\\selenium_network_project\\webDriver\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        options.addArguments("disable-notifications");
        options.addArguments("disable-popup-blocking");
        setWebDriver(new ChromeDriver(options));
        getWebDriver().navigate().to("https://www.network.com.tr/"); //bizi gideceğimiz adrese yönlendiriyor
    }
    public static WebDriver getWebDriver(){
        return webDriver;
    }
    public static void setWebDriver(WebDriver webDriver){
        BaseTest.webDriver=webDriver;
    }
    public void tearDown(){
        getWebDriver().quit();
    } //test bittikten sonra driverdan çık
}
