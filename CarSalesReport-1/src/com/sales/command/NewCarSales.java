package com.sales.command;

public class NewCarSales implements SalesCommand {

	public String execute(String city, String model) {
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
		double totalCost;
		if ("California".equalsIgnoreCase(city)) {
			if ("BMW  ".equalsIgnoreCase(model)) {
				carsSold = 6;
				totalCost = carsSold * 721900;
				return carsSold + "-" + totalCost;
			} else if ("Benz ".equalsIgnoreCase(model)) {
				carsSold = 5;
				totalCost = carsSold * 845040;
				return carsSold + "-" + totalCost;
			} else if ("Honda".equalsIgnoreCase(model)) {
				carsSold = 3;
				totalCost = carsSold * 464380;
				return carsSold + "-" + totalCost;
			}
		} else if ("Texas".equalsIgnoreCase(city)) {
			if ("BMW  ".equalsIgnoreCase(model)) {
				carsSold = 2;
				totalCost = carsSold * 731905;
				return carsSold + "-" + totalCost;
			} else if ("Benz ".equalsIgnoreCase(model)) {
				carsSold = 7;
				totalCost = carsSold * 675090;
				return carsSold + "-" + totalCost;
			} else if ("Honda".equalsIgnoreCase(model)) {
				carsSold = 2;
				totalCost = carsSold * 564370;
				return carsSold + "-" + totalCost;
			}
		}else if ("NewYork".equalsIgnoreCase(city)) {
			if ("BMW  ".equalsIgnoreCase(model)) {
				carsSold = 4;
				totalCost = carsSold * 921900;
				return carsSold + "-" + totalCost;
			} else if ("Benz ".equalsIgnoreCase(model)) {
				carsSold = 3;
				totalCost = carsSold * 745040;
				return carsSold + "-" + totalCost;
			} else if ("Honda".equalsIgnoreCase(model)) {
				carsSold = 5;
				totalCost = carsSold * 764380;
				return carsSold + "-" + totalCost;
			}
		}

		return null;
	}

}
