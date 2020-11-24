package runner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/Featuers"
        ,glue= {"com.stepdefnition"},
        plugin = { "pretty" ,"html:target/cucumber-reports", "json:target/cucumber-reports/Cucumber.json"},
        monochrome = true
)

public class Testrunner {

}