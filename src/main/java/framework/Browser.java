package framework;

import io.github.bonigarcia.wdm.ChromeDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Created by dante on 5/9/17.
 */
public final class Browser {

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

    public static void main(String[] args) {
        Browser.startChrome();
        Browser.setUrl("https://www.google.com");
        System.out.println(Browser.getInstance().getCurrentUrl().equals("https://www.google.com"));
        Browser.tearDown();
    }

}
