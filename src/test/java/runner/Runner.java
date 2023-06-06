package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.DataProvider;

@CucumberOptions(
        features = "src/test/resources/features",
        glue = "steps",
        tags = "@regressao",
        plugin = {"html:target/generated-reports/cucumber.html", "json:target/generated-reports/cucumber.json", "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
)

public class Runner extends AbstractTestNGCucumberTests {
    @Override
    @DataProvider(parallel=true)
    public Object[][] scenarios()
    {
        return super.scenarios();
    }
}
