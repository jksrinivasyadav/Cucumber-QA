package runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
@CucumberOptions(features="src/test/java/features",glue= {"stepDefinition"})
@RunWith(Cucumber.class)
public class Runner {

}
