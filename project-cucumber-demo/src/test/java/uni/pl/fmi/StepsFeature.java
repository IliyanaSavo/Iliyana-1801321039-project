package uni.pl.fmi;

import static org.junit.Assert.assertEquals;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import uni.pl.fmi.models.HomeScreenModel;

public class StepsFeature {
	
	HomeScreenModel homeScreen= new HomeScreenModel();
	
   @Given("^Потребителят е в началната страница$")
   public void openHomeScreen() throws Throwable {
	   homeScreen.navigateToMe();
   }
   
   @When("^Натиска бутон за създаване на поръчка$")
   public void clickMakeOrder(final String order) throws Throwable {
	   homeScreen.clickOrder(order);
   }
   
   @When("^Отваря се страница с видове книги$")
   public void openTypeBooks() throws Throwable {
	   homeScreen.openTypeBooks();
   }
   
   @When("^Натиска бутон за създаване на поръчка$")
   public void clickButtonOrder() throws Throwable {
	   homeScreen.clickOrderButton();
   }
   
   @Then("^Появява се съобщение \"([^\"]*)\"$")
   public void messageForSuccess(String arg1) throws Throwable {
	   assertEquals("OK", homeScreen.getMessage());
   }
   
   @When("^Натиска бутон за завършване на поръчка$")
   public void clickButtonFinish() throws Throwable {
	   homeScreen.clickButtonFinish();
   }
}
