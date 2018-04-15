package Amazone;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Browser_Factory extends BasePage {
Load_Prop load_prop = new Load_Prop();
String browser1 = load_prop.getProperty("browser");
public void selectBrowser(){
    System.out.println(browser1);
    if (browser1.equalsIgnoreCase("Firefox")){
        System.setProperty("webdriver.gecko.driver","src\\Resources\\java\\DriverResources\\geckodriver.exe");
        driver=new FirefoxDriver();
        }else if (browser1.equalsIgnoreCase("Chrome")){
        System.setProperty("webdriver.chrome.driver","src\\Resources\\java\\DriverResources\\chromedriver.exe");
        driver=new ChromeDriver();
    }else if (browser1.equalsIgnoreCase("IE")){
        System.setProperty("webdriver.ie.driver","src\\Resources\\java\\DriverResources\\IEDriverServer.exe");
        DesiredCapabilities capabilities=DesiredCapabilities.internetExplorer();
        capabilities.setCapability(CapabilityType.ACCEPT_SSL_CERTS,true);
        driver=new InternetExplorerDriver(capabilities);
        }else {
        System.out.println("Browser name is wrong :- " +browser1);
    }
    }
}

