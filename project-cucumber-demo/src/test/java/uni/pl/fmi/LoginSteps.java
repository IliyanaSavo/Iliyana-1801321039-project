package uni.pl.fmi;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginSteps {
     @Given("^������������ ������ ������ �� ���� � ���������$")
     public void openLoginScreen() throws Throwable {
    	 
     }
     
     @When("^������������ ������ ������������� ��� \"([^\"]*)\"$")
     public void addUserName(String arg1) throws Throwable{
    	 throw new PendingException();
     }
     
     @When("^������ ������ \"([^\"]*)\"$")
     public void addPassword(String arg1) throws Throwable {
    	 throw new PendingException();
     }
     
     @When("^������� ����� ������ �� ���� � ���������$")
     public void clickLoginButton() throws Throwable {
    	 throw new PendingException();
     }
     
     @Then("^����� ��������� �� ������� ������� � ���������$")
     public void checkLoginMessage() throws Throwable {
    	 throw new PendingException();
     }
}
