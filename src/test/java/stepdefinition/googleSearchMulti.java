package stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import com.sourav.base.TestBase;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import io.cucumber.datatable.DataTable;

import java.io.IOException;
import java.util.List;

public class googleSearchMulti extends TestBase {

    private List<String> searchTerms;
    
    

    @Given("I am on Google search Page")
    public void i_am_on_google_search_page_Multi() throws IOException {
        if (driver == null) {
            setUp();
        }
        driver.get("https://www.google.com");
        
    }

    @When("I enter the following search terms in search box")
    public void i_enter_the_following_search_terms_in_search_box(DataTable dataTable) {
        searchTerms = dataTable.asList(String.class);
        for (String searchTerm : searchTerms) {
            driver.findElement(By.name("q")).clear();
            driver.findElement(By.name("q")).sendKeys(searchTerm);
            driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
        }
    }

   
    @Then("search results should appear for the following search terms")
    public void search_results_should_appear_for_the_following_search_terms() {
    	
       System.out.println("successfully searched");
    }
}
