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

public class googleSearchSingle extends TestBase {

    @When("I enter the following {string} in search box as single")
    public void i_enter_the_following_searchTerm_in_search_box_as_single(String searchTerm) {
        driver.findElement(By.xpath("//textarea[@name='q']")).sendKeys(searchTerm);
        driver.findElement(By.xpath("//textarea[@name='q']")).sendKeys(Keys.ENTER);
    }
   
}
