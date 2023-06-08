package stepdefs;

import org.junit.platform.suite.api.ConfigurationParameter;
import org.junit.platform.suite.api.IncludeEngines;
import org.junit.platform.suite.api.SelectClasspathResource;
import org.junit.platform.suite.api.Suite;

import static io.cucumber.junit.platform.engine.Constants.PLUGIN_PROPERTY_NAME;

@Suite
@IncludeEngines("cucumber")
@SelectClasspathResource("stepdefs")
@ConfigurationParameter(key = PLUGIN_PROPERTY_NAME, value = "me.jvt.cucumber.report.PrettyReports:target/cucumber")
@ConfigurationParameter(key = PLUGIN_PROPERTY_NAME, value = "json:target/cucumber-json-report/cucumber.json")
public class RunCucumberTest {
}
