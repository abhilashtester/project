package pageObject;





import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
 
public class FlightSearch  { 
 
	
WebDriver driver;
 public FlightSearch(WebDriver driver) {
 PageFactory.initElements(driver, this);
 this.driver=driver;
 

 }
 
 
 
 @FindBy(name="Departure airport") 
 private WebElement Departureairport;
 
 @FindBy(name="Arrival airport") 
 private WebElement Arrivalairport;

 @FindBy(xpath="//*[@id='panel0']/div/div/div/div[2]/section/div[4]/div[1]/div[3]/eol-datefield/eol-calendar/div/div/div[2]/table/tbody") 
 private WebElement DepDateCalLoc;

 @FindBy(xpath="//*[@id='panel0']/div/div/div/div[2]/section/div[4]/div[1]/div[3]/eol-datefield/eol-calendar/div/div/div[3]/table/tbody") 
 private WebElement ArrDateCalLoc;
 
 @FindBy(xpath="//*[@id='panel0']/div/div/div/div[2]/section/div[4]/div[2]/div[3]/form/button") 
 private WebElement SearchFligtBtn;
 
 
 @FindBy(xpath="//*[@class=ts-fbr-flight-list-row__header-core']") 
 private List<WebElement> fligtLists;
 
 
 public void clickOn_Cart() {
 //btn_Cart.click();
 }
 
 public void nevigatetosite() {
		
 }
 

 
 
 public void DeptArrivalFlight(String dept ,String arrival) throws InterruptedException{
	 
	 System.out.println("" +    dept);
	 
	 Departureairport.click();
	 Departureairport.sendKeys(dept);
	 Actions act =new Actions(driver);
	 act.moveToElement(driver.findElement(By.xpath("//*[@class=\"location__airport__city\"]"))).click();
	 act.build().perform();
	  Thread.sleep(20000);
	 //Arrivalairport.click();
	 Thread.sleep(4000);
	 System.out.println("" +    dept);
	 Arrivalairport.sendKeys(arrival);
	 act.moveToElement(driver.findElement(By.xpath("//*[@class=\"location__airport__city\"]"))).click();
	 act.build().perform();
	 
	//*[@class="location__airport__city"]

 }
 
 public void userEnterDepartureDate(String dept) throws InterruptedException{
	 
	 selecteDate(DepDateCalLoc,"31");

}
 
 public void userEnterArrivalDate(String arrival) throws InterruptedException{ 
	 selecteDate(ArrDateCalLoc,"9");
 }
 
 public void clickSearchflightBtn() throws InterruptedException{ 
	 SearchFligtBtn.click();
 }
 


 public void flightList() throws InterruptedException{
	 fligtLists.size();
	 Assert.assertTrue("Fligt list is not showing ", fligtLists.size()>0);
	
	 
	 
 }
 
 
//*[@class="ts-fbr-flight-list__header-title"]
 
//*[@class=" ts-fbr-flight-list-row__header-core"]
 
 
//*[@class='ts-fbr-flight-list-row__header-core']  

 
 
 
   public void selecteDate (WebElement DepDateCalLoc,String date )
 {
	 List<WebElement> columns = DepDateCalLoc.findElements(By.tagName("td"));
	 
	    //DatePicker is a table. Thus we can navigate to each cell
	    //and if a cell matches with the date you pass then we will click it.
		 System.out.println("columns.size()" +    columns.size());
	    for (WebElement cella: columns) {
	        if (cella.getText().equals(date)) {
	            cella.click();
	            break;
	        }
	    }

	    //Wait for 4 Seconds to see Today's date selected.
	    try {
	        Thread.sleep(4000);
	    } catch (InterruptedException e) {
	        e.printStackTrace();
	    }
 }
 
}