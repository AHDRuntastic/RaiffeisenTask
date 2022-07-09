package cucumber.stepDefinitions;

import base.TestBase;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.IOException;

public class Hooks extends TestBase {

    @Before
    public void beforeScenario(){
        setup();
    }

    @After
    public void tearDown(Scenario scenario) throws IOException {
        if (scenario.isFailed()) {
            System.out.println("Failed");
            System.out.println("Taking Screenshot....");
            final byte[] screenshot = ((TakesScreenshot) driver)
                    .getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot,"image/png","Scenarios");
        }
        closeDriver();
    }
}
