package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = "steps",
        tags = "@wip2",
        plugin = {"html:target/generated-reports/cucumber.html", "json:target/generated-reports/cucumber.json", "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
)

public class Runner {

}
