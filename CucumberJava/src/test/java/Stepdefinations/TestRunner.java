package Stepdefinations;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\resources\\Features",glue= {"Stepdefinations"},
monochrome=true,
//plugin= {"pretty","json:target/JSONReports/report.json"}
//plugin= {"pretty","junit:target/JunitReports/report.xml"})
//plugin= {"pretty","html:target/Cucumber-Reports/report.html"})
plugin= {"pretty","junit:target/JunitReports/report.xml",
		"json:target/JSONReports/report.json",
		"html:target/HtmlReports"})


public class TestRunner {

}
