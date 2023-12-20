package stepdefs;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

import static stepdefs.GetWebDriver.driver;

public class CheckInternetConnectivity {


    @Given("User launches google homepage on chrome browser")
    public void user_launches_google_homepage_on_chrome_browser() {
        // Write code here that turns the phrase above into concrete actions
        driver.get("https://www.google.com");
        System.out.println(driver.getTitle());



    }
    @When("User searches for Animal Pictures")
    public void user_searches_for_animal_pictures() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Searching for Animal Pics");
    }
    @Then("User is presented with Multiple photos of Animals")
    public void user_is_presented_with_multiple_photos_of_animals() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Found Animal Pics");
    }

}
