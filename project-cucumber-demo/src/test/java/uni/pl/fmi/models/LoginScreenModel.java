package uni.pl.fmi.models;

import uni.pl.fmi.service.LoginService;

public class LoginScreenModel {

	private String username;
	private String password;
	private String message;

	public void navigateToMe() {
		System.out.println("������� �� ���� � ��������� � �������.");
		
	}

	public void setUsername(final String username) {
		this.username = username;
		
	}

	public void setPassword(final String password) {
		this.password = password;
		
	}

	public void clickLoginButton() {
		
		message = LoginService.login(username, password);
	}

	public String getLoginMessage() {
		
		// TODO Auto-generated method stub
		return message;
	}

}
