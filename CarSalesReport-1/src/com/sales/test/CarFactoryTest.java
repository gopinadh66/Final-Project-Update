package com.sales.test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.sales.factory.CaliforniaSales;
import com.sales.factory.Car;
import com.sales.factory.CarFactory;
import com.sales.factory.NewYorkSales;
import com.sales.factory.TexasSales;

public class CarFactoryTest {

	@Test
	public void chooseCompanyCaliforniaSalesTest() {
		CarFactory cof = new CarFactory();
		Car co = CarFactory.areaSales("California");
		assertNotNull(co);
		assertTrue(co instanceof CaliforniaSales);
	}

	@Test
	public void chooseCompanddyTexasSalesTest() {
		CarFactory cof = new CarFactory();
		Car co = CarFactory.areaSales("Texas");
		assertNotNull(co);
		assertTrue(co instanceof TexasSales);
	}

	@Test
	public void chooseCompanyNewYorkSalesTest() {
		CarFactory cof = new CarFactory();
		Car co = CarFactory.areaSales("New York");
		assertNotNull(co);
		assertTrue(co instanceof NewYorkSales);
	}

}
