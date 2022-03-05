package com.sales.factory;

import java.util.ArrayList;
import java.util.List;

import com.sales.command.NewCarSales;
import com.sales.command.OldCarSales;
import com.sales.command.SalesCommand;
import com.sales.composite.Sales;
import com.sales.composite.Texas;

public class TexasSales  implements Car {
	private List<Sales> salesList = new ArrayList<Sales>();
   
	public void addSales(Sales emp)
    {
    	salesList.add(emp);
    }
	
	public void consolidateReport() {
		System.out.println("                                      Texas Car Sales Report");
		SalesCommand oldSales = new OldCarSales();
		SalesCommand newSales = new NewCarSales();
		TexasSales tOldSales = new TexasSales();
		TexasSales tNewSales = new TexasSales();
		int totalOldCarsSold = 0;
		int totalNewCarsSold = 0;
		double totalOldCarsAmount = 0;
		double totalNewCarsAmount = 0;
		for (String model : getModelsList()) {
			String oldData = oldSales.execute("Texas", model);
			String newData = newSales.execute("Texas", model);

			String[] oldSplitData = oldData.split("-");
			String[] newSplitData = newData.split("-");
			totalOldCarsSold = totalOldCarsSold + Integer.parseInt(oldSplitData[0]);
			totalNewCarsSold = totalNewCarsSold + Integer.parseInt(newSplitData[0]);
			totalOldCarsAmount = totalOldCarsAmount + Double.parseDouble(oldSplitData[1]);
			totalNewCarsAmount = totalNewCarsAmount + Double.parseDouble(newSplitData[1]);
			tOldSales.addSales(
					new Texas(model, Integer.parseInt(oldSplitData[0]), Double.parseDouble(oldSplitData[1])));
			tNewSales.addSales(
					new Texas(model, Integer.parseInt(newSplitData[0]), Double.parseDouble(newSplitData[1])));
		}

		System.out.println("Old Car Sales Report");
		tOldSales.generateReport(totalOldCarsSold, totalOldCarsAmount);
		System.out.println("");
		System.out.println("New Car Sales Report");
		tNewSales.generateReport(totalNewCarsSold, totalNewCarsAmount);
		System.out.println("");
	}
	
	public void generateReport(int carsSold, double totalAmount) 
    {
    	System.out.println("Car Model ====== Cars Sold =====  Amount");
        for(Sales s:salesList)
        {
            s.generateReport();
        }
        
        System.out.println("Total cars sold = "+carsSold);
        System.out.println("Total Cost of all cars = "+totalAmount);
    }

	private List<String> getModelsList() {
			List<String> modelsList = new ArrayList<String>();
			modelsList.add("BMW  ");
			modelsList.add("Benz ");
			modelsList.add("Honda");
			return modelsList;
	 }

}
	
	
     


