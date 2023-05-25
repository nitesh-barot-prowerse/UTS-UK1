package runner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features/QuoteVerification.feature",
        glue = {"steps", "hook"},
        monochrome = true,
        plugin = { "pretty",
                "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:" }
)
public class QuoteVerify {
}
