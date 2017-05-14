package steps;

import cucumber.api.java.en.Given;
import framework.Browser;

/**
 * Created by dante on 3/25/17.
 */
public class Steps {
    @Given("Say hello")
    public void helloWorld(){
        System.out.println("Hello World!");
    }

    @Given("Start Chrome")
    public void startChrome(){
        Browser.startChrome();
    }
}
