package com.sales;

public class CarSalesDemo   {
	    
		public static void main(String[] args) {
			
			Car c = new CarFactory().areaSales("Texas");
			c.consolidateReport();
			
			System.out.println();
			Car c1 = new CarFactory().areaSales("New York");
			c1.consolidateReport();
			
			System.out.println();
			Car c2 = new CarFactory().areaSales("California");
			c2.consolidateReport();
		}
	        
}