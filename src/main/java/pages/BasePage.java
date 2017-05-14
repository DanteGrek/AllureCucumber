package pages;

import framework.Browser;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by dante on 5/14/17.
 */
public abstract class BasePage {

    public BasePage() {
        PageFactory.initElements(Browser.getInstance(), this);
    }

    private WebDriverWait initWait(){
        return new WebDriverWait(Browser.getInstance(), 5);
    }

    private WebDriverWait initWait(int time){
        return new WebDriverWait(Browser.getInstance(), time);
    }

    public WebElement waitForElement(WebElement element){
        return initWait().until(ExpectedConditions.elementToBeClickable(element));
    }

    public void click(WebElement element){
        waitForElement(element).click();
    }
}
