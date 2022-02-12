package com.sales;

import java.util.ArrayList;
import java.util.List;

public class TexasSales  implements Car {
	private List<Sales> salesList = new ArrayList<Sales>();
   
	public void addSales(Sales emp)
    {
    	salesList.add(emp);
    }
	
	public void consolidateReport() {
		Texas ts = new Texas("BMW",10,1600000);
		Texas ts1 = new Texas("Benz",6,2300000);
		Texas ts2 = new Texas("Honda",3, 5100000);
		TexasSales tSales = new TexasSales();
		tSales.addSales(ts);
		tSales.addSales(ts1);
		tSales.addSales(ts2);
		tSales.generateReport("Texas");
	}
	
	 public void generateReport(String city) 
	    {
	    	System.out.println(city+" Car Sales Report" );
	    	System.out.println("Car Model ====== Sold Count =====  Amount");
	        for(Sales s:salesList)
	        {
	            s.generateReport(city);
	        }
	        
	        System.out.println("Total Cost of all cars = 9000000");
	    }
}
	
	
     



