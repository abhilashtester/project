
package StepDefinition;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;
import pageObject.FlightSearch;


public class FlightSearchStepDef {

	WebDriver driver;
	FlightSearch flight;

	@Given("^user is on Emirates site$")
	public void user_is_on_login_page() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Java Selenium\\ProjectCode\\BDDCucumberFramework\\drivers\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.emirates.com/ae/english/");

	}

	@Then("^user enter \"(.*)\" and \"(.*)\"$")
	public void userEnterDepartureAndArrivalAirport(String departure, String arrival) throws InterruptedException {
		System.out.println("userEnterDepartureAndArrivalAirports");
		flight = new FlightSearch(driver);
		flight.DeptArrivalFlight(departure, arrival);

	}

	@Then("^user enter Departure Date \"(.*)\"$")
	public void userEnterDepartureDate(String departureDate) throws InterruptedException {
		System.out.println("userEnterDepartureDate");
		flight = new FlightSearch(driver);
		flight.userEnterDepartureDate(departureDate);

	}

	@Then("^user enter Arrival Date \"(.*)\"$")
	public void userEnterArrivalDate(String arrivalDate) throws InterruptedException {
		System.out.println("userEnterArrivalDate");
		flight = new FlightSearch(driver);
		flight.userEnterArrivalDate(arrivalDate);

	}

	@Then("^Click on seach flight button$")
	public void searchflightBtn() throws InterruptedException {
		flight = new FlightSearch(driver);
		flight.clickSearchflightBtn();

	}

	@Then("^user is able to see the all flight list$")
	public void flightList() throws InterruptedException {
		Thread.sleep(10000);
		System.out.println("userEnterDepartureAndArrivalAirports");
		flight.flightList();

	}
	
	@Then("^close the browser$")
	public void closebrowser() throws InterruptedException {
		driver.quit();

	}
	
	
	

}
