package com.example.demo;
import com.example.demo.services.PathService;
import io.cucumber.java.PendingException;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.jupiter.api.Assertions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"pretty"})
public class RunCucumberTest {

    char[][] gridTest;
    PathService pathService = new PathService();
    int path = 0;
    @Given("I have a path$")
    public void I_have_a_path() throws Exception {
        gridTest = new char[][]{
                {'1', '0', '0', '0', '0'},
                {'1', '0', '0', '0', '0'},
                {'1', '0', '0', '0', '0'},
                {'1', '1', '1', '0', '0'},
                {'0', '0', '1', '1', '1'}
        };
        throw new PendingException();
    }

    @When("start to find the shortest path$")
    public void start_to_find_the_shortest_path() throws Exception {
        path = pathService.minDistance(gridTest);
        throw new PendingException();
    }

    @Then("the shortest path is (\\d+)$")
    public void the_shortest_path_is(int result) throws Exception {
        Assertions.assertEquals(path, result);
        throw new PendingException();
    }
}
