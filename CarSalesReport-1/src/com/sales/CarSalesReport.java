package com.sales;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class CarSalesReport {
	
	String selectItem = "";
	
	 public SalesIterator createIterator() {
	        return new SalesIterator(getDisplayOptions());
	    }
	
	public boolean isDisplayReport() {
		Scanner itemScanner = new Scanner(System.in); 
        System.out.println("Do you want to display Car Sales Report area wise. ");
			int i =1;
			SalesIterator iterator = createIterator();
			while(iterator.hasNext()) {
				String display = (String)iterator.next();
				System.out.println(i+" "+display);
				i = i+1;
			}
			
			switch(itemScanner.nextInt()) {
			case 1: selectItem = "yes";
			        break;
			case 2: selectItem = "no";
	        		break;
				
			}
		
		if("yes".equalsIgnoreCase(selectItem)) {
		   return true;	
		}else {
			return false;
		}
		
	}
	
	private ArrayList<String> getDisplayOptions() {
		ArrayList<String> ccn = new ArrayList<String>();
		ccn.add("Yes");
		ccn.add("No");
		return ccn;
	}
	
}
