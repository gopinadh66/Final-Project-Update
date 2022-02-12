package com.sales;

import java.util.ArrayList;
import java.util.List;

public class CaliforniaSales  implements Car {
	private List<Sales> salesList = new ArrayList<Sales>();
   
	public void addSales(Sales emp)
    {
    	salesList.add(emp);
    }
	
	public void consolidateReport() {
		Texas ts = new Texas("BMW",5,1800000);
		Texas ts1 = new Texas("Benz",9,2700000);
		Texas ts2 = new Texas("Honda",2, 4000000);
		CaliforniaSales tSales = new CaliforniaSales();
		tSales.addSales(ts);
		tSales.addSales(ts1);
		tSales.addSales(ts2);
		tSales.generateReport("California");
	}
	
	 public void generateReport(String city) 
	    {
	    	System.out.println(city+" Car Sales Report" );
	    	System.out.println("Car Model ====== Sold Count =====  Amount");
	        for(Sales s:salesList)
	        {
	            s.generateReport(city);
	        }
	        
	        System.out.println("Total Cost of all cars = 8500000");
	    }
}
	
	
     



