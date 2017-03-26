package test_runners;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import org.testng.annotations.Test;

/**
 * Created by dante on 3/25/17.
 */
@Test
@CucumberOptions(features = {"src/test/java/features"}, glue = "steps", tags = "@hello")
public class HelloTest extends AbstractTestNGCucumberTests {
}
