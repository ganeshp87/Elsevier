package MyRunner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import stepDefinitions.MyScreenRecorder;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/main/java/Features", 
		glue = { "stepDefinitions" }, 
		plugin = { "pretty", "html:target/cucumber", "json:target/cucumber/cucumber.json"}, 
		monochrome = true, 
		strict = true,
		dryRun = false
		)

public class TestRunner {

	private static final Logger LOG = LoggerFactory.getLogger(TestRunner.class);

	@BeforeClass
	public static void beforeClass() throws Exception {

		LOG.info("Screen Recordings Starting");
		MyScreenRecorder.startRecording("Elseiver Test");
	}

	@AfterClass
	public static void afterClass() throws Exception {
		MyScreenRecorder.stopRecording();
		LOG.info("Screen Recordings Ending");
	}

}
