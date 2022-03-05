package com.sales.composite;

public class California  implements Sales {
	
	
	private String carModel;
    private int numberOfCarsSold;
    private double totalAmountPerType;
      
    public California(String carModel, int numberOfCarsSold,double totalAmountPerType)
    {
        this.carModel = carModel;
        this.numberOfCarsSold = numberOfCarsSold;
        this.totalAmountPerType = totalAmountPerType;
    }
      
    @Override
    public void generateReport() 
    {
        System.out.println(carModel+"                  " +numberOfCarsSold+ "         " + totalAmountPerType );
    }
  
    
}
	
	
     



