package runner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)

@CucumberOptions(
       features = {"src/test/resources/testdesign","src/test/resources/alphatests"},
        glue = {"stepdefinitions"},
        tags = "@wiki01"
)

public class FeatureRunner {
}
