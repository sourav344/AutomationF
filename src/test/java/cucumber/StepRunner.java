package cucumber;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src/test/java/cucumber",glue="stepdefinition",monochrome=true, tags="@tagGoogleSingle", plugin= {"html:target/cucumber.html"})
public class StepRunner extends AbstractTestNGCucumberTests{

}
