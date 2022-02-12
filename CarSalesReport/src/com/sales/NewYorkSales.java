package com.sales;

import java.util.ArrayList;
import java.util.List;

public class NewYorkSales  implements Car {
	private List<Sales> salesList = new ArrayList<Sales>();
   
	public void addSales(Sales emp)
    {
    	salesList.add(emp);
    }
	
	public void consolidateReport() {
		Texas ts = new Texas("BMW",10,2000000);
		Texas ts1 = new Texas("Benz",6,3200000);
		Texas ts2 = new Texas("Honda",3, 7000000);
		NewYorkSales tSales = new NewYorkSales();
		tSales.addSales(ts);
		tSales.addSales(ts1);
		tSales.addSales(ts2);
		tSales.generateReport("New York");
	}
	
	 public void generateReport(String city) 
	    {
	    	System.out.println(city+" Car Sales Report" );
	    	System.out.println("Car Model ====== Sold Count =====  Amount");
	        for(Sales s:salesList)
	        {
	            s.generateReport(city);
	        }
	        
	        System.out.println("Total Cost of all cars = 12500000");
	    }
}
	
	
     



