package com.itview.testrunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		features= {"Feature/CalculatorModule.feature"},
		glue= {"com.itview.stepdefination"},
		plugin= {"pretty","html:target/cucumber-report.html"},
	    tags="@Multiply"
	    
		)

public class TestRunner {

}
