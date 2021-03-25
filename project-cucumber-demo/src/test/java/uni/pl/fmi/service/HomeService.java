package uni.pl.fmi.service;

import java.awt.List;
import java.util.ArrayList;

import edu.emory.mathcs.backport.java.util.Arrays;
import uni.pu.fmi.Order;

public class HomeService {

	public static String home(String order) {
		ArrayList<Order> orders = clickOrder();
		
		return null;
	}
    public static ArrayList<Order> clickOrder(){
    	Order order = new Order();
    	order.clickOrder(order);
    	ArrayList<Order> orders = new ArrayList<Order>();
    	orders.add(order);
    	return orders;
    	
    }
}
