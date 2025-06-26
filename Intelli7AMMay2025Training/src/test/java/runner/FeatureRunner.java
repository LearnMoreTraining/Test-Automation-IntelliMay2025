package runner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)

@CucumberOptions(
       features = {"src/test/resources/testdesign","src/test/resources/alphatests"},
        glue = {"stepdefinitions","hooks"},
        tags = "@Sales1",
        plugin = {"pretty",
                      "html:target/reports/report.html",
                      "json:target/reports/report.json",
                     "junit:target/reports/report.xml",
                "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
        }
)

public class FeatureRunner {
}
