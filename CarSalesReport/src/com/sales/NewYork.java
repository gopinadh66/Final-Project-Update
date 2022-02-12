package com.sales;

import java.util.ArrayList;
import java.util.List;

public class NewYork  implements Sales {
	
	
	private String carModel;
    private long numberOfCarsSold;
    private double totalAmountPerType;
    private double totalAmount;
      
    public NewYork(String carModel, long numberOfCarsSold,double totalAmountPerType)
    {
        this.carModel = carModel;
        this.numberOfCarsSold = numberOfCarsSold;
        this.totalAmountPerType = totalAmountPerType;
      //  this.totalAmount = totalAmount;
    }
      
    @Override
    public void generateReport(String city) 
    {
        System.out.println(carModel+"               " +numberOfCarsSold+ "                " + totalAmountPerType );
    }
  
    
}
	
	
     



