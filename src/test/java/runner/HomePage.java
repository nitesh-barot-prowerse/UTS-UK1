package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/resources/features/HomePage.feature"
                , "src/test/resources/features/QuotePage.feature"
                , "src/test/resources/features/Policy.feature"
                , "src/test/resources/features/ManageClaims.feature"
                , "src/test/resources/features/ApproveClaim.feature"
                , "src/test/resources/features/TaskPage.feature"
                , "src/test/resources/features/AccountPage.feature"
                , "src/test/resources/features/AdminPage.feature"
                , "src/test/resources/features/LogOut.feature"
                , "src/test/resources/features/Report.feature"
                , "src/test/resources/features/Setting.feature"
                , "src/test/resources/features/Login.feature"
                , "src/test/resources/features/ClientPage.feature"
                , "src/test/resources/features/DashBoardItems.feature"},
        glue = {"steps", "hook"},
        monochrome = true,
        plugin = {"pretty",
                "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
)

public class HomePage {
}
