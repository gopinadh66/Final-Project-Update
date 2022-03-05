package com.sales.test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.sales.CarSalesReport;

public class CarSalesReportTest {

	@Test
	public void isDisplayReportTest() {
		CarSalesReport csReport = new CarSalesReport();
		boolean csr = csReport.isDisplayReport();
		assertNotNull(csReport);
		if (csr) {
			assertTrue(csr);
		} else {
			assertFalse(csr);
		}
	}

}
