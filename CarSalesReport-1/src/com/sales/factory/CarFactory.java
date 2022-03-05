package com.sales.factory;

public class CarFactory {

	public static Car areaSales(String city) {

		if ("Texas".equalsIgnoreCase(city)) {
			return new TexasSales();
		} else if ("New York".equalsIgnoreCase(city)) {
			return new NewYorkSales();
		} else if ("California".equalsIgnoreCase(city)) {
			return new CaliforniaSales();
		} 
		return null;
	}
}
