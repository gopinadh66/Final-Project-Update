package com.sales.command;

public class OldCarSales implements SalesCommand {

	public String execute(String city, String model) {
		String output = "";

		if ("California".equalsIgnoreCase(city)) {
			return getSalesReport(city, model);
		} else if ("Texas".equalsIgnoreCase(city)) {
			return getSalesReport(city, model);
		}else if ("NewYork".equalsIgnoreCase(city)) {
			return getSalesReport(city, model);
		}

		return null;
	}

	private String getSalesReport(String city, String model) {
		int carsSold;
		long totalCost;
		long carCost;
		if ("California".equalsIgnoreCase(city)) {
			if ("BMW  ".equalsIgnoreCase(model)) {
				carsSold = 6;
				carCost = 386730;
				totalCost = carsSold * carCost;
				return carsSold + "-" + totalCost;
			} else if ("Benz ".equalsIgnoreCase(model)) {
				carsSold = 5;
				totalCost = carsSold * 506650;
				return carsSold + "-" + totalCost;
			} else if ("Honda".equalsIgnoreCase(model)) {
				carsSold = 8;
				totalCost = carsSold * 517395;
				return carsSold + "-" + totalCost;
			}
		} else if ("Texas".equalsIgnoreCase(city)) {

			if ("BMW  ".equalsIgnoreCase(model)) {
				carsSold = 3;
				carCost = 386730;
				totalCost = carsSold * carCost;
				return carsSold + "-" + totalCost;
			} else if ("Benz ".equalsIgnoreCase(model)) {
				carsSold = 4;
				totalCost = carsSold * 706650;
				return carsSold + "-" + totalCost;
			} else if ("Honda".equalsIgnoreCase(model)) {
				carsSold = 6;
				totalCost = carsSold * 587395;
				return carsSold + "-" + totalCost;
			}
		
		}else if ("NewYork".equalsIgnoreCase(city)) {

			if ("BMW  ".equalsIgnoreCase(model)) {
				carsSold = 7;
				carCost = 386730;
				totalCost = carsSold * carCost;
				return carsSold + "-" + totalCost;
			} else if ("Benz ".equalsIgnoreCase(model)) {
				carsSold = 10;
				totalCost = carsSold * 306650;
				return carsSold + "-" + totalCost;
			} else if ("Honda".equalsIgnoreCase(model)) {
				carsSold = 3;
				totalCost = carsSold * 587395;
				return carsSold + "-" + totalCost;
			}
		
		}

		return null;
	}

}
