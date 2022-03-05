package com.sales;

import java.util.ArrayList;
import java.util.Iterator;

import com.sales.factory.Car;
import com.sales.factory.CarFactory;

public class CarSalesDemo   {
	
	 private ArrayList<String> getDisplayOptions() {
			ArrayList<String> ccn = new ArrayList<String>();
			ccn.add("Texas");
			ccn.add("New York");
			ccn.add("California");
			return ccn;
		}
	    
		public static void main(String[] args) {
			CarSalesDemo csd = new CarSalesDemo();
			CarSalesReport sales = new CarSalesReport();
			if(sales.isDisplayReport()) {
				SalesIterator iterator = new SalesIterator(csd.getDisplayOptions());
				while(iterator.hasNext()) {
					String display = (String)iterator.next();
					Car c = new CarFactory().areaSales(display);
					c.consolidateReport();
					System.out.println();
				}
				
			}else {
				System.out.println("No Report will be displayed. Thank you!!!");
			}
		}
	        
}