package util;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static java.lang.Thread.*;

public class Hook {
    protected static WebDriver driver;

    @Before
    public void before(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver(); //abre o navegador
    }
   /*@After
    public void after(){
        driver.quit(); //fecha o navegador não importando quantas abas abertas
    }
*/
    public static WebDriver getDriver(){
        return driver;
    }
}
