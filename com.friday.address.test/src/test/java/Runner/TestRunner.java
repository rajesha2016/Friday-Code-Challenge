package Runner;

import java.io.File;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.cucumber.listener.Reporter;

import FrameworkLibraries.FileReaderLibrary;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="CucumberFeatureFile", 
				glue={"StepDefinitions"},
				plugin={"com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/report.html"},
				tags={"@unittest"},
				dryRun=false, 
				monochrome=true
				)
public class TestRunner {
	
	/**
	 * extent report path set up
	 */
	@AfterClass
	public static void writeExtentReport(){
		
		Reporter.loadXMLConfig(new File(FileReaderLibrary.getInstance().getConfigReader().getReportConfigPath()));
	}

}
