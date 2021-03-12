package uni.pl.fmi.service;

import java.util.ArrayList;
import java.util.List;

import uni.pu.fmi.User;

public class LoginService {

	public static String login(String username, String password) {
		
		
		if(username == null && password == null) {
			return "�������� ������������� ��� � ������";
		}
		if(username == null) {
			return "�������� ������������� ���";
		}
		if(password == null) {
			return "�������� ������";
		}
		
		List<User> users = getUsers();
		
		boolean isUserExist = users.stream().anyMatch(user ->
		(user.getUsername().equals(username)
		&& user.getPassword().equals(password)));
		return isUserExist?"OK":"������ ������������� �����";
	}
	
	public static List<User> getUsers(){
		User user = new User();
		user.setUsername("Iliyana");
		user.setPassword("Iliyana1234");
		ArrayList<User> users = new ArrayList<User>();
		users.add(user);
		return users;
	}

}
