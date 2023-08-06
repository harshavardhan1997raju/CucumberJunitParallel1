package testRunner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/appFeatures",
        glue= {"stepdefinitions","AppHooks"},
        monochrome=false,
//       dryRun = true,
        plugin= {"pretty", "html:target/HTMLReports/HTMLReports.html",
                "json:target/JSONReports/JSONReports.json",
                "junit:target/JUNITReports/JUNITReports.xml",
                "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
                "timeline:test-output-thread"
        }
//       tags = "@acc"


)

public class MyTestRunner {
}
