package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(dryRun=false, features="featureFiles/StudentLeagues.feature", glue="stepDefinitions")
public class RunnerClass {

}
