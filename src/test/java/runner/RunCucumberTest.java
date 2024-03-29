package runner;

import org.junit.platform.suite.api.ConfigurationParameter;
import org.junit.platform.suite.api.IncludeEngines;
import org.junit.platform.suite.api.SelectClasspathResource;
import org.junit.platform.suite.api.Suite;

import static io.cucumber.junit.platform.engine.Constants.*;

@Suite
@IncludeEngines("cucumber")
@SelectClasspathResource("stepdefs")
@ConfigurationParameter(key = GLUE_PROPERTY_NAME, value = "stepdefs")
@ConfigurationParameter(key = FEATURES_PROPERTY_NAME, value = "src/test/resources/features/web")
@ConfigurationParameter(key = PLUGIN_PROPERTY_NAME, value = "html:target/cucumber-html-report.html")
@ConfigurationParameter(key = PLUGIN_PROPERTY_NAME, value = "json:target/cucumber-json-report/cucumber.json")
public class RunCucumberTest {
}
