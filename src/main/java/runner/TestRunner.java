package runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\vikas\\eclipse-workspace\\CucumberFramework\\features", glue = {
		"stepDefinition" }, monochrome = true, plugin = { "pretty", "html:target/HtmlReports",
				"junit:target/JUnitReports/report.xml", "json:target/JSONReports/report.json" })

public class TestRunner {

}
