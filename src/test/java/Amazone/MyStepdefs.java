package Amazone;

import PageObjects.HomePage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;

import java.util.concurrent.TimeUnit;

public class MyStepdefs extends BasePage{

    HomePage homePage = new HomePage();
    String expected = "Baby Stor";

    @Given("^user on home page$")
    public void user_on_home_page()  {
        homePage.getUrl();
    }

    @When("^user go on toys,children baby and baby$")
    public void user_go_on_toys_children_baby_and_baby()  {
        homePage.babyStore();
    }

    @Then("^user should be able to see baby store$")
    public void user_should_be_able_to_see_baby_store()  {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Assert.assertEquals(driver.findElement(By.xpath("//h1")).getText(),expected);
        System.out.println(expected);
    }
}
