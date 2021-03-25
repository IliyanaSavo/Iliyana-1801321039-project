package uni.pl.fmi.models;

import uni.pl.fmi.service.HomeService;

public class HomeScreenModel {
	
	private String message;
	private String order;

	public void navigateToMe() {
		System.out.println("Екранът на начало е отворен.");
		
	}

	public void clickOrder(String order) {
		this.order = order;
		
	}

	public void openTypeBooks() {
		System.out.println("Изберете книги");
		
	}
	
	public void clickOrderButton() {
		message = HomeService.home(order);
		
	}

	public String getMessage() {
		
		// TODO Auto-generated method stub
		return message;
	}

	public void clickButtonFinish() {
		
		message = HomeService.home(order);
	}

	

}
