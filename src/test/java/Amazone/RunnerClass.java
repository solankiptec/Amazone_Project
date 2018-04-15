package Amazone;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\Resources\\java\\Amazone",format = {} ,tags ="@baby")

public class  RunnerClass {
}
