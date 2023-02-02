package Com.Runner_class;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\Dinesh K\\eclipse-workspace\\TagExpo\\src\\test\\resources\\Feature\\ForBuyer.feature",
             glue="Com.stepdefinition",plugin= {"pretty","html:CucumberReport/DatabaseBuyer.html","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"})

public class Runner_class {
	
}
