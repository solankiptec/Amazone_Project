package Amazone;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import java.util.concurrent.TimeUnit;

public class Hooks extends Utils{
    Browser_Factory browser_factory = new Browser_Factory();
    Load_Prop load_prop = new Load_Prop();
    private String file;


    @Before
    public void set_up_Browser() {
    browser_factory.selectBrowser();
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.getCurrentUrl();
        driver.getTitle();
    }

@After
/**
 * Embed a screenshot in test report if test is marked as failed
 */
 public void quitDriver(Scenario scenario) {
    if(scenario.isFailed()) {
        captureScreenshot(browser_factory.browser1 +"__"+ scenario.getName()+"__");
       //captureScreenShot(scenario.getName()+file);

    }
    driver.quit();
}

}


