package PageObjects;

import Amazone.Load_Prop;
import Amazone.Utils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import java.util.concurrent.TimeUnit;

public class HomePage extends Utils {

    Load_Prop load_prop=new Load_Prop();
    String url = load_prop.getProperty("url");

    public void getUrl(){
        driver.get(url);
    }
    public void babyStore(){
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        WebElement element = driver.findElement(By.xpath("//div[@id='nav-shop']/a"));
        Actions action = new Actions(driver);    // object of  actions class
        action.moveToElement(element).build().perform();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        WebElement element1 = driver.findElement(By.xpath("//div[@id='nav-flyout-shopAll']/div[2]/span[14]"));
        action.moveToElement(element1).build().perform();
        captureScreenShot("toys,chilren &baby"+randomDate());
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        WebElement element2=driver.findElement(By.xpath("//div[@id='nav-flyout-shopAll']/div[3]/div[14]/div/a[2]/span"));
        //captureScreenShot("baby store"+randomDate());
        action.moveToElement(element2).click().build().perform();
    }
}
