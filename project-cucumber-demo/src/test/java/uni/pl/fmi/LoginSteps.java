package uni.pl.fmi;

import static org.junit.Assert.assertEquals;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import uni.pl.fmi.models.LoginScreenModel;

public class LoginSteps {
	
	LoginScreenModel loginScreen= new LoginScreenModel();
	
     @Given("^������������ ������ ������ �� ���� � ���������$")
     public void openLoginScreen() throws Throwable {
    	 loginScreen.navigateToMe();
     }
     
     @When("^������������ ������ ������������� ��� \"([^\"]*)\"$")
     public void addUserName(final String username) throws Throwable{
    	 //throw new PendingException();
    	 loginScreen.setUsername(username);
     }
     
     @When("^������ ������ \"([^\"]*)\"$")
     public void addPassword(final String password) throws Throwable {
    	 //throw new PendingException();
    	 loginScreen.setPassword(password);
     }
     
     @When("^������� ����� ������ �� ���� � ���������$")
     public void clickLoginButton() throws Throwable {
    	 //throw new PendingException();
    	 loginScreen.clickLoginButton();
     }
     
     @Then("^����� ��������� \"([^\"]*)\"\\.$")
     public void checkLoginMessage(String expectedMessage) throws Throwable {
    	 //throw new PendingException();
    	 assertEquals(expectedMessage, loginScreen.getLoginMessage());
    	 
     }
     
}
