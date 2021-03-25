package uni.pl.fmi;

import static org.junit.Assert.assertEquals;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import uni.pl.fmi.models.HomeScreenModel;

public class StepsFeature {
	
	HomeScreenModel homeScreen= new HomeScreenModel();
	
   @Given("^������������ � � ��������� ��������$")
   public void openHomeScreen() throws Throwable {
	   homeScreen.navigateToMe();
   }
   
   @When("^������� ����� �� ��������� �� �������$")
   public void clickMakeOrder(final String order) throws Throwable {
	   homeScreen.clickOrder(order);
   }
   
   @When("^������ �� �������� � ������ �����$")
   public void openTypeBooks() throws Throwable {
	   homeScreen.openTypeBooks();
   }
   
   @When("^������� ����� �� ��������� �� �������$")
   public void clickButtonOrder() throws Throwable {
	   homeScreen.clickOrderButton();
   }
   
   @Then("^������� �� ��������� \"([^\"]*)\"$")
   public void messageForSuccess(String arg1) throws Throwable {
	   assertEquals("OK", homeScreen.getMessage());
   }
   
   @When("^������� ����� �� ���������� �� �������$")
   public void clickButtonFinish() throws Throwable {
	   homeScreen.clickButtonFinish();
   }
}
