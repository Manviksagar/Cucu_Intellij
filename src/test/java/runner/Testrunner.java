package runner;

import com.cucumber.listener.Reporter;
import org.junit.AfterClass;
import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

import java.io.File;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/Featuers"
        ,glue= {"com.stepdefnition"},
        plugin = { "pretty" ,"html:target/cucumber-reports", "json:target/cucumber-reports/Cucumber.json",
                "com.cucumber.listener.ExtentCucumberFormatter:target/html/ExtentReport.html"},

        monochrome = true
)

public class Testrunner {

    @AfterClass
    public static void setup()
    {
        Reporter.loadXMLConfig(new File("src/test/resources/extent-config.xml"));
//Reporter.setSystemInfo("Test User", System.getProperty("user.name"));
        Reporter.setSystemInfo("User Name", "AJ");
        Reporter.setSystemInfo("Application Name", "Test App ");
        Reporter.setSystemInfo("Operating System Type", System.getProperty("os.name").toString());
        Reporter.setSystemInfo("Environment", "Production");
        Reporter.setTestRunnerOutput("Test Execution Cucumber Report");
    }

}