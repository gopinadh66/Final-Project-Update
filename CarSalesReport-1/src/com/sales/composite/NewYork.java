package com.sales.composite;

public class NewYork  implements Sales {
	
	
	private String carModel;
    private long numberOfCarsSold;
    private double totalAmountPerType;
      
    public NewYork(String carModel, long numberOfCarsSold,double totalAmountPerType)
    {
        this.carModel = carModel;
        this.numberOfCarsSold = numberOfCarsSold;
        this.totalAmountPerType = totalAmountPerType;
    }
      
    @Override
    public void generateReport() 
    {
        System.out.println(carModel+"              " +numberOfCarsSold+ "              " + totalAmountPerType );
    }
  
    
}
	
	
     



