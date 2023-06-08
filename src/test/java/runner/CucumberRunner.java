package runner;

import io.cucumber.core.cli.Main;

public class CucumberRunner {
    public static void main(String[] args) {
        String[] cucumberOptions = { "-g", "stepdefs", "-p",
                "me.jvt.cucumber.report.PrettyReports:target/cucumber", "-p",
                "json:target/cucumber-json-report/cucumber.json"};

        Main.run(cucumberOptions);
    }
}
