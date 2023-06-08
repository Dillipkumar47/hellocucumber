package stepdefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class IsItFridayTest {

    private String today;
    private String actualAnswer;

    @Given("today is {string}")
    public void todayIs(String inputDay) {
        this.today=inputDay;
    }

    @When("I ask whether it's Friday yet")
    public void iAskWhetherItSFridayYet() {
        this.actualAnswer=answerDay(this.today);
    }

    @Then("I should be told {string}")
    public void iShouldBeTold(String expectedAnswer) {
        assertEquals(expectedAnswer,actualAnswer);
    }

    private String answerDay(String today){
        return "Friday".equals(today) ? "TGIF" : "Nope";
    }

}
