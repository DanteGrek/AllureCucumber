package framework;

import io.github.bonigarcia.wdm.ChromeDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Created by dante on 5/9/17.
 */
public class Browser {

    private static WebDriver driver;

    private Browser(){
    }

    public static WebDriver getInstance(){
        return driver;
    }

    public static WebDriver startChrome(){
        if(driver == null) {
            ChromeDriverManager.getInstance().setup();
            driver = new ChromeDriver();
        }
        return driver;
    }

    public static void setUrl(String url){
        driver.get(url);
    }

    public static void tearDown(){
        if(driver != null){
            driver.quit();
            driver = null;
        }
    }


}
