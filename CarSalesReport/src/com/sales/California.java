package com.sales;


public class California  implements Sales {
	
	
	private String carModel;
    private long numberOfCarsSold;
    private double totalAmountPerType;
      
    public California(String carModel, long numberOfCarsSold,double totalAmountPerType)
    {
        this.carModel = carModel;
        this.numberOfCarsSold = numberOfCarsSold;
        this.totalAmountPerType = totalAmountPerType;
    }
      
    @Override
    public void generateReport(String city) 
    {
        System.out.println(carModel+"               " +numberOfCarsSold+ "                " + totalAmountPerType );
    }
  
    
}
	
	
     



