package com.sales;

import java.util.ArrayList;
import java.util.List;

public class Texas  implements Sales {
	
	
	private String carModel;
    private long numberOfCarsSold;
    private double totalAmountPerType;
    private double totalAmount;
      
    public Texas(String carModel, long numberOfCarsSold,double totalAmountPerType)
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
	
	
     



