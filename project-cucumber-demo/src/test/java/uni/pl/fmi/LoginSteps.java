package uni.pl.fmi;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginSteps {
     @Given("^Потребителят отваря екрана за вход в системата$")
     public void openLoginScreen() throws Throwable {
    	 
     }
     
     @When("^Потребителят въведе потребителско име \"([^\"]*)\"$")
     public void addUserName(String arg1) throws Throwable{
    	 throw new PendingException();
     }
     
     @When("^Въведе парола \"([^\"]*)\"$")
     public void addPassword(String arg1) throws Throwable {
    	 throw new PendingException();
     }
     
     @When("^Натисне върху бутона за вход в системата$")
     public void clickLoginButton() throws Throwable {
    	 throw new PendingException();
     }
     
     @Then("^Вижда съобщение за успешно влизане в системата$")
     public void checkLoginMessage() throws Throwable {
    	 throw new PendingException();
     }
}
